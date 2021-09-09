package view;

import java.util.ArrayList;

public class ListadePessoas {
//ATRIBUTOS---------------------------------------------------------------------    
       
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionarios> funcionarios;
//------------------------------------------------------------------------------

    public ListadePessoas() {
        
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }
    
    public void removerClientes(Cliente cliente){
        this.clientes.remove(cliente);
    }
    public void removerFuncionario(Funcionarios f){
        this.clientes.remove(f);
    }
//------------------------------------------------------------------------------
    public void mudarClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
  
    public void mudarFuncionarios(ArrayList<Funcionarios> f) {
        this.funcionarios= f;
    }

    public void setClientes(Cliente clientes) {
        this.clientes.add(clientes);
    }


    public void setFuncionarios(Funcionarios funcionarios) {
        this.funcionarios.add(funcionarios);
    }
//------------------------------------------------------------------------------
    


    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Funcionarios> getFuncionarios() {
        return funcionarios;
    }
  
    
    
    
    
}
