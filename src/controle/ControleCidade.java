/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloCidade;

/**
 *
 * @author fredw
 */
public class ControleCidade {
    
    ControleBanco conectaCidade = new ControleBanco();
    
    public void inserirCidade(ModeloCidade modeloCidade){
        conectaCidade.conecta();
        try {
            PreparedStatement pst = conectaCidade.conn.prepareStatement("insert into cidade (nome_cidade, id_estado)values(?,?)");
            pst.setString(1, modeloCidade.getNome());
            pst.setInt(2, modeloCidade.getCod_estado());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCidade.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar cidade!!!\nErro: " + ex.getMessage());
        }     
        conectaCidade.desconecta();
    }
    
    public void deletarCidade(ModeloCidade modeloCidade){
        conectaCidade.conecta();
        try {
            PreparedStatement pst = conectaCidade.conn.prepareStatement("delete from cidade where id_cidade = ?");
            pst.setInt(1, modeloCidade.getCodigo());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCidade.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar cidade!!!\nErro: " + ex.getMessage());
        }
        conectaCidade.desconecta();
    }
    
    public void editarCidade(ModeloCidade modeloCidade){
        conectaCidade.conecta();
        try {
            PreparedStatement pst = conectaCidade.conn.prepareStatement("update cidade set nome_cidade=?,id_estado=? where id_cidade=?");
            pst.setString(1, modeloCidade.getNome());
            pst.setInt(2, modeloCidade.getCod_estado());
            pst.setInt(3, modeloCidade.getCodigo());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCidade.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao editar cidade!!!\nErro: " + ex.getMessage());
        }
        conectaCidade.desconecta();
    }
    
}
