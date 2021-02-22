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
public class ModeloBaixaParcela {
    private int codParc;
    private String datavenc;
    private int codVenda; 
    private float valor;

    /**
     * @return the codParc
     */
    public int getCodParc() {
        return codParc;
    }

    /**
     * @param codParc the codParc to set
     */
    public void setCodParc(int codParc) {
        this.codParc = codParc;
    }

    /**
     * @return the datavenc
     */
    public String getDatavenc() {
        return datavenc;
    }

    /**
     * @param datavenc the datavenc to set
     */
    public void setDatavenc(String datavenc) {
        this.datavenc = datavenc;
    }

    /**
     * @return the codVenda
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
