/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Mr-Robot
 */
public class ModeloProdutos {
    private int idProduto;
    private String nomeProduto;
    private float precoCompra;
    private float precoVenda;
    private int qtdProduto;
    private String idfornecedor;
    private String pesquisa;
    
    public String getPesquisa(){
        return pesquisa;
    }
    public void setPesquisa(String pesquisa){
        this.pesquisa = pesquisa;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public String getIdFornecedor() {
        return idfornecedor;
    }

    public void setIdFornecedor(String idfornecedor) {
        this.idfornecedor = idfornecedor;
    } 
}
