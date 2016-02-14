/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleBanco;
import controle.ControleCidade;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloCidade;
import modelo.ModeloTabela;

/**
 *
 * @author Junior
 */
public class FrmCidade extends javax.swing.JFrame {

    ControleBanco conexaoCidadePrimeiro = new ControleBanco();
    ControleBanco conexaoEstadoPrimeiro = new ControleBanco();
    Boolean cadastroNovo;

    public FrmCidade() {
        initComponents();
        preencherTabela();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCidade = new javax.swing.JTable();
        jComboBoxEstado = new javax.swing.JComboBox();
        jButtonSalvarr = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonPrimeiroo = new javax.swing.JButton();
        jButtonUltimoo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximoo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de bairro");
        setName("frame00"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código:");

        jTextFieldCodigo.setEnabled(false);

        jLabel3.setText("Nome:");

        jTextFieldNome.setEnabled(false);

        jLabel4.setText("Estado:");

        jTableCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCidade);

        jComboBoxEstado.setEnabled(false);

        jButtonSalvarr.setText("Salvar");
        jButtonSalvarr.setEnabled(false);
        jButtonSalvarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarrActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonPrimeiroo.setText("Primeiro");
        jButtonPrimeiroo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeirooActionPerformed(evt);
            }
        });

        jButtonUltimoo.setText("Ultimo");
        jButtonUltimoo.setEnabled(false);
        jButtonUltimoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimooActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.setEnabled(false);
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximoo.setText("Proximo");
        jButtonProximoo.setEnabled(false);
        jButtonProximoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximooActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvarr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPrimeiroo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimoo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonProximoo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarr)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonPrimeiroo)
                    .addComponent(jButtonUltimoo)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximoo)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonDeletar)
                    .addComponent(jButtonEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de cadastro de cidades");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Cadastro de cidade");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
//        conexaoCidadePrimeiro.desconecta();
//        conexaoEstadoPrimeiro.desconecta();

    }//GEN-LAST:event_formWindowClosed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        cadastroNovo = false;
        jButtonEditar.setEnabled(false);
        jTextFieldNome.setEnabled(true);
        preencherComboEstado();
        jComboBoxEstado.setEnabled(true);
        jButtonSalvarr.setEnabled(true);
        jButtonDeletar.setEnabled(false);
        jButtonPrimeiroo.setEnabled(false);
        jButtonUltimoo.setEnabled(false);
        jButtonProximoo.setEnabled(false);
        jButtonAnterior.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        ModeloCidade modeloCidade = new ModeloCidade();
        modeloCidade.setCodigo(Integer.valueOf(jTextFieldCodigo.getText()));
        ControleCidade controleCidade = new ControleCidade();
        controleCidade.deletarCidade(modeloCidade);
        jButtonPrimeirooActionPerformed(evt);
        preencherTabela();
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setText("");
        jTextFieldNome.setEnabled(false);
        jComboBoxEstado.removeAllItems();
        jComboBoxEstado.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvarr.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonPrimeiroo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonProximooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximooActionPerformed
        try {
            conexaoCidadePrimeiro.rs.next();
            jTextFieldCodigo.setText(String.valueOf(conexaoCidadePrimeiro.rs.getInt("id_cidade")));
            jTextFieldNome.setText(conexaoCidadePrimeiro.rs.getString("nome_cidade"));
            conexaoEstadoPrimeiro.conecta();
            conexaoEstadoPrimeiro.executaSQL("select nome_estado from estado where id_estado='" + conexaoCidadePrimeiro.rs.getInt("id_estado") + "'");
            conexaoEstadoPrimeiro.rs.first();
            jComboBoxEstado.removeAllItems();
            jComboBoxEstado.addItem(conexaoEstadoPrimeiro.rs.getString("nome_estado"));
        } catch (SQLException ex) {

            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
            //            JOptionPane.showMessageDialog(null, "Erro ir para o registro anterior!!!\nErro: " + ex.getMessage());
        }
        conexaoCidadePrimeiro.desconecta();
        conexaoEstadoPrimeiro.desconecta();
    }//GEN-LAST:event_jButtonProximooActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        try {
            conexaoCidadePrimeiro.rs.previous();
            jTextFieldCodigo.setText(String.valueOf(conexaoCidadePrimeiro.rs.getInt("id_cidade")));
            jTextFieldNome.setText(conexaoCidadePrimeiro.rs.getString("nome_cidade"));
            conexaoEstadoPrimeiro.conecta();
            conexaoEstadoPrimeiro.executaSQL("select nome_estado from estado where id_estado='" + conexaoCidadePrimeiro.rs.getInt("id_estado") + "'");
            conexaoEstadoPrimeiro.rs.first();
            jComboBoxEstado.removeAllItems();
            jComboBoxEstado.addItem(conexaoEstadoPrimeiro.rs.getString("nome_estado"));
        } catch (SQLException ex) {

            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
            //            JOptionPane.showMessageDialog(null, "Erro ir para o registro anterior!!!\nErro: " + ex.getMessage());
        }
        conexaoCidadePrimeiro.desconecta();
        conexaoEstadoPrimeiro.desconecta();
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonUltimooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimooActionPerformed
        try {
            conexaoCidadePrimeiro.rs.last();
            jTextFieldCodigo.setText(String.valueOf(conexaoCidadePrimeiro.rs.getInt("id_cidade")));
            jTextFieldNome.setText(conexaoCidadePrimeiro.rs.getString("nome_cidade"));
            conexaoEstadoPrimeiro.conecta();
            conexaoEstadoPrimeiro.executaSQL("select nome_estado from estado where id_estado='" + conexaoCidadePrimeiro.rs.getInt("id_estado") + "'");
            conexaoEstadoPrimeiro.rs.first();
            jComboBoxEstado.removeAllItems();
            jComboBoxEstado.addItem(conexaoEstadoPrimeiro.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar o ultimo registro!!!\nErro: " + ex.getMessage());
        }
        conexaoCidadePrimeiro.desconecta();
        conexaoEstadoPrimeiro.desconecta();
    }//GEN-LAST:event_jButtonUltimooActionPerformed

    private void jButtonPrimeirooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeirooActionPerformed
        try {
            conexaoCidadePrimeiro.conecta();
            conexaoCidadePrimeiro.executaSQL("select * from cidade order by id_cidade");
            conexaoCidadePrimeiro.rs.first();
            jTextFieldCodigo.setText(String.valueOf(conexaoCidadePrimeiro.rs.getInt("id_cidade")));
            jTextFieldNome.setText(conexaoCidadePrimeiro.rs.getString("nome_cidade"));
            conexaoEstadoPrimeiro.conecta();
            conexaoEstadoPrimeiro.executaSQL("select nome_estado from estado where id_estado='" + conexaoCidadePrimeiro.rs.getInt("id_estado") + "'");
            conexaoEstadoPrimeiro.rs.first();
            jComboBoxEstado.removeAllItems();
            jComboBoxEstado.addItem(conexaoEstadoPrimeiro.rs.getString("nome_estado"));
            jButtonUltimoo.setEnabled(true);
            jButtonAnterior.setEnabled(true);
            jButtonProximoo.setEnabled(true);
            jButtonDeletar.setEnabled(true);
            jButtonEditar.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar o primeiro registro!!!\nErro: " + ex.getMessage());
        }
        conexaoCidadePrimeiro.desconecta();
        conexaoEstadoPrimeiro.desconecta();
    }//GEN-LAST:event_jButtonPrimeirooActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        cadastroNovo = true;
        jButtonUltimoo.setEnabled(false);
        jButtonAnterior.setEnabled(false);
        jButtonProximoo.setEnabled(false);
        jButtonPrimeiroo.setEnabled(false);
        //        conexaoCidadePrimeiro.desconecta();
        //        conexaoEstadoPrimeiro.desconecta();
        jTextFieldNome.setText("");
        jTextFieldNome.setEnabled(true);
        jTextFieldCodigo.setText("");
        jComboBoxEstado.setEnabled(true);
        jComboBoxEstado.removeAllItems();
        preencherComboEstado();
        jButtonNovo.setEnabled(false);
        jButtonSalvarr.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarrActionPerformed
        ControleBanco conexaoEstado = new ControleBanco();
        try {
            ModeloCidade modeloCidade = new ModeloCidade();
            modeloCidade.setNome(jTextFieldNome.getText());
            conexaoEstado.conecta();
            conexaoEstado.executaSQL("select id_estado from estado where nome_estado='" + jComboBoxEstado.getSelectedItem() + "'");
            conexaoEstado.rs.first();
            modeloCidade.setCod_estado(conexaoEstado.rs.getInt("id_estado"));
            ControleCidade controleCidade = new ControleCidade();
            if (cadastroNovo) {
                controleCidade.inserirCidade(modeloCidade);
            } else {
                modeloCidade.setCodigo(Integer.valueOf(jTextFieldCodigo.getText()));
                controleCidade.editarCidade(modeloCidade);
            }
            jButtonSalvarr.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonPrimeiroo.setEnabled(true);
            jTextFieldNome.setText("");
            jTextFieldCodigo.setText("");
            jComboBoxEstado.removeAllItems();
            jTextFieldNome.setEnabled(false);
            jComboBoxEstado.setEnabled(false);
            preencherTabela();
        } catch (SQLException ex) {
            Logger.getLogger(FrmCidade.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar cidade!!!\nErro: " + ex.getMessage());
        }
        conexaoEstado.desconecta();
    }//GEN-LAST:event_jButtonSalvarrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmEstado frmEstado = new FrmEstado();
        frmEstado.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void preencherTabela() {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Nome", "Estado"};
        conexaoCidadePrimeiro.conecta();
        conexaoCidadePrimeiro.executaSQL("select * from cidade inner join estado on cidade.id_estado = estado.id_estado order by id_cidade");
        try {

            conexaoCidadePrimeiro.rs.first();
            do {
                dados.add(new Object[]{conexaoCidadePrimeiro.rs.getInt("id_cidade"), conexaoCidadePrimeiro.rs.getString("nome_cidade"), conexaoCidadePrimeiro.rs.getString("nome_estado")});
            } while (conexaoCidadePrimeiro.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!!!\nErro: " + ex.getMessage());
        }

        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableCidade.setModel(modelo);
//        jTableCidade.getColumnModel().getColumn(0).setPreferredWidth(80);
//        jTableCidade.getColumnModel().getColumn(0).setResizable(false);
//        jTableCidade.getColumnModel().getColumn(1).setPreferredWidth(280);
//        jTableCidade.getColumnModel().getColumn(1).setResizable(false);
//        jTableCidade.getColumnModel().getColumn(2).setPreferredWidth(180);
//        jTableCidade.getColumnModel().getColumn(2).setResizable(false);
//        jTableCidade.getTableHeader().setReorderingAllowed(false);
//        jTableCidade.setAutoResizeMode(jTableCidade.AUTO_RESIZE_OFF);
//        jTableCidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public final void preencherComboEstado() {
        ControleBanco conexao = new ControleBanco();
        conexao.conecta();
        conexao.executaSQL("select * from estado order by nome_estado");
        jComboBoxEstado.removeAllItems();
        try {
            conexao.rs.first();
            do {
                jComboBoxEstado.addItem(conexao.rs.getString("nome_estado"));
            } while (conexao.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher combo estados!!!\nErro: " + ex.getMessage());
        }
        conexao.desconecta();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiroo;
    private javax.swing.JButton jButtonProximoo;
    private javax.swing.JButton jButtonSalvarr;
    private javax.swing.JButton jButtonUltimoo;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
