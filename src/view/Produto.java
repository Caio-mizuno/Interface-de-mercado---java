/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Caio
 */
public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    
    public Produto() {
        this.nome = "";
        this.categoria = "";
        this.preco = 0.0;
    }
    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    
    
    
    
    
    
    
}
