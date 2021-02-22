/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModeloParcelamentoVenda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleParcelamentoVenda {
    
    ConectaBanco connParcelamento = new ConectaBanco();
    
    public void SalvarParcela(ModeloParcelamentoVenda mod){
        connParcelamento.conexao();
        try {
            PreparedStatement pst = connParcelamento.conn.prepareStatement("insert into parcela_vendas (cod_venda, valor_venda, valor_total, valor_parce, numero_parcela, datavenc)values(?,?,?,?,?,?)");
            pst.setInt(1, mod.getCodVenda());
            pst.setFloat(2, mod.getValor_venda());
            pst.setFloat(3, mod.getValor_total());
            pst.setFloat(4, mod.getValorParcela());
            pst.setInt(5, mod.getNumeroParc());
            pst.setString(6, mod.getDataVenc());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar as parcelas\nERRO:" +ex);
        }
        connParcelamento.desconecta();
    }
    
}
