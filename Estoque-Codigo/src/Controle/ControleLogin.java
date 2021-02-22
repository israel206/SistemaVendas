/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModeloLogin;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleLogin {
    
    ConectaBanco connLogin  = new ConectaBanco();
    ModeloLogin modLogin = new ModeloLogin();
    //Usando 
    
    
    public void Salvar(ModeloLogin mod){
        connLogin.conexao();
        
        ////----------------------------------CRYPTOGRAFANDO SENHA------------------------------------------////
        //variavel criptoSenha receber ou pega do campo senha(mod.getSenha())
        String cryptoSenha;
        cryptoSenha = mod.getSenha();
        
        //Intrunsção de tratamento de erro
        try {
            
            //cryptografando senha
            //Com o algoritmo SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            // Nova linha
            md.update(cryptoSenha.getBytes(), 0, cryptoSenha.length());
            //Pegando um Array de Byte
            byte[] messageDigest = md.digest(cryptoSenha.getBytes("UTF-8"));
            
            //Passando para String o Array de byte
            StringBuilder sb = new StringBuilder();
            
            //Utilizando o for para concartenar as String
            for(byte b : messageDigest){
                //Mascara de formatação para não houver números negativos
                sb.append(String.format("%02X", 0xFF & b)); 
            }
            // A variavel senhaHex vai pegar toda a senha cryptografa e já convertida para String e concartenada
            String senhaHex = sb.toString();
           ////----------------------------------////------------------------------------------////
           
           
            PreparedStatement pst = connLogin.conn.prepareStatement("insert into login(nome_login,salt_senha,senha_login,permissao,login)values(?,?,?,?,?)");
            pst.setString(1, mod.getNomeCompleto());
            
            //Agora salvando no banco a senhaHex
            //pst.setString(2, senhaHex);
            
            //2-utlizando outro metodo
            pst.setString(2, Calendar.getInstance().getTime().toString() + "@#$%!&¨*?");
            pst.setString(3, senhaHex + mod.getSalt());
            //pst.setString(3, CriptoSenha.HashFunctions(senhaHex + mod.getSalt()));
            ///////
            
            pst.setString(4, mod.getPermissao());
            pst.setString(5, mod.getLogin());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir usuário!\nERRO:"+ ex);
            
           //tratamento de Erro de senha com try catch
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ControleLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ControleLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Alterar(ModeloLogin mod){
        connLogin.conexao();
        try {
            PreparedStatement pst = connLogin.conn.prepareStatement("update login set nome_login=?,senha_login=?,permissao=?,login=? where id_login=?");
            pst.setString(1, mod.getNomeCompleto());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getPermissao());
            pst.setString(4, mod.getLogin());
            pst.setInt(5, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuário alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar o usuário!\nERRO:"+ ex);
        }
        connLogin.desconecta();
    }
    
    public void Excluir(ModeloLogin mod){
        connLogin.conexao();
        try {
            PreparedStatement pst = connLogin.conn.prepareStatement("delete from login where id_login=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuário excluindo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir usuário!\nERRO:"+ ex);
        }
        
    }
    public ModeloLogin Primeiro(){
        connLogin.conexao();
        try {
            connLogin.executaSQL("select * from login");
            connLogin.rs.first();
            modLogin.setId(connLogin.rs.getInt("id_login"));
            modLogin.setLogin(connLogin.rs.getString("login"));
            modLogin.setNomeCompleto(connLogin.rs.getString("nome_login"));
            modLogin.setPermissao(connLogin.rs.getString("permissao"));
            modLogin.setSenha(connLogin.rs.getString("senha_login"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao setar o primeiro registro!\nERRO:"+ ex);
        }
        //connLogin.desconecta();
        return modLogin;
    }
    public ModeloLogin Anterior(){
        //connLogin.conexao();
        try {
            //connLogin.executaSQL("select * from login");
            connLogin.rs.previous();
            modLogin.setId(connLogin.rs.getInt("id_login"));
            modLogin.setLogin(connLogin.rs.getString("login"));
            modLogin.setNomeCompleto(connLogin.rs.getString("nome_login"));
            modLogin.setPermissao(connLogin.rs.getString("permissao"));
            modLogin.setSenha(connLogin.rs.getString("senha_login"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao setar o primeiro registro!\nERRO:"+ ex);
        }
        //connLogin.desconecta();
        return modLogin;
    }
    public ModeloLogin Proximo(){
        //connLogin.conexao();
        try {
            //connLogin.executaSQL("select * from login");
            connLogin.rs.next();
            modLogin.setId(connLogin.rs.getInt("id_login"));
            modLogin.setLogin(connLogin.rs.getString("login"));
            modLogin.setNomeCompleto(connLogin.rs.getString("nome_login"));
            modLogin.setPermissao(connLogin.rs.getString("permissao"));
            modLogin.setSenha(connLogin.rs.getString("senha_login"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao setar o primeiro registro!\nERRO:"+ ex);
        }
        //connLogin.desconecta();
        return modLogin;
    }
    public ModeloLogin Ultimo(){
        connLogin.conexao();
        try {
            connLogin.executaSQL("select * from login");
            connLogin.rs.last();
            modLogin.setId(connLogin.rs.getInt("id_login"));
            modLogin.setLogin(connLogin.rs.getString("login"));
            modLogin.setNomeCompleto(connLogin.rs.getString("nome_login"));
            modLogin.setPermissao(connLogin.rs.getString("permissao"));
            modLogin.setSenha(connLogin.rs.getString("senha_login"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao setar o primeiro registro!\nERRO:"+ ex);
        }
        //connLogin.desconecta();
        return modLogin;
    }
    
}
