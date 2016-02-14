/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class ControleBanco {

    public Statement stm; //responsavel por preparar e realizar pesquisas no banco, onde passa o sql
    public ResultSet rs; // responsavel por armazenar o resoltudo de uma pesquisa passa para o stm
    private String driver = "org.postgresql.Driver"; // responsavel por identificar o banco de dados o servico 
    private String caminho = "jdbc:postgresql://localhost:5434/sistemavideoaula"; // responsavel por  setar o local do banmco
    private String usuario = "postgres";
    private String senha = "postgres";
    public Connection conn; // responsavel por realizar a conecta com o banco.

    public void conecta(){
        
        try { // tentativa inicial
            System.setProperty("jdbc.Drivers", driver); // seta a propriedade do driver de conecta
            conn = DriverManager.getConnection(caminho, usuario, senha); // realiza a conecta com o banco
            //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!!!");
        } catch (SQLException ex) { //se der erro roda isso.
            Logger.getLogger(ControleBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao abrir conexão!\nErro: " + ex.getMessage());
        }
        
    }
    
    public void desconecta(){ //metodo para fechar a conecta com o banco.
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com Sucesso!!!");
        } catch (SQLException ex) {
            Logger.getLogger(ControleBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão!\nErro: " + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            //JOptionPane.showMessageDialog(null, "SQL Executado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ControleBanco.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "Erro ao executar SQL!\nErro: " + ex.getMessage());
        }
    }
}
