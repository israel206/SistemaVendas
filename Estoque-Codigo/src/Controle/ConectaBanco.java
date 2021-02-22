/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Mr-Robot
 */
public class ConectaBanco {
    
    public Statement stm; // responsavél por prepara e realizar pesquisas no banco de dados
    public ResultSet rs; //responsavél por armazenar o resultado de uma pesquisa passada para o statement
    private String driver = "org.postgresql.Driver"; //responsavél por identificar o serviço de banco de dados
    private String caminho = "jdbc:postgresql://localhost:5432/sistemavendas"; // responsavél por setar o local do banco de dados
    private String usuario = "postgres";
    private String senha = "postgres";
    public Connection conn; //responsavél por realizar a conexão com o banco de dados
    
    //metodos de conexão com suas propriedades
    public void conexao(){ //método responsavél por realizar a conexão com o banco
       
        try { // tentativa inicial
            System.setProperty("jdbc.Driver", driver); //seta a propriedade do driver de conaxão
            conn = DriverManager.getConnection(caminho, usuario, senha); // realiza a conexão com o banco de dados
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!"); // imprime uma caixa de mensagens
        } catch (SQLException ex) { //excessão
            JOptionPane.showMessageDialog(null, "Erro de conexão!\n ERRO: " + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!\n ERRO: " + ex.getMessage());
        }
    }
    
    public void desconecta(){ // método para fechar a conexão com o banco
        try {
            conn.close(); //fechar a conexão
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!\n ERRO: " + ex.getMessage());
        }
    }
    
}
