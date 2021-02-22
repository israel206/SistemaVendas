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
public class ModeloClientes {
    
    private int id;
    private String nome;
    private String endereco;
    private String rg;
    private String cpf;
    private String IdBairro;
    private String IdCidade;
    private String Idtelefone;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the Bairro
     */
    public String getIdBairro() {
        return IdBairro;
    }

    /**
     * @param IdBairro the Bairro to set
     */
    public void setIdBairro(String IdBairro) {
        this.IdBairro = IdBairro;
    }

    /**
     * @return the Cidade
     */
    public String getIdCidade() {
        return IdCidade;
    }

    /**
     * @param IdCidade the Cidade to set
     */
    public void setIdCidade(String IdCidade) {
        this.IdCidade = IdCidade;
    }

    /**
     * @return the telefone
     */
    public String getIdTelefone() {
        return Idtelefone;
    }

    /**
     * @param Idtelefone the telefone to set
     */
    public void setIdTelefone(String Idtelefone) {
        this.Idtelefone = Idtelefone;
    }   
}
