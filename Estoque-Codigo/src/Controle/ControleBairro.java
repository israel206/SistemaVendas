/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModeloBairro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleBairro {
    
    ConectaBanco connBairro = new ConectaBanco();
    ConectaBanco connPesq = new ConectaBanco();
    ModeloBairro mod = new ModeloBairro();
    int codCid;
    String cidade;
    
    public void GravarBairro(ModeloBairro mod){
        connBairro.conexao();
        try {
            connBairro.executaSQL("select * from cidades where nome_cidades='" + mod.getCidade() + "'");
            connBairro.rs.first();
            codCid = connBairro.rs.getInt("id_cidade");
            PreparedStatement pst = connBairro.conn.prepareStatement("insert into bairros(nome_bairro, id_cidade)values(?,?)");
            pst.setString(1, mod.getNome());
            pst.setInt(2, codCid);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados: \n ERRO:" + ex);
        }
        connBairro.desconecta();
    }
    
    public ModeloBairro primeiro(){
        connBairro.conexao();
        connPesq.conexao();
        try {
            connBairro.executaSQL("select * from bairros");
            connBairro.rs.first();
            connPesq.executaSQL("select * from cidades where id_cidade=" + connBairro.rs.getInt("id_cidade"));
            connPesq.rs.first();
            cidade = connPesq.rs.getString("nome_cidades");
            mod.setCod(connBairro.rs.getInt("id_bairro"));
            mod.setNome(connBairro.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados! \n ERRO:" + ex);
        }
        connBairro.desconecta();
        connPesq.desconecta();
        return mod;
    }
    public ModeloBairro ultimo(){
        connBairro.conexao();
        connPesq.conexao();
        try {
            connBairro.executaSQL("select * from bairros");  
            connBairro.rs.last();
            connPesq.executaSQL("select * from cidades where id_cidade=" + connBairro.rs.getInt("id_cidade"));
            connPesq.rs.first();
            cidade = connPesq.rs.getString("nome_cidades");
            mod.setCod(connBairro.rs.getInt("id_bairro"));
            mod.setNome(connBairro.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados! \n ERRO:" + ex);
        }
        connBairro.desconecta();
        connPesq.desconecta();
        return mod;
    }
    
    public ModeloBairro antes(){
        connBairro.conexao();
        connPesq.conexao();
        try {
            //connBairro.executaSQL("select * from bairro");  
            connBairro.rs.previous();
            connPesq.executaSQL("select * from cidades where id_cidade=" + connBairro.rs.getInt("id_cidade"));
            connPesq.rs.first();
            cidade = connPesq.rs.getString("nome_cidades");
            mod.setCod(connBairro.rs.getInt("id_bairro"));
            mod.setNome(connBairro.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados! \n ERRO:" + ex);
        }
        connBairro.desconecta();
        connPesq.desconecta();
        return mod;
    }
    public ModeloBairro proximo(){
        connBairro.conexao();
        connPesq.conexao();
        try {
            //connBairro.executaSQL("select * from bairro");  
            connBairro.rs.next();
            connPesq.executaSQL("select * from cidades where id_cidade=" + connBairro.rs.getInt("id_cidade"));
            connPesq.rs.first();
            cidade = connPesq.rs.getString("nome_cidades");
            mod.setCod(connBairro.rs.getInt("id_bairro"));
            mod.setNome(connBairro.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados! \n ERRO:" + ex);
        }
        connBairro.desconecta();
        connPesq.desconecta();
        return mod;
    }
    
    public void Editar(ModeloBairro mod){
        connBairro.conexao();
        connPesq.conexao();
        try {
            connPesq.executaSQL("select * from cidades where nome_cidades=?" + mod.getNome());
            connPesq.rs.first();
            codCid = connBairro.rs.getInt("id_cidade");
            PreparedStatement pst = connBairro.conn.prepareStatement("update bairros set nome_bairro=?, id_cidade=? where id_bairro=?");
            pst.setString(1, mod.getNome());
            pst.setInt(2, codCid);
            pst.setInt(3, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados!\n ERRO:" + ex);
        }
        connBairro.desconecta();
        connPesq.desconecta();
    }
    public void Excluir(ModeloBairro mod){
        connBairro.conexao();
        try {
            PreparedStatement pst = connBairro.conn.prepareStatement("delete from bairros where id_bairro=?");
            pst.setInt(1, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\n ERRO:" + ex);
        }
        connBairro.desconecta();
    }
}
    

