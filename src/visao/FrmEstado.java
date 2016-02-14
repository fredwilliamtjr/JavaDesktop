/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleBanco;
import modelo.ModeloTabela;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Junior
 */
public class FrmEstado extends javax.swing.JFrame {

    ControleBanco conexaoEstado = new ControleBanco();
    

    /**
     * Creates new form FrmEstado
     */
    public FrmEstado() {
        initComponents();
        conexaoEstado.conecta();
        preencherTabela("select * from estado order by id_estado");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSigla = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de estado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código:");

        jTextFieldCodigo.setEnabled(false);

        jLabel3.setText("Nome:");

        jTextFieldNome.setEnabled(false);

        jLabel4.setText("Sigla:");

        jTextFieldSigla.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableEstado);

        jButtonPrimeiro.setText("Primeiro");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonUltimo.setText("Ultimo");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText("Proximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(2, 2, 2)
                        .addComponent(jButtonSalvar)
                        .addGap(2, 2, 2)
                        .addComponent(jButtonEditar)
                        .addGap(2, 2, 2)
                        .addComponent(jButtonDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPrimeiro)
                        .addGap(2, 2, 2)
                        .addComponent(jButtonUltimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo)))
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
                    .addComponent(jTextFieldSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonDeletar)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonUltimo)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de cadastro de estados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        setSize(new java.awt.Dimension(784, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            PreparedStatement pst = conexaoEstado.conn.prepareStatement("insert into estado (nome_estado, sigla_estado)values(?,?)");
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jTextFieldSigla.getText());
            pst.execute();
            
            jButtonNovo.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonDeletar.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldSigla.setEnabled(false);
            jTextFieldNome.setText("");
            jTextFieldSigla.setText("");
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonPrimeiro.setEnabled(true);
            jButtonProximo.setEnabled(true);
            jButtonAnterior.setEnabled(true);
            jButtonUltimo.setEnabled(true);
            JOptionPane.showMessageDialog(rootPane, "Salvo com Sucesso!!!");
            preencherTabela("select * from estado order by id_estado");

        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao Salvar!!!\nErro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexaoEstado.desconecta();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        try {
//        conexaoEstado.executaSQL("delete from estado where sigla_estado = '"+jTextFieldSigla.getText()+"'");
//        JOptionPane.showMessageDialog(rootPane, "Excluido com Sucesso!!!");
            PreparedStatement pst = conexaoEstado.conn.prepareStatement("delete from estado where sigla_estado = ?");
            pst.setString(1, jTextFieldSigla.getText());
            pst.executeUpdate();
            jButtonDeletar.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldSigla.setEnabled(false);
            jTextFieldNome.setText("");
            jTextFieldSigla.setText("");
            jButtonNovo.setEnabled(true);
            jButtonEditar.setEnabled(false);
            preencherTabela("select * from estado order by id_estado");
            JOptionPane.showMessageDialog(rootPane, "Excluido com Sucesso!!!");
        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao Excluir!!!");
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jTextFieldNome.requestFocus();
        jButtonPrimeiro.setEnabled(false);
        jButtonProximo.setEnabled(false);
        jButtonAnterior.setEnabled(false);
        jButtonUltimo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        jButtonEditar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldSigla.setEnabled(true);
        try {
            conexaoEstado.executaSQL("select * from estado");
            conexaoEstado.rs.first();
            jTextFieldCodigo.setText(String.valueOf(conexaoEstado.rs.getInt("id_estado")));
            jTextFieldNome.setText(conexaoEstado.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conexaoEstado.rs.getString("sigla_estado"));

        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao exibir!!!\nErro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        try {
            //conecta.executaSQL("select * from estado");
            conexaoEstado.rs.last();
            jTextFieldCodigo.setText(String.valueOf(conexaoEstado.rs.getInt("id_estado")));
            jTextFieldNome.setText(conexaoEstado.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conexaoEstado.rs.getString("sigla_estado"));

        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao exibir!!!\nErro: " + ex.getMessage());
        }


    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        try {
            //conecta.executaSQL("select * from estado");
            conexaoEstado.rs.previous();
            jTextFieldCodigo.setText(String.valueOf(conexaoEstado.rs.getInt("id_estado")));
            jTextFieldNome.setText(conexaoEstado.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conexaoEstado.rs.getString("sigla_estado"));

        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao exibir!!!\nErro: " + ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        try {
            //conecta.executaSQL("select * from estado");
            conexaoEstado.rs.next();
            jTextFieldCodigo.setText(String.valueOf(conexaoEstado.rs.getInt("id_estado")));
            jTextFieldNome.setText(conexaoEstado.rs.getString("nome_estado"));
            jTextFieldSigla.setText(conexaoEstado.rs.getString("sigla_estado"));

        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao exibir!!!\nErro: " + ex.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        try {
//        conexaoEstado.executaSQL("delete from estado where sigla_estado = '"+jTextFieldSigla.getText()+"'");
//        JOptionPane.showMessageDialog(rootPane, "Excluido com Sucesso!!!");
            PreparedStatement pst = conexaoEstado.conn.prepareStatement("update estado set nome_estado=?,sigla_estado=? where id_estado=?");
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jTextFieldSigla.getText());
            pst.setInt(3, Integer.parseInt(jTextFieldCodigo.getText()));
            pst.execute();
            jButtonDeletar.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            jTextFieldSigla.setEnabled(false);
            jTextFieldNome.setText("");
            jTextFieldSigla.setText("");
            jButtonNovo.setEnabled(true);
            jButtonEditar.setEnabled(false);
            preencherTabela("select * from estado order by id_estado");
            JOptionPane.showMessageDialog(rootPane, "Alterado com Sucesso!!!");
        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao Excluir!!!\nErro: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldSigla.setEnabled(false);
        jTextFieldNome.setText("");
        jTextFieldSigla.setText("");
        jButtonEditar.setEnabled(false);
        jButtonPrimeiro.setEnabled(true);
        jButtonProximo.setEnabled(true);
        jButtonAnterior.setEnabled(true);
        jButtonUltimo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public void preencherTabela(String SQL) {
        ArrayList dados = new ArrayList();
        String [] Colunas = new String[]{"ID", "Nome", "Sigla"};
        conexaoEstado.executaSQL(SQL);
        try {
            
            conexaoEstado.rs.first();
            do {
                dados.add(new Object[]{conexaoEstado.rs.getInt("id_estado"),conexaoEstado.rs.getString("nome_estado"),conexaoEstado.rs.getString("sigla_estado")});
            } while (conexaoEstado.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!!!\nErro: " + ex.getMessage());
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEstado.setModel(modelo);
//        jTableEstado.getColumnModel().getColumn(0).setPreferredWidth(80);
//        jTableEstado.getColumnModel().getColumn(0).setResizable(false);
//        jTableEstado.getColumnModel().getColumn(1).setPreferredWidth(280);
//        jTableEstado.getColumnModel().getColumn(1).setResizable(false);
//        jTableEstado.getColumnModel().getColumn(2).setPreferredWidth(180);
//        jTableEstado.getColumnModel().getColumn(2).setResizable(false);
//        jTableEstado.getTableHeader().setReorderingAllowed(false);
//        jTableEstado.setAutoResizeMode(jTableEstado.AUTO_RESIZE_OFF);
//        jTableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSigla;
    // End of variables declaration//GEN-END:variables
}