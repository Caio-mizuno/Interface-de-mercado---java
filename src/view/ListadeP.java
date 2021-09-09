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
public class ListadeP {
    private ArrayList<Produto> p;

    public ListadeP() {
        this.p = new ArrayList<>();
    }
    
    
    
    
    public ArrayList<Produto> getP() {
        return p;
    }

    public void setP(ArrayList<Produto> p) {
        this.p = p;
    }
    
    public void adicionarP(Produto e) {
        this.p.add(e);
    }
    public void removerP(Produto e) {
        this.p.remove(e);
    }
    
}
