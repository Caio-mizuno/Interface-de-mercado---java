/*

 * ALGORITMO INSPIRADO NO VÍDEO, https://www.youtube.com/watch?v=ErGe_AffUfM&list=PLdvD02W3316JtVoctAc_Dg_1PefHgaFYI&index=18 acessado em 06/11;
 * TENTEI FAZER AO MÁXIMO AUTÊNTICO
 
 */
package Bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caio
 */
public class ConexaoBD {
    


   private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
   private static final String URL = "jdbc:mysql://localhost:3306/atv04?useTimezone=true&serverTimezone=UTC";
   private static final String USER = "root";
   private static final String PASS = null ;
 
   public static Connection getConnection(){
   
       try {
           Class.forName(DRIVER);           
           return DriverManager.getConnection(URL, USER, PASS);
       } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro na conexão: ", ex);
       }
   }
   
   public static void desligarBD(Connection conexao,ResultSet resultado, PreparedStatement estado){

       desligarBD(conexao, estado);
       
       try {
           if(resultado != null){
               resultado.close();
           }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
   public static void desligarBD(Connection conexao){
        try {
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public static void desligarBD(Connection conexao, PreparedStatement estado){

       desligarBD(conexao);
       
       try {
            if (estado != null) {
                estado.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    PreparedStatement prepareStatement(String parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
}


