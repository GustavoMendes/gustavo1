/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.negocio;

/**
 *
 * @author gustavo_cm
 */
public class Produto {
   public String nomeProduto;
   public String descricao;
   public String dataFab;
   public String categoria;
   public String preco;

    public Produto() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataFab() {
        return dataFab;
    }

    public void setDataFab(String dataFab) {
        this.dataFab = dataFab;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
   
   
    
    
}
