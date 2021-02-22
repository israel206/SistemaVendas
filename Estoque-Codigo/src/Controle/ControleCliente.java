/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModeloClientes;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleCliente {
    
    ConectaBanco connCliente = new ConectaBanco();
    ModeloClientes modCli = new ModeloClientes();
    int codBairro, codCidade, codTel;
    String Bairro, Cidade, Telefone;
    
    
    public void Inserir(ModeloClientes mod){
        connCliente.conexao();
        buscaCod(mod.getIdBairro(), mod.getIdCidade(), mod.getIdTelefone());
       
        //inseri o cliente na tabela clientes
        PreparedStatement pst;
        try {
            pst = connCliente.conn.prepareStatement("insert into clientes (nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro)values(?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            buscaCod(mod.getIdBairro(), mod.getIdCidade(), mod.getIdTelefone());
            pst.setInt(5, codBairro);
            pst.execute();
            
            //atualiza a tabela itens_tel_cli
            connCliente.executaSQL("select * from telefones where numero_tel='" + mod.getIdTelefone() + "'");
            connCliente.rs.first();
            codTel = connCliente.rs.getInt("id_telefone");
            
            connCliente.executaSQL("select * from clientes where nome_cliente='" + mod.getNome() + "'");
            connCliente.rs.first();
            int codCli = connCliente.rs.getInt("id_cliente");
            
            pst = connCliente.conn.prepareStatement("insert into itens_tel_cli(id_cliente, id_tel)values(?,?)");
            buscaCod(mod.getIdBairro(), mod.getIdCidade(),"");//este codigo é opcional
            pst.setInt(1, codCli);
            pst.setInt(2, codTel);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção de dados!\n ERRO: " + ex);
        }
        connCliente.desconecta();
    }
    public void Alterar(ModeloClientes mod){
        connCliente.conexao();
        try {
            //Altera tabela itens_tel_cli
            connCliente.executaSQL("select * from telefones where numero_tel='" + mod.getIdTelefone() + "'");
            connCliente.rs.first();
            codTel = connCliente.rs.getInt("id_telefone");
            
            PreparedStatement pst = connCliente.conn.prepareStatement("update itens_tel_cli set id_tel=? where id_cliente=?");
            pst.setInt(1, codTel);
            pst.setInt(2, mod.getId());
            pst.execute();
            
            //altera a tabela cliente 
            pst = connCliente.conn.prepareStatement("update clientes set nome_cliente=?, endereco_cliente=?, rg_cliente=?, cpf_cliente=?, id_bairro=? where id_cliente=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            buscaCod(mod.getIdBairro(), mod.getIdCidade(),"");
            pst.setInt(5, codBairro);
            pst.setInt(6, codCidade);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração de dados!\n ERRO: " + ex);
        }
        connCliente.desconecta();
    }
    public void Excluir(ModeloClientes mod){
        connCliente.conexao();
        try {
            //exclui dados da tabela itens_tel_cli
            PreparedStatement pst = connCliente.conn.prepareStatement("delete from itens_tel_cli where id_cliente=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            
            //exclui dados da tabela cliente
            pst = connCliente.conn.prepareStatement("delete from clientes where id_cliente=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exclusão de dados!\n ERRO: " + ex);
        }
    }
    
    public ModeloClientes Primeiro(){
        connCliente.conexao();
        
        try {
            connCliente.executaSQL("select * from clientes inner join itens_tel_cli on clientes.id_cliente = itens_tel_cli.id_cliente inner join telefones on itens_tel_cli.id_tel = telefones.id_telefone inner join bairros on clientes.id_bairro = bairros.id_bairro inner join cidades on bairros.id_cidade = cidades.id_cidade inner join estados on cidades.id_cidade = estados.id_estado");
            connCliente.rs.first();
            modCli.setId(connCliente.rs.getInt("id_cliente"));
            modCli.setNome(connCliente.rs.getString("nome_cliente"));
            modCli.setEndereco(connCliente.rs.getString("endereco_cliente"));
            modCli.setRg(connCliente.rs.getString("rg_cliente"));
            modCli.setCpf(connCliente.rs.getString("cpf_cliente"));
            modCli.setIdBairro(connCliente.rs.getString("nome_bairro"));
            modCli.setIdCidade(connCliente.rs.getString("nome_cidades"));
            modCli.setIdTelefone(connCliente.rs.getString("numero_tel"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a primeira opção!\nERRO: " + ex);
        }
        connCliente.desconecta();
        return modCli;
    }
    public ModeloClientes Anterior(){
        try {
            connCliente.rs.previous();
            modCli.setId(connCliente.rs.getInt("id_cliente"));
            modCli.setNome(connCliente.rs.getString("nome_cliente"));
            modCli.setEndereco(connCliente.rs.getString("endereco_cliente"));
            modCli.setRg(connCliente.rs.getString("rg_cliente"));
            modCli.setCpf(connCliente.rs.getString("cpf_cliente"));
            modCli.setIdBairro(connCliente.rs.getString("nome_bairro"));
            modCli.setIdCidade(connCliente.rs.getString("nome_cidades"));
            modCli.setIdTelefone(connCliente.rs.getString("numero_tel"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a opção anterior!\nERRO: " + ex);
        }
        return modCli;
    }
    public ModeloClientes Proximo(){
        try {
            connCliente.rs.next();
            modCli.setId(connCliente.rs.getInt("id_cliente"));
            modCli.setNome(connCliente.rs.getString("nome_cliente"));
            modCli.setEndereco(connCliente.rs.getString("endereco_cliente"));
            modCli.setRg(connCliente.rs.getString("rg_cliente"));
            modCli.setCpf(connCliente.rs.getString("cpf_cliente"));
            modCli.setIdBairro(connCliente.rs.getString("nome_bairro"));
            modCli.setIdCidade(connCliente.rs.getString("nome_cidades"));
            modCli.setIdTelefone(connCliente.rs.getString("numero_tel"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a opção proximo!\nERRO: " + ex);
        }
        return modCli;
    }
    
    public ModeloClientes Ultimo(){
        connCliente.conexao();
        
        try {
            connCliente.executaSQL("select * from clientes inner join itens_tel_cli on clientes.id_cliente = itens_tel_cli.id_cliente inner join telefones on itens_tel_cli.id_tel = telefones.id_telefone inner join bairros on clientes.id_bairro = bairros.id_bairro inner join cidades on bairros.id_cidade = cidades.id_cidade inner join estados on cidades.id_cidade = estados.id_estado");
            connCliente.rs.last();
            modCli.setId(connCliente.rs.getInt("id_cliente"));
            modCli.setNome(connCliente.rs.getString("nome_cliente"));
            modCli.setEndereco(connCliente.rs.getString("endereco_cliente"));
            modCli.setRg(connCliente.rs.getString("rg_cliente"));
            modCli.setCpf(connCliente.rs.getString("cpf_cliente"));
            modCli.setIdBairro(connCliente.rs.getString("nome_bairro"));
            modCli.setIdCidade(connCliente.rs.getString("nome_cidades"));
            modCli.setIdTelefone(connCliente.rs.getString("numero_tel"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar a primeira opção!\nERRO: " + ex);
        }
        connCliente.desconecta();
        return modCli;
    }
    
    //Função para buscar os codigos do bairro e da cidade
    public void buscaCod(String Bairro, String Cidade, String Tel){
        //connCliente.conexao();
        try {
            connCliente.executaSQL("select * from bairros where nome_bairro='" + Bairro + "'");
            connCliente.rs.first();
            codBairro = connCliente.rs.getInt("id_bairro");
            
            connCliente.executaSQL("select * from cidades where nome_cidades='" + Cidade + "'");
            connCliente.rs.first();
            codCidade = connCliente.rs.getInt("id_cidade");
            
            connCliente.executaSQL("select * from telefones where numero_tel='" + Tel + "'");
            connCliente.rs.first();
            codTel = connCliente.rs.getInt("id_telefone");
            //JOptionPane.showMessageDialog(null, codTel);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao selecionar os codigos!\n ERRO: " + ex);
        }
    }
    public void BuscaNomes(int codBairro, int codCid){
         try {
            connCliente.executaSQL("select * from bairros where id_bairro='" + codBairro + "'");
            connCliente.rs.first();
            Bairro = connCliente.rs.getString("nome_bairro");
            
            connCliente.executaSQL("select * from cidades where id_cidade='" + codCid + "'");
            connCliente.rs.first();
            Cidade = connCliente.rs.getString("nome_cidades");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os Nomes!\n ERRO: " + ex);
        }
    }
    
}
