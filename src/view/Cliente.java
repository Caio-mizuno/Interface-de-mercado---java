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
public class Cliente extends Pessoas{
//ATRIBUTOS---------------------------------------------------------------------
    
    
  
    
//------------------------------------------------------------------------------
    public Cliente( ) {
        
        
    } 
//------------------------------------------------------------------------------
     

   
//------------------------------------------------------------------------------   

    
    
    
    @Override
    public String toString(){
        return "Cliente{"+" Nome: " + this.getNome() + " CPF: " + this.getCpf()+ " Idade: " + this.getIdade() + " Telefone: " + this.getTelefone() + " Endereco: "+ this.getEndereco() +"}";
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
