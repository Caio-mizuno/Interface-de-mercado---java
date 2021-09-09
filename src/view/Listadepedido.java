/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author Caio
 */
public class Listadepedido {
    private ArrayList<Pedido> pedido;

    public Listadepedido() {
        this.pedido = new ArrayList<>();
    }

    
    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }
    
     public void adicionarPedido(Pedido e) {
        this.pedido.add(e);
    }
    public void removerPedido(Pedido e) {
        this.pedido.remove(e);
    }
    
}
