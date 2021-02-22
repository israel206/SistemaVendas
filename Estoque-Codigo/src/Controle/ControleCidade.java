/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModeloCidade;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Mr-Robot
 */
public class ControleCidade {
    
    ConectaBanco connCidade = new ConectaBanco();
    
    public void InserirCidade(ModeloCidade mod){
        connCidade.conexao();
        try {
            PreparedStatement pst = connCidade.conn.prepareStatement("insert into cidades(nome_cidades, id_estado)values(?,?)");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCod_estado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro na inserção dos dados. \n ERRO:" + ex);
        }
        connCidade.desconecta();
    }
    
    public void ExcluirCidade(ModeloCidade mod){
        connCidade.conexao();
        try {
            PreparedStatement pst = connCidade.conn.prepareStatement("delete from cidades where id_cidade=?");
            pst.setInt(1, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados. \n ERRO:" + ex);
        }
        connCidade.desconecta();
    }
    
    public void alteraCidades(ModeloCidade mod){
        connCidade.conexao();
        try {
            PreparedStatement pst = connCidade.conn.prepareStatement("update cidades set nome_cidades = ?, id_estado = ? where id_cidade = ?");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCod_estado());
            pst.setInt(3, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração dos dados. \n ERRO:" + ex);
        }
        connCidade.desconecta();
    }
   
    
}
