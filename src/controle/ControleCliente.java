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
import modelo.ModeloCliente;
import modelo.ModeloTabela;

/**
 *
 * @author fredw
 */
public class ControleCliente {

    ControleBanco conectaCliente = new ControleBanco();
    ControleBanco conectaBairro = new ControleBanco();
    ControleBanco conectaCidade = new ControleBanco();
    ControleBanco conectaEstado = new ControleBanco();
    ControleBanco conectaItens_Cli_Tel = new ControleBanco();
    

    public ArrayList devolverNomesBairros(int id_cidade) {
        ArrayList nomesBairro = new ArrayList();
        conectaBairro.conecta();
        conectaBairro.executaSQL("select nome_bairro from bairro where id_cidade='" + id_cidade + "' order by nome_bairro");
        try {
            conectaBairro.rs.first();
            do {
                nomesBairro.add(conectaBairro.rs.getString("nome_bairro"));
            } while (conectaBairro.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaBairro.desconecta();
        return nomesBairro;
    }

    public ArrayList devolverNomesCidades(int id_estado) {
        ArrayList nomesCidade = new ArrayList();
        conectaCidade.conecta();
        conectaCidade.executaSQL("select nome_cidade from cidade where id_estado='" + id_estado + "' order by nome_cidade");
        try {
            conectaCidade.rs.first();
            do {
                nomesCidade.add(conectaCidade.rs.getString("nome_cidade"));
            } while (conectaCidade.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaCidade.desconecta();
        return nomesCidade;
    }

    public ArrayList devolverNomesEstados() {
        ArrayList nomesEstado = new ArrayList();
        conectaEstado.conecta();
        conectaEstado.executaSQL("select nome_estado from estado order by nome_estado");
        try {
            conectaEstado.rs.first();
            do {
                nomesEstado.add(conectaEstado.rs.getString("nome_estado"));
            } while (conectaEstado.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaEstado.desconecta();
        return nomesEstado;
    }

    public int retornaIdBairro(String nomeBairro) {
        int idBairro = 0;
        conectaBairro.conecta();
        conectaBairro.executaSQL("select id_bairro from bairro where nome_bairro='" + nomeBairro + "'");
        try {
            conectaBairro.rs.first();
            idBairro = conectaBairro.rs.getInt("id_bairro");
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaBairro.desconecta();
        return idBairro;
    }

    public int retornaIdCidade(String nomeCidade) {
        int idCidade = 0;
        conectaCidade.conecta();
        conectaCidade.executaSQL("select id_cidade from cidade where nome_cidade='" + nomeCidade + "'");
        try {
            conectaCidade.rs.first();
            idCidade = conectaCidade.rs.getInt("id_cidade");
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaCidade.desconecta();
        return idCidade;
    }

    public int retornaIdEstado(String nomeEstado) {
        int idEstado = 0;
        conectaEstado.conecta();
        conectaEstado.executaSQL("select id_estado from estado where nome_estado='" + nomeEstado + "'");
        try {
            conectaEstado.rs.first();
            idEstado = conectaEstado.rs.getInt("id_estado");
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaEstado.desconecta();
        return idEstado;
    }

    public void inserirCliente(ModeloCliente modeloCliente) {
        conectaCliente.conecta();
        try {
            PreparedStatement pst = conectaCliente.conn.prepareStatement("insert into cliente (nome_cliente, endereco_cliente, rg_cliente, cpf_cliente, id_bairro, id_cidade) values(?, ?, ?, ?, ?, ?)");
            pst.setString(1, modeloCliente.getNome_Cliente());
            pst.setString(2, modeloCliente.getEndereco_Cliente());
            pst.setString(3, modeloCliente.getRg_Clinete());
            pst.setString(4, modeloCliente.getCpf_Cliente());
            pst.setInt(5, modeloCliente.getId_Bairro());
            pst.setInt(6, modeloCliente.getId_cidade());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaCliente.desconecta();
    }

        public void editarCliente(ModeloCliente modeloCliente) {
        conectaCliente.conecta();
        try {
            PreparedStatement pst = conectaCliente.conn.prepareStatement("update cliente set nome_cliente = ?, endereco_cliente = ?, rg_cliente = ?, cpf_cliente = ?, id_bairro = ?, id_cidade = ? where id_cliente = ?");
            pst.setString(1, modeloCliente.getNome_Cliente());
            pst.setString(2, modeloCliente.getEndereco_Cliente());
            pst.setString(3, modeloCliente.getRg_Clinete());
            pst.setString(4, modeloCliente.getCpf_Cliente());
            pst.setInt(5, modeloCliente.getId_Bairro());
            pst.setInt(6, modeloCliente.getId_cidade());
            pst.setInt(7, modeloCliente.getId_Cliente());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaCliente.desconecta();
    }

    
    public void deletarCliente(ModeloCliente modeloCliente) {
        conectaCliente.conecta();
        conectaItens_Cli_Tel.conecta();
        try {
            PreparedStatement pst0 = conectaItens_Cli_Tel.conn.prepareStatement("delete from itens_cli_tel where id_cliente = ?");
            pst0.setInt(1, modeloCliente.getId_Cliente());
            pst0.execute();
            PreparedStatement pst = conectaCliente.conn.prepareStatement("delete from cliente where id_cliente = ?");
            pst.setInt(1, modeloCliente.getId_Cliente());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaCliente.desconecta();
    }

    public ModeloCliente navergarBancoCliente(String paraOnde) {
        ModeloCliente modeloCliente = new ModeloCliente();
        if (paraOnde == "primeiro") {
            conectaCliente.conecta();
            conectaCliente.executaSQL("select * from cliente order by id_cliente");
            try {
                conectaCliente.rs.first();
            } catch (SQLException ex) {
                Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (paraOnde == "ultimo") {
            try {
                conectaCliente.rs.last();
            } catch (SQLException ex) {
                Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (paraOnde == "proximo") {
            try {
                conectaCliente.rs.next();
            } catch (SQLException ex) {
                Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (paraOnde == "anterior") {
            try {
                conectaCliente.rs.previous();
            } catch (SQLException ex) {
                Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            modeloCliente.setId_Cliente(conectaCliente.rs.getInt("id_cliente"));
            modeloCliente.setNome_Cliente(conectaCliente.rs.getString("nome_cliente"));
            modeloCliente.setRg_Clinete(conectaCliente.rs.getString("rg_cliente"));
            modeloCliente.setCpf_Cliente(conectaCliente.rs.getString("cpf_cliente"));
            modeloCliente.setEndereco_Cliente(conectaCliente.rs.getString("endereco_cliente"));
            conectaBairro.conecta();
            conectaBairro.executaSQL("select nome_bairro from bairro where id_bairro='" + conectaCliente.rs.getInt("id_bairro") + "'");
            conectaBairro.rs.first();
            modeloCliente.setNome_bairro(conectaBairro.rs.getString("nome_bairro"));
            conectaCidade.conecta();
            conectaCidade.executaSQL("select nome_cidade,id_estado from cidade where id_cidade='" + conectaCliente.rs.getInt("id_cidade") + "'");
            conectaCidade.rs.first();
            modeloCliente.setNome_cidade(conectaCidade.rs.getString("nome_cidade"));
            conectaEstado.conecta();
            conectaEstado.executaSQL("select nome_estado from estado where id_estado='" + conectaCidade.rs.getInt("id_estado") + "'");
            conectaEstado.rs.first();
            modeloCliente.setNome_estado(conectaEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            Logger.getLogger(ControleBairro.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectaCliente.desconecta();
        conectaCidade.desconecta();
        conectaBairro.desconecta();
        conectaEstado.desconecta();
        return modeloCliente;
    }
    
        public ModeloTabela preencherTabelaCliente() {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Nome", "Endereço", "RG", "CPF", "Bairro", "Cidade", "Estado"};
        conectaCliente.conecta();
        conectaCliente.executaSQL("select * from cliente inner join bairro on cliente.id_bairro =  bairro.id_bairro inner join cidade on cliente.id_cidade = cidade.id_cidade inner join estado on cidade.id_estado = estado.id_estado");
        try {
            conectaCliente.rs.first();
            do {
                dados.add(new Object[]{conectaCliente.rs.getString("nome_cliente"), conectaCliente.rs.getString("endereco_cliente"), conectaCliente.rs.getString("rg_cliente"), conectaCliente.rs.getString("cpf_cliente"), conectaCliente.rs.getString("nome_bairro"), conectaCliente.rs.getString("nome_cidade"), conectaCliente.rs.getString("nome_estado")});
            } while (conectaCliente.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao preencher ArrayList!!!\nErro: " + ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        return modelo;
    }


}
