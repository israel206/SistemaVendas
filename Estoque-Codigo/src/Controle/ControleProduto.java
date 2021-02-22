/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModeloProdutos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleProduto {
    ConectaBanco connProduto = new ConectaBanco();
    ModeloProdutos mod  = new ModeloProdutos();
    ConectaBanco connFornecedor = new ConectaBanco();
    //Variável global
    int codFornecedor;
    String nomeFornecedor;
    
    public void inserirProduto(ModeloProdutos mod){
        buscarCodigo(mod.getIdFornecedor());
        connProduto.conexao();
        try {
            PreparedStatement pst = connProduto.conn.prepareStatement("insert into produtos(nome_produto, preco_compra, preco_venda, quantidade, id_fornecedor) values(?,?,?,?,?)");
            pst.setString(1, mod.getNomeProduto());
            pst.setFloat(2, mod.getPrecoCompra());
            pst.setFloat(3, mod.getPrecoVenda());
            pst.setFloat(4, mod.getQtdProduto());
            pst.setInt(5, codFornecedor);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir o produto!\nERRO: "+ ex);
        }
        connProduto.desconecta();
    }
    public void editarProduto(ModeloProdutos mod){
        buscarCodigo(mod.getIdFornecedor());
        connProduto.conexao();
        try {
            PreparedStatement pst = connProduto.conn.prepareStatement("update produtos set nome_produto=?, preco_compra=?, preco_venda=?, quantidade=?,id_fornecedor=? where id_produto=?");
            pst.setString(1, mod.getNomeProduto());
            pst.setFloat(2, mod.getPrecoCompra());
            pst.setFloat(3, mod.getPrecoVenda());
            pst.setFloat(4, mod.getQtdProduto());
            pst.setInt(5, codFornecedor);
            pst.setInt(6, mod.getIdProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar o produto!\nERRO: "+ ex);
        }
        connProduto.desconecta();
    }
    public void exluirProduto(ModeloProdutos mod){
        connProduto.conexao();
        try {
            PreparedStatement pst = connProduto.conn.prepareStatement("delete from produtos where id_produto=?");
            pst.setInt(1, mod.getIdProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao exluir o produto!\nERRO: "+ ex);
        }
    }
    //Métodos de busca de codigo de Fornecedor
    public void buscarCodigo(String nome){
        connProduto.conexao();
        connProduto.executaSQL("select * from fornecedores where nome_fornecedor='"+nome+"'");
        try {
            connProduto.rs.first();
            codFornecedor = connProduto.rs.getInt("id_fornecedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao na busca codigo!\nERRO: "+ ex);
        }
        connProduto.desconecta();
    }
    
    //Método busca Produtos para realiazar a pesquisa
    public ModeloProdutos buscarProduto(ModeloProdutos modelo){
        connProduto.conexao();
        connProduto.executaSQL("select * from produtos where nome_produto like '%"+modelo.getPesquisa()+"%'");
        try {
            connProduto.rs.first();
            buscarNomeFornecedor(connProduto.rs.getInt("id_fornecedor"));
            mod.setIdProduto(connProduto.rs.getInt("id_produto"));
            mod.setNomeProduto(connProduto.rs.getString("nome_produto"));
            mod.setPrecoCompra(connProduto.rs.getFloat("preco_compra"));
            mod.setPrecoVenda(connProduto.rs.getFloat("preco_venda"));
            mod.setQtdProduto(connProduto.rs.getInt("quantidade"));
            mod.setIdFornecedor(nomeFornecedor);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao na busca produto!\nERRO: "+ ex);
        }
        connProduto.desconecta();
        return mod;
    }
    
    //Método de Buscador Fornecedor
    public void buscarNomeFornecedor(int cod){
        connFornecedor.conexao();
        connFornecedor.executaSQL("select * from fornecedores where id_fornecedor="+cod+"");
        try {
            connFornecedor.rs.first();
            nomeFornecedor = connFornecedor.rs.getString("nome_fornecedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao na busca codigo!\nERRO: "+ ex);
        }
         connFornecedor.desconecta();
    }
}
