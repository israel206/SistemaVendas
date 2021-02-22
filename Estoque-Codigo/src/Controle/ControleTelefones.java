/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModeloTelefones;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleTelefones {
    
    ConectaBanco connTelefone = new ConectaBanco();
    ModeloTelefones mod = new ModeloTelefones();
    
    public void inserir(ModeloTelefones mod){
        connTelefone.conexao();
        try {
            PreparedStatement pst = connTelefone.conn.prepareStatement("insert into telefones(numero_tel)values(?)");
            pst.setString(1, mod.getTelefone());
            pst.execute();
            JOptionPane.showMessageDialog(null, "telefone inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados: \n ERRO:" + ex);
        }
        connTelefone.desconecta();
    
    }
    public void alterar(ModeloTelefones mod){
        connTelefone.conexao();
        try {
            PreparedStatement pst = connTelefone.conn.prepareStatement("update telefones set numero_tel = ? where id_telefone=?");
            pst.setString(1, mod.getTelefone());
            pst.setInt(2, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "telefone alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em alterar dados: \n ERRO:" + ex);
        }
        connTelefone.desconecta();
    }
    public void excluir(ModeloTelefones mod){
        connTelefone.conexao();
        // outra forma de declarar
        PreparedStatement pst;
        try {
            pst = connTelefone.conn.prepareStatement("delete from telefones where id_telefone=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "telefone Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados: \n ERRO:" + ex);
        }
        connTelefone.desconecta();
    }
    public ModeloTelefones primeiro(){
        connTelefone.conexao();
        connTelefone.executaSQL("select * from telefones");
        try {
            connTelefone.rs.first();
            mod.setCodigo(connTelefone.rs.getInt("id_telefone"));
            mod.setTelefone(connTelefone.rs.getString("numero_tel"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro primeiro dados: \n ERRO:" + ex);
        }
        connTelefone.desconecta();
        return mod;
    }
    public ModeloTelefones ultimo(){
        connTelefone.conexao();
        connTelefone.executaSQL("select * from telefones");
        try {
            connTelefone.rs.last();
            mod.setCodigo(connTelefone.rs.getInt("id_telefone"));
            mod.setTelefone(connTelefone.rs.getString("numero_tel"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ultimo dados: \n ERRO:" + ex);
        }
        connTelefone.desconecta();
        return mod;
    }
    public ModeloTelefones anterior(){
        connTelefone.conexao();
        //connTelefone.executaSQL("select * from telefones");
        try {
            connTelefone.rs.previous();
            mod.setCodigo(connTelefone.rs.getInt("id_telefone"));
            mod.setTelefone(connTelefone.rs.getString("numero_tel"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro proximo dados: \n ERRO:" + ex);
        }
        connTelefone.desconecta();
        return mod;
    }
    public ModeloTelefones proximo(){
        connTelefone.conexao();
        //connTelefone.executaSQL("select * from telefones");
        try {
            connTelefone.rs.next();
            mod.setCodigo(connTelefone.rs.getInt("id_telefone"));
            mod.setTelefone(connTelefone.rs.getString("numero_tel"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro proximo dados: \n ERRO:" + ex);
        }
        connTelefone.desconecta();
        return mod;
    }
    
}
