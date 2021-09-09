/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Calendar;

/**
 *
 * @author Caio
 */
public class Funcionarios extends Pessoas{
    private String codigodetrabalho;
    private String cargo;
  

    public Funcionarios(String codigodetrabalho, String cargo) {
        this.codigodetrabalho = codigodetrabalho;
        this.cargo = cargo;
       
    }

    
    
   
    
    public String getCodigodetrabalho() {
        return codigodetrabalho;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCodigodetrabalho(String codigodetrabalho) {
        this.codigodetrabalho = codigodetrabalho;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

 
    @Override
    public String toString(){
        return "Funcionário{"+" Nome: " + this.getNome()+" Código de trabalho: "+this.getCodigodetrabalho() +" Cargo: "+this.getCargo()+" CPF: " + this.getCpf()+"}";
    }

    @Override
    public void fazerAniversario(Calendar c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void definirAltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
