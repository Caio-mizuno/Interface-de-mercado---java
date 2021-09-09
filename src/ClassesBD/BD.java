/*
 * ALGORITMO INSPIRADO NO VÍDEO, 
https://www.youtube.com/watch?v=ErGe_AffUfM&list=PLdvD02W3316JtVoctAc_Dg_1PefHgaFYI&index=18 acessado em 06/11
https://www.youtube.com/watch?v=FfVGmPlvrj0&t=796s acessado em 05/11
https://www.youtube.com/watch?v=wS0pejrkusU acessado em 05/11
https://www.youtube.com/watch?v=m9YPlX0fcJk&t=269s acessado em 03/11
 * TENTEI FAZER AO MÁXIMO AUTÊNTICO
 */
package ClassesBD;
import Bancodedados.ConexaoBD;
import Bancodedados.ExceptionBD;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Caio
 */
import view.Cliente;
import view.Funcionarios;
import view.Produto;
public class BD {
       
    //Criar um funcionario
    public void criar(Funcionarios fun) throws ExceptionBD{
        String parametros = "INSERT INTO Funcionarios (nome,cpf,telefone,endereco,cargo,codigodetrabalho)VALUES('"+fun.getNome()+"','"+fun.getCpf()+"','"+fun.getTelefone()+"','"+fun.getEndereco()+"','"+fun.getCargo()+"','"+fun.getCodigodetrabalho()+"');";
        java.sql.Connection conexao = null;
        PreparedStatement estado = null;
        
        try {                                       
                conexao = ConexaoBD.getConnection();
                estado = conexao.prepareStatement(parametros);

                estado.execute();

                JOptionPane.showMessageDialog(null, "Transferência conluida com SUCESSO!!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao passar funcionario ao Banco de Dados:" + ex);
        } finally{
            ConexaoBD.desligarBD(conexao, estado);
        }        
    
    }
    //Criar um cliente
    public void criar(Cliente client){
        String parametros = "INSERT INTO Cliente (nome,cpf,telefone,endereco)VALUES('"+client.getNome()+"','"+client.getCpf()+"','"+client.getTelefone()+"','"+client.getEndereco()+"');";
        java.sql.Connection conexao = null;
        PreparedStatement estado = null;
        
        try {                     
                conexao = ConexaoBD.getConnection();
                estado = conexao.prepareStatement(parametros);
                
                
                estado.execute();

            
            JOptionPane.showMessageDialog(null, "Transferência conluida com SUCESSO!!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao passar funcionario ao Banco de Dados:" + ex);
        } finally{
            ConexaoBD.desligarBD(conexao, estado);
        }        
    
    }
    
    //Criar um produto
    public void criar(Produto prod) throws SQLException{
        String parametros = "INSERT INTO produto (nome,categoria,preco)VALUES('"+prod.getNome()+"','"+prod.getCategoria()+"','"+prod.getPreco()+"');";
        java.sql.Connection conexao = null;
        PreparedStatement estado = null; 
        try {                     
                conexao = ConexaoBD.getConnection();
                estado = ConexaoBD.getConnection().prepareStatement(parametros);
                
            
                estado.execute();
            
            JOptionPane.showMessageDialog(null, "Transferência conluida com SUCESSO!!!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao passar funcionario ao Banco de Dados:" + ex);
        } finally{
            ConexaoBD.desligarBD(conexao, estado);
        }        
    
    }
    //LISTAR CLIENTE
    public ArrayList<Cliente> listarCliente(){

        java.sql.Connection conexao = null;
        PreparedStatement estado = null;
        ResultSet r = null;

        ArrayList<Cliente> clientes = new ArrayList<>();

        try {String x = "SELECT * FROM Cliente";
            conexao = ConexaoBD.getConnection();
            estado = conexao.prepareStatement(x); 
            r = estado.executeQuery();

            while (r.next()) {

                Cliente cli = new Cliente();

                cli.setNome(r.getString("nome"));
                cli.setCpf(r.getString("cpf"));
                cli.setTelefone(r.getString("telefone"));
                cli.setEndereco(r.getString("endereco"));
                clientes.add(cli);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro :" + ex);
        } finally {
            ConexaoBD.desligarBD(conexao, r, estado);
        }
        return clientes;
    }
    
    //LISTAR FUNCIONARIO
    public ArrayList<Funcionarios> listarFuncionario(){

        java.sql.Connection conexao = null;
        PreparedStatement estado = null;
        ResultSet r = null;

        ArrayList<Funcionarios> fun = new ArrayList<>();

        try {String x = "SELECT * FROM Funcionarios";
            conexao = ConexaoBD.getConnection();
            estado = conexao.prepareStatement(x); 
            r = estado.executeQuery();

            while (r.next()) {

                Funcionarios cli = new Funcionarios("","");

                cli.setNome(r.getString("nome"));
                cli.setCpf(r.getString("cpf"));
                cli.setTelefone(r.getString("telefone"));
                cli.setEndereco(r.getString("endereco"));
                cli.setCargo(r.getString("cargo"));
                cli.setCodigodetrabalho(r.getString("codigodetrabalho"));
                fun.add(cli);
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro :" + ex);
        } finally {
            ConexaoBD.desligarBD(conexao, r, estado);
        }
        return fun;
    }
    //LISTAR FUNCIONARIO
    public ArrayList<Produto> listarProduto(){

        java.sql.Connection conexao = null;
        PreparedStatement estado = null;
        ResultSet r = null;

        ArrayList<Produto> prod = new ArrayList<>();

        try {String x = "SELECT * FROM Produto";
            conexao = ConexaoBD.getConnection();
            estado = conexao.prepareStatement(x); 
            r = estado.executeQuery();

            while (r.next()) {

                Produto cli = new Produto();

                cli.setNome(r.getString("nome"));
                cli.setCategoria(r.getString("categoria"));
                cli.setPreco(r.getDouble("preco"));
                prod.add(cli);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro :" + ex);
        } finally {
            ConexaoBD.desligarBD(conexao, r, estado);
        }
        return prod;
    }
    //DELETAR CLIENTE
    public void deleteCliente(Cliente cliente){
    
        
        java.sql.Connection conexao = null;
        PreparedStatement estado = null;
        
        try{
            conexao = ConexaoBD.getConnection();
            estado = conexao.prepareStatement("DELETE FROM Cliente WHERE nome = '"+cliente.getCpf()+"'");
            
            estado.execute();
        
            JOptionPane.showMessageDialog(null, "Cliente excluido do BD!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);
        }finally{
            ConexaoBD.desligarBD(conexao, estado);
        }
    }
    
    //DELETAR Funcionario
    public void deleteFuncionario(Funcionarios funcionario){
    
        
        java.sql.Connection conexao = null;
        PreparedStatement estado = null;
        
        try{
            conexao = ConexaoBD.getConnection();
            estado = conexao.prepareStatement("DELETE FROM Funcionario WHERE nome ='"+funcionario.getCpf()+"'");
            estado.execute();
        
            JOptionPane.showMessageDialog(null, "Cliente excluido do BD!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);
        }finally{
            ConexaoBD.desligarBD(conexao, estado);
        }
    }
    //DELETAR Produto
    public void deleteProduto(Produto produto){
    
        
        java.sql.Connection conexao = null;
        PreparedStatement estado = null;
        
        try{
            conexao = ConexaoBD.getConnection();
            estado = conexao.prepareStatement("DELETE FROM Produto WHERE nome = '"+produto.getNome()+"'");
            estado.execute();
        
            JOptionPane.showMessageDialog(null, "Cliente excluido do BD!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + ex);
        }finally{
            ConexaoBD.desligarBD(conexao, estado);
        }
    }
}
