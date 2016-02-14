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
import modelo.ModeloTabela;
import modelo.ModeloTelefone;

/**
 *
 * @author fredw
 */
public class ControleTelefone {

    ControleBanco conectaTelefone = new ControleBanco();
    ControleBanco conectaItens_Cli_Tel = new ControleBanco();

    public void inserirTelefone(ModeloTelefone modeloTelefone) {
        conectaTelefone.conecta();
        try {
            PreparedStatement pst = conectaTelefone.conn.prepareStatement("insert into telefone (numero_telefone) values (?)");
            pst.setString(1, modeloTelefone.getNumeroTelefone());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaTelefone.desconecta();
    }

    public void inserirTelefonePorCliente(ModeloTelefone modeloTelefone) {
        conectaTelefone.conecta();
        conectaItens_Cli_Tel.conecta();
        try {
            PreparedStatement pst = conectaTelefone.conn.prepareStatement("insert into telefone (numero_telefone) values (?)");
            pst.setString(1, modeloTelefone.getNumeroTelefone());
            pst.execute();
            PreparedStatement pst2 = conectaItens_Cli_Tel.conn.prepareStatement("insert into itens_cli_tel (id_cliente,id_telefone) values (?,?)");
            pst2.setInt(1, modeloTelefone.getId_cliente());
            conectaTelefone.executaSQL("select id_telefone from telefone where numero_telefone='" + modeloTelefone.getNumeroTelefone() + "'");
            conectaTelefone.rs.first();
            pst2.setInt(2, conectaTelefone.rs.getInt("id_telefone"));
            pst2.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaTelefone.desconecta();
        conectaItens_Cli_Tel.desconecta();
    }

    public void deletarTelefone(ModeloTelefone modeloTelefone, int id_cliente) {
        conectaTelefone.conecta();
        conectaItens_Cli_Tel.conecta();
        try {
            if (id_cliente != 0) {
                PreparedStatement pst1 = conectaItens_Cli_Tel.conn.prepareStatement("delete from itens_cli_tel where id_telefone = ? ");
                pst1.setInt(1, modeloTelefone.getIdTelefone());
                pst1.execute();
            }
            PreparedStatement pst2 = conectaTelefone.conn.prepareStatement("delete from telefone where id_telefone = ?");
            pst2.setInt(1, modeloTelefone.getIdTelefone());
            pst2.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaTelefone.desconecta();
        conectaItens_Cli_Tel.desconecta();
    }

    public void editarTelefone(ModeloTelefone modeloTelefone) {
        conectaTelefone.conecta();
        try {
            PreparedStatement pst = conectaTelefone.conn.prepareStatement("update telefone set numero_telefone=? where id_telefone = ?");
            pst.setString(1, modeloTelefone.getNumeroTelefone());
            pst.setInt(2, modeloTelefone.getIdTelefone());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaTelefone.desconecta();
    }

    public ModeloTelefone navegarTelefone(String paraOnde) {
        ModeloTelefone modeloTelefone = new ModeloTelefone();
        conectaTelefone.conecta();
        try {
            if (paraOnde == "primeiro") {
                conectaTelefone.executaSQL("select * from telefone order by id_telefone");
                conectaTelefone.rs.first();
            }
            if (paraOnde == "ultimo") {
                conectaTelefone.rs.last();
            }
            if (paraOnde == "anterior") {
                conectaTelefone.rs.previous();
            }
            if (paraOnde == "proximo") {
                conectaTelefone.rs.next();
            }
            modeloTelefone.setIdTelefone(conectaTelefone.rs.getInt("id_telefone"));
            modeloTelefone.setNumeroTelefone(conectaTelefone.rs.getString("numero_telefone"));
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaTelefone.desconecta();
        return modeloTelefone;
    }

    public ModeloTelefone navegarTelefonePorCliente(String paraOnde, int id_cliente) {
        ModeloTelefone modeloTelefone = new ModeloTelefone();
        conectaTelefone.conecta();
        try {
            if (paraOnde == "primeiro") {
                conectaTelefone.executaSQL("select * from telefone inner join itens_cli_tel on itens_cli_tel.id_telefone = telefone.id_telefone where id_cliente ='" + id_cliente + "'");
                conectaTelefone.rs.first();
            }
            if (paraOnde == "ultimo") {
                conectaTelefone.rs.last();
            }
            if (paraOnde == "anterior") {
                conectaTelefone.rs.previous();
            }
            if (paraOnde == "proximo") {
                conectaTelefone.rs.next();
            }
            modeloTelefone.setIdTelefone(conectaTelefone.rs.getInt("id_telefone"));
            modeloTelefone.setNumeroTelefone(conectaTelefone.rs.getString("numero_telefone"));
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaTelefone.desconecta();
        return modeloTelefone;
    }

    public ModeloTabela preencherTabelaTelefone() {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Numero Telefone"};
        conectaTelefone.conecta();
        conectaTelefone.executaSQL("select * from telefone order by id_telefone");
        try {
            conectaTelefone.rs.first();
            do {
                dados.add(new Object[]{conectaTelefone.rs.getInt("id_telefone"), conectaTelefone.rs.getString("numero_telefone")});
            } while (conectaTelefone.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        return modelo;
    }

    public ModeloTabela preencherTabelaTelefonePorCliente(int id_cliente) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Numero Telefone"};
        conectaTelefone.conecta();
        conectaTelefone.executaSQL("select * from telefone inner join itens_cli_tel on itens_cli_tel.id_telefone = telefone.id_telefone where id_cliente ='" + id_cliente + "'");
        try {
            conectaTelefone.rs.first();
            do {
                dados.add(new Object[]{conectaTelefone.rs.getInt("id_telefone"), conectaTelefone.rs.getString("numero_telefone")});
            } while (conectaTelefone.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        return modelo;
    }

    public ArrayList preencherComboTelefonePorCliente(int id_cliente) {
        ArrayList numerosTelefonePorCliente = new ArrayList();
        conectaTelefone.conecta();
        conectaTelefone.executaSQL("select numero_telefone from telefone inner join itens_cli_tel on itens_cli_tel.id_telefone = telefone.id_telefone where id_cliente ='" + id_cliente + "'");
        try {
            boolean temNumero = conectaTelefone.rs.first();
            if (temNumero == true) {
                do {
                    numerosTelefonePorCliente.add(conectaTelefone.rs.getString("numero_telefone"));
                } while (conectaTelefone.rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleTelefone.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numerosTelefonePorCliente;
    }
}
