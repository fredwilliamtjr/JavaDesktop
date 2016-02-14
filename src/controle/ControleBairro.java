/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloBairro;
import modelo.ModeloTabela;

/**
 *
 * @author fredw
 */
public class ControleBairro {

    ControleBanco conectaBairro = new ControleBanco();
    ControleBanco conectaCidade = new ControleBanco();

    public void inserirBairro(ModeloBairro modeloBairro) {
        conectaBairro.conecta();
        conectaCidade.conecta();
        try {
            conectaCidade.executaSQL("select id_cidade from cidade where nome_cidade='" + modeloBairro.getNome_Cidade() + "'");
            conectaCidade.rs.first();
            int cod_Cidade = conectaCidade.rs.getInt("id_cidade");
            PreparedStatement pst = conectaBairro.conn.prepareStatement("insert into bairro (nome_bairro, id_cidade)values(?,?)");
            pst.setString(1, modeloBairro.getNome());
            pst.setInt(2, cod_Cidade);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar bairro!!!\nErro: " + ex.getMessage());
        }
        conectaBairro.desconecta();
        conectaCidade.desconecta();
    }

    public void deletarBairro(ModeloBairro modeloBairro) {
        conectaBairro.conecta();
        try {
            PreparedStatement pst = conectaBairro.conn.prepareStatement("delete from bairro where id_bairro = ?");
            pst.setInt(1, modeloBairro.getCodigo());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar bairro!!!\nErro: " + ex.getMessage());
        }
        conectaBairro.desconecta();
    }

    public void editarBairro(ModeloBairro modeloBairro) {
        conectaBairro.conecta();
        try {
            conectaCidade.executaSQL("select id_cidade from cidade where nome_cidade='" + modeloBairro.getNome_Cidade() + "'");
            conectaCidade.rs.first();
            int cod_Cidade = conectaCidade.rs.getInt("id_cidade");
            PreparedStatement pst = conectaBairro.conn.prepareStatement("update bairro set nome_bairro=?,id_cidade=? where id_bairro=?");
            pst.setString(1, modeloBairro.getNome());
            pst.setInt(2, cod_Cidade);
            pst.setInt(3, modeloBairro.getCodigo());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao editar bairro!!!\nErro: " + ex.getMessage());
        }
        conectaBairro.desconecta();
    }

    public ModeloBairro navergarBancoBairro(String paraOnde) {
        ModeloBairro modeloBairro = new ModeloBairro();
        if (paraOnde == "primeiro") {
            conectaBairro.conecta();
            conectaBairro.executaSQL("select * from bairro order by id_bairro");
            try {
                conectaBairro.rs.first();
            } catch (SQLException ex) {
                Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (paraOnde == "ultimo") {
            try {
                conectaBairro.rs.last();
            } catch (SQLException ex) {
                Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (paraOnde == "proximo") {
            try {
                conectaBairro.rs.next();
            } catch (SQLException ex) {
                Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (paraOnde == "anterior") {
            try {
                conectaBairro.rs.previous();
            } catch (SQLException ex) {
                Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            modeloBairro.setCodigo(conectaBairro.rs.getInt("id_bairro"));
            modeloBairro.setNome(conectaBairro.rs.getString("nome_bairro"));
            int cod_Cidade = conectaBairro.rs.getInt("id_cidade");
            conectaCidade.conecta();
            conectaCidade.executaSQL("select nome_cidade from cidade where id_cidade='" + cod_Cidade + "'");
            conectaCidade.rs.first();
            modeloBairro.setNome_Cidade(conectaCidade.rs.getString("nome_cidade"));

        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modeloBairro;
    }

    public ArrayList preencherComboCidade() {
        ArrayList nomesCidade = new ArrayList();
        conectaCidade.conecta();
        conectaCidade.executaSQL("select nome_cidade from cidade order by nome_cidade");
        try {
            conectaCidade.rs.first();
            do {
                nomesCidade.add(conectaCidade.rs.getString("nome_cidade"));
            } while (conectaCidade.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nomesCidade;
    }

    public ModeloTabela preencherTabelaBairro() {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Nome", "Cidade", "Estado"};
        conectaBairro.conecta();
        conectaBairro.executaSQL("select * from bairro inner join cidade on bairro.id_cidade = cidade.id_cidade inner join estado on cidade.id_estado = estado.id_estado order by id_bairro");
        try {
            conectaBairro.rs.first();
            do {
                dados.add(new Object[]{conectaBairro.rs.getInt("id_bairro"), conectaBairro.rs.getString("nome_bairro"), conectaBairro.rs.getString("nome_cidade"), conectaBairro.rs.getString("nome_estado")});
            } while (conectaBairro.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao preencher ArrayList!!!\nErro: " + ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        return modelo;
    }
}
