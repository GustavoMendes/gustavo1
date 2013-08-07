
package br.senai.sc.model.negocio;

/** 
 * Classe que representa os clientes físicos do software
 * @version 1.0   31/07/2013
 * @author gustavo_cm
 */


public class ClientePF extends PessoaFisica {
    
    private double numConta;
    private double limiteConta;
    private char categoria;
    private int qtVezesComprou;
    private double valorTotalGasto;

    
    public ClientePF() {
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezesComprou() {
        return qtVezesComprou;
    }

    public void setQtVezesComprou(int qtVezesComprou) {
        this.qtVezesComprou = qtVezesComprou;
    }

    public double getValorTotalGasto() {
        return valorTotalGasto;
    }

    public void setValorTotalGasto(double valorTotalGasto) {
        this.valorTotalGasto = valorTotalGasto;
    }
    
    
    
    
    
    
    
}
