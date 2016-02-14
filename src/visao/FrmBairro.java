/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleBairro;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import modelo.ModeloBairro;

/**
 *
 * @author Junior
 */
public class FrmBairro extends javax.swing.JFrame {

    ControleBairro controleBairro = new ControleBairro();
    ModeloBairro modeloBairro = new ModeloBairro();
    Boolean cadastroNovo;

    public FrmBairro() {
        initComponents();
        preencherTabelaBairro();

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
        jComboBoxCidade = new javax.swing.JComboBox();
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

        jLabel4.setText("Cidade:");

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

        jComboBoxCidade.setEnabled(false);
        jComboBoxCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxCidadeFocusGained(evt);
            }
        });
        jComboBoxCidade.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCidadePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCidadePopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBoxCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxCidadeMouseClicked(evt);
            }
        });
        jComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadeActionPerformed(evt);
            }
        });

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvarr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPrimeiroo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimoo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximoo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel1.setText("Formulario de cadastro de bairros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarrActionPerformed
        modeloBairro.setNome(jTextFieldNome.getText());
        modeloBairro.setNome_Cidade("" + jComboBoxCidade.getSelectedItem());
        if (cadastroNovo) {
            controleBairro.inserirBairro(modeloBairro);
        } else {
            modeloBairro.setCodigo(Integer.valueOf(jTextFieldCodigo.getText()));
            controleBairro.editarBairro(modeloBairro);
        }
        jButtonSalvarr.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonPrimeiroo.setEnabled(true);
        jTextFieldNome.setText("");
        jTextFieldCodigo.setText("");
        jComboBoxCidade.removeAllItems();
        jTextFieldNome.setEnabled(false);
        jComboBoxCidade.setEnabled(false);
        preencherTabelaBairro();
    }//GEN-LAST:event_jButtonSalvarrActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        cadastroNovo = true;
        jButtonUltimoo.setEnabled(false);
        jButtonAnterior.setEnabled(false);
        jButtonProximoo.setEnabled(false);
        jButtonPrimeiroo.setEnabled(false);
        jTextFieldNome.setText("");
        jTextFieldNome.setEnabled(true);
        jTextFieldCodigo.setText("");
        jComboBoxCidade.setEnabled(true);
        jComboBoxCidade.removeAllItems();
        preencherComboCidades();
        jButtonNovo.setEnabled(false);
        jButtonSalvarr.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonDeletar.setEnabled(false);
        jTextFieldNome.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPrimeirooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeirooActionPerformed
        modeloBairro = controleBairro.navergarBancoBairro("primeiro");
        jTextFieldCodigo.setText(String.valueOf(modeloBairro.getCodigo()));
        jTextFieldNome.setText(modeloBairro.getNome());
        jComboBoxCidade.removeAllItems();
        jComboBoxCidade.addItem(modeloBairro.getNome_Cidade());
        jButtonUltimoo.setEnabled(true);
        jButtonAnterior.setEnabled(true);
        jButtonProximoo.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jButtonEditar.setEnabled(true);
    }//GEN-LAST:event_jButtonPrimeirooActionPerformed

    private void jButtonUltimooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimooActionPerformed
        modeloBairro = controleBairro.navergarBancoBairro("ultimo");
        jTextFieldCodigo.setText(String.valueOf(modeloBairro.getCodigo()));
        jTextFieldNome.setText(modeloBairro.getNome());
        jComboBoxCidade.removeAllItems();
        jComboBoxCidade.addItem(modeloBairro.getNome_Cidade());
    }//GEN-LAST:event_jButtonUltimooActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        modeloBairro = controleBairro.navergarBancoBairro("anterior");
        jTextFieldCodigo.setText(String.valueOf(modeloBairro.getCodigo()));
        jTextFieldNome.setText(modeloBairro.getNome());
        jComboBoxCidade.removeAllItems();
        jComboBoxCidade.addItem(modeloBairro.getNome_Cidade());
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximooActionPerformed
        modeloBairro = controleBairro.navergarBancoBairro("proximo");
        jTextFieldCodigo.setText(String.valueOf(modeloBairro.getCodigo()));
        jTextFieldNome.setText(modeloBairro.getNome());
        jComboBoxCidade.removeAllItems();
        jComboBoxCidade.addItem(modeloBairro.getNome_Cidade());
    }//GEN-LAST:event_jButtonProximooActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldNome.setText("");
        jTextFieldNome.setEnabled(false);
        jComboBoxCidade.removeAllItems();
        jComboBoxCidade.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvarr.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonPrimeiroo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        modeloBairro.setCodigo(Integer.valueOf(jTextFieldCodigo.getText()));
        controleBairro.deletarBairro(modeloBairro);
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jComboBoxCidade.removeAllItems();
        preencherTabelaBairro();
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        cadastroNovo = false;
        jButtonEditar.setEnabled(false);
        jTextFieldNome.setEnabled(true);
        jComboBoxCidade.setEnabled(true);
        jButtonSalvarr.setEnabled(true);
        jButtonDeletar.setEnabled(false);
        jButtonPrimeiroo.setEnabled(false);
        jButtonUltimoo.setEnabled(false);
        jButtonProximoo.setEnabled(false);
        jButtonAnterior.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);


    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
//        conexaoBairroGeral.desconecta();
//        conexaoCidadeGeral.desconecta();

    }//GEN-LAST:event_formWindowClosed

    private void jComboBoxCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxCidadeMouseClicked

    }//GEN-LAST:event_jComboBoxCidadeMouseClicked

    private void jComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadeActionPerformed

    }//GEN-LAST:event_jComboBoxCidadeActionPerformed

    private void jComboBoxCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxCidadeFocusGained

    }//GEN-LAST:event_jComboBoxCidadeFocusGained

    private void jComboBoxCidadePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCidadePopupMenuWillBecomeVisible
        preencherComboCidades();
    }//GEN-LAST:event_jComboBoxCidadePopupMenuWillBecomeVisible

    private void jComboBoxCidadePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCidadePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCidadePopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmCidade frmcidade = new FrmCidade();
        frmcidade.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void preencherTabelaBairro() {
        jTableCidade.setModel(controleBairro.preencherTabelaBairro());
    }

    private void preencherComboCidades() {
        ArrayList nomesCidades = controleBairro.preencherComboCidade();
        int numeroAtual = 0;
        jComboBoxCidade.removeAllItems();
        do {
            jComboBoxCidade.addItem(nomesCidades.get(numeroAtual));
            numeroAtual = ++numeroAtual;
        } while (nomesCidades.size() > numeroAtual);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBairro().setVisible(true);
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
    private javax.swing.JComboBox jComboBoxCidade;
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
