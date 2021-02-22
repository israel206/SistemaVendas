/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleDataVenc {
    
    ConectaBanco connex = new ConectaBanco();
    
    public void SalvarData(String data){
        connex.conexao();
        try {
            PreparedStatement pst = connex.conn.prepareStatement("insert into vencimento(datavenc) values(?)");
            pst.setString(1, data);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastro data com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção da data!\nERRO:" + ex);
        }
        connex.desconecta();
    }
    
}
