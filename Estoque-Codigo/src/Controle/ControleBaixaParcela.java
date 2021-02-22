/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModeloBaixaParcela;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleBaixaParcela {
    
    ConectaBanco connBaixa = new ConectaBanco();
    
    public ModeloBaixaParcela Buscaparcela(ModeloBaixaParcela mod){
        connBaixa.conexao();
        try {
            connBaixa.executaSQL("select * from parcela_vendas where id_parc_venda=" + mod.getCodParc());
            connBaixa.rs.first();
            mod.setCodParc(connBaixa.rs.getInt("id_parc_venda"));
            mod.setCodVenda(connBaixa.rs.getInt("cod_venda"));
            mod.setDatavenc(connBaixa.rs.getString("datavenc"));
            mod.setValor(connBaixa.rs.getFloat("valor_parce"));
            return mod;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar parcelas!\nERRO:" + ex);
        }
        connBaixa.desconecta();
        return mod; 
    }
    public void BaixarParcela(ModeloBaixaParcela mod){
        connBaixa.conexao();
        connBaixa.executaSQL("select * from parcela_vendas where id_parc_venda= " + mod.getCodParc() + " and estado='PG'");
        try {
            if(connBaixa.rs.first()){
                JOptionPane.showMessageDialog(null, "Está parcela já está paga!!");
            } else{
                try {
                    PreparedStatement pst = connBaixa.conn.prepareStatement("update parcela_vendas set estado=? where id_parc_venda=?");
                    pst.setString(1, "PG");
                    pst.setInt(2, mod.getCodParc());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Parcela baixada com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao dar baixa na parcela!\nERRO:" + ex);
                }
                connBaixa.desconecta();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleBaixaParcela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
