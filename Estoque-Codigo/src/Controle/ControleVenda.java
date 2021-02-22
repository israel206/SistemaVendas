/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.ModeloVendas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleVenda {
    
    int codProd, codCliente;
    
    ConectaBanco connVenda = new ConectaBanco();
    
    public void adiconaItem(ModeloVendas mod){
        acharCodProduto(mod.getNomeProduto());
        connVenda.conexao();
        try {
            PreparedStatement pst = connVenda.conn.prepareStatement("insert into itens_venda_produto(id_venda,id_produto,quantidade_produto)values(?,?,?)");
            pst.setInt(1, mod.getIdVenda());
            pst.setInt(2, codProd);
            pst.setInt(3, mod.getQtdItem());
            pst.execute();
            
            //BAIXA DE ESTOQUE
            int quant = 0, resul = 0;
            connVenda.executaSQL("select * from produtos where nome_produto = '"+ mod.getNomeProduto() +"'");
            connVenda.rs.first();
            quant = connVenda.rs.getInt("quantidade");
            resul = quant - mod.getQtdItem();
            pst = connVenda.conn.prepareStatement("update produtos set quantidade=? where nome_produto=?");
            pst.setInt(1, resul);
            pst.setString(2, mod.getNomeProduto());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Produto adicionado!");
            connVenda.desconecta();
        } catch (SQLException ex) {
            connVenda.desconecta();
            JOptionPane.showMessageDialog(null, "Erro ao realizar a venda!\nErro:" +ex);
        }
        
    }
    public void acharCodProduto(String nome){
        connVenda.conexao();
        try {
            connVenda.executaSQL("select * from produtos where nome_produto='"+nome+"'");
            connVenda.rs.first();
            codProd = connVenda.rs.getInt("id_produto");
            connVenda.desconecta();
        } catch (SQLException ex) {
            connVenda.desconecta();
            JOptionPane.showMessageDialog(null, "Erro ao achar o codigo!\nErro:" +ex);
            
        }
    }
    public void FechaVenda(ModeloVendas mod){
        AcharCliente(mod.getNomeCliente());
        connVenda.conexao();
        try {
            PreparedStatement pst = connVenda.conn.prepareStatement("update vendas set data_venda=?, valor_venda=?, id_cliente=?, tipo_pagamento=? where id_venda=?");
            pst.setString(1, mod.getData());
            pst.setFloat(2, mod.getValorVenda());
            pst.setInt(3, codCliente);
            pst.setString(4, mod.getPagamento());
            pst.setInt(5, mod.getIdVenda());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Venda finalizada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechara venda!\nErro:" +ex);
        }
        connVenda.desconecta();
    }
    public void AcharCliente(String nome){
        connVenda.conexao();
        try {
            connVenda.executaSQL("select * from clientes where nome_cliente='"+nome+"'");
            connVenda.rs.first();
            codCliente = connVenda.rs.getInt("id_cliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Achar cliente!\nErro:" +ex);
        }
        connVenda.desconecta();
    }
    public void CancelarVenda(){
        connVenda.conexao();
        PreparedStatement pst;
        connVenda.executaSQL("select * from vendas inner join itens_venda_produto on vendas.id_venda = itens_venda_produto.id_venda inner join produtos on itens_venda_produto.id_produto = produtos.id_produto where valor_venda=0");
        
        try {
            connVenda.rs.first();
            do{
                int qtdProd = connVenda.rs.getInt("quantidade");
                int qtdVend = connVenda.rs.getInt("quantidade_produto");
                int soma = qtdProd + qtdVend;
                //atualizando tabela de produto
                pst = connVenda.conn.prepareStatement("update produtos set quantidade=? where id_produto=?");
                pst.setInt(1, soma);
                pst.setInt(2, connVenda.rs.getInt("id_produto"));
                pst.execute();
                // deletando pelo  id da venda
                pst = connVenda.conn.prepareStatement("delete from itens_venda_produto where id_venda=?");
                pst.setInt(1, connVenda.rs.getInt("id_venda"));
                pst.execute();
            }while(connVenda.rs.next());
            pst = connVenda.conn.prepareStatement("delete from vendas where valor_venda=?");
            pst.setInt(1, 0);
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao cancelar venda!\nErro:" + ex);
        }
        connVenda.desconecta();
    }
}
