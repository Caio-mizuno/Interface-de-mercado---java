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
public class Pedido {
    private Cliente cliente;
    private Produto p;
    private Funcionarios funciona;

    public Pedido() {
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getP() {
        return p;
    }

    public Funcionarios getFunciona() {
        return funciona;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public void setFunciona(Funcionarios funciona) {
        this.funciona = funciona;
    }
    
    
    
    
}
