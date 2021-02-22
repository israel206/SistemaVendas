/*
 * O modelo é ultilizamos para mapear os dados,
 * e manipular entre os dados entre camada de visão e a de controle, 
 * onde quem faz esssa interação ou interface é o modelo.
 */
package Model;

/**
 *
 * @author Mr-Robot
 */
public class ModeloFornecedor {
    private int id;
    private String Nome;
    private String endereco;
    private String idBairro;
    private String CNPJ;
    private String sigla_estado;
    private String nome_Cidade;

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
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
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
     * @return the idBairro
     */
    public String getIdBairro() {
        return idBairro;
    }

    /**
     * @param idBairro the idBairro to set
     */
    public void setIdBairro(String idBairro) {
        this.idBairro = idBairro;
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the sigla_estado
     */
    public String getSigla_estado() {
        return sigla_estado;
    }

    /**
     * @param sigla_estado the sigla_estado to set
     */
    public void setSigla_estado(String sigla_estado) {
        this.sigla_estado = sigla_estado;
    }

    /**
     * @return the nomeCidade
     */
    public String getNome_Cidade() {
        return nome_Cidade;
    }

    /**
     * @param nome_Cidade the nomeCidade to set
     */
    public void setNome_Cidade(String nome_Cidade) {
        this.nome_Cidade = nome_Cidade;
    }
}
