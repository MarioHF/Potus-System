/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_potus;

import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL
 */
public class cadastrop extends javax.swing.JFrame {

    /**
     * Creates new form cadastrop
     */
    public cadastrop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_descprod = new javax.swing.JTextField();
        txt_nomeprod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_codprod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_cadprod = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sp_qtdprod = new javax.swing.JSpinner();
        btn_voltar1 = new javax.swing.JButton();
        menu_barra = new javax.swing.JMenuBar();
        mn_login = new javax.swing.JMenu();
        mn_login_func = new javax.swing.JMenuItem();
        mn_login_gerente = new javax.swing.JMenuItem();
        mn_func = new javax.swing.JMenu();
        mn_func_cad = new javax.swing.JMenuItem();
        mn_func_cons = new javax.swing.JMenuItem();
        mn_prod = new javax.swing.JMenu();
        mn_prod_cad = new javax.swing.JMenuItem();
        mn_prod_cons = new javax.swing.JMenuItem();
        mn_forn = new javax.swing.JMenu();
        mn_forn_cad = new javax.swing.JMenuItem();
        mn_forn_cons = new javax.swing.JMenuItem();
        mn_forn_gerap = new javax.swing.JMenuItem();
        mn_forn_consp = new javax.swing.JMenuItem();
        mn_nota = new javax.swing.JMenu();
        mn_nota_gera = new javax.swing.JMenuItem();
        mn_nota_hist = new javax.swing.JMenuItem();
        mn_estoque = new javax.swing.JMenu();
        mn_estoque_cons = new javax.swing.JMenuItem();
        mn_finan = new javax.swing.JMenu();
        mn_finan_lista = new javax.swing.JMenuItem();
        mn_finan_relat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_descprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descprodActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro Produto");

        jLabel4.setText("Descrição:");

        jLabel3.setText("Nome:");

        jLabel2.setText("Código:");

        btn_cadprod.setText("Cadastrar");
        btn_cadprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadprodActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade:");

        btn_voltar1.setText("Voltar");
        btn_voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar1ActionPerformed(evt);
            }
        });

        mn_login.setText("Login");

        mn_login_func.setText("Login Funcionário");
        mn_login_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_login_funcActionPerformed(evt);
            }
        });
        mn_login.add(mn_login_func);

        mn_login_gerente.setText("Login Gerente");
        mn_login.add(mn_login_gerente);

        menu_barra.add(mn_login);

        mn_func.setText("Funcionário");

        mn_func_cad.setText("Cadastro ");
        mn_func_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_func_cadActionPerformed(evt);
            }
        });
        mn_func.add(mn_func_cad);

        mn_func_cons.setText("Consulta/Altera");
        mn_func_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_func_consActionPerformed(evt);
            }
        });
        mn_func.add(mn_func_cons);

        menu_barra.add(mn_func);

        mn_prod.setText("Produto");

        mn_prod_cad.setText("Cadastro");
        mn_prod_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_prod_cadActionPerformed(evt);
            }
        });
        mn_prod.add(mn_prod_cad);

        mn_prod_cons.setText("Consulta/Altera ");
        mn_prod_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_prod_consActionPerformed(evt);
            }
        });
        mn_prod.add(mn_prod_cons);

        menu_barra.add(mn_prod);

        mn_forn.setText("Fornecedor");

        mn_forn_cad.setText("Cadastro");
        mn_forn_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_forn_cadActionPerformed(evt);
            }
        });
        mn_forn.add(mn_forn_cad);

        mn_forn_cons.setText("Consulta/Alterar");
        mn_forn_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_forn_consActionPerformed(evt);
            }
        });
        mn_forn.add(mn_forn_cons);

        mn_forn_gerap.setText("Gerar Pedido");
        mn_forn_gerap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_forn_gerapActionPerformed(evt);
            }
        });
        mn_forn.add(mn_forn_gerap);

        mn_forn_consp.setText("Alterar/Consultar Pedido");
        mn_forn_consp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_forn_conspActionPerformed(evt);
            }
        });
        mn_forn.add(mn_forn_consp);

        menu_barra.add(mn_forn);

        mn_nota.setText("Notas");

        mn_nota_gera.setText("Gerar Nota");
        mn_nota.add(mn_nota_gera);

        mn_nota_hist.setText("Histórico");
        mn_nota.add(mn_nota_hist);

        menu_barra.add(mn_nota);

        mn_estoque.setText("Estoque");

        mn_estoque_cons.setText("Consultar/Alterar");
        mn_estoque_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_estoque_consActionPerformed(evt);
            }
        });
        mn_estoque.add(mn_estoque_cons);

        menu_barra.add(mn_estoque);

        mn_finan.setText("Financeiro");

        mn_finan_lista.setText("Listar Contas");
        mn_finan.add(mn_finan_lista);

        mn_finan_relat.setText("Relatório");
        mn_finan_relat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_finan_relatActionPerformed(evt);
            }
        });
        mn_finan.add(mn_finan_relat);

        menu_barra.add(mn_finan);

        setJMenuBar(menu_barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_codprod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btn_cadprod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_nomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_descprod, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sp_qtdprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_codprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nomeprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_descprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sp_qtdprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadprod)
                    .addComponent(btn_voltar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar1ActionPerformed
        cadastrop.this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_voltar1ActionPerformed

    private void mn_login_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_login_funcActionPerformed

        new Login().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_mn_login_funcActionPerformed

    private void mn_func_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_func_cadActionPerformed
        new Cadastro().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mn_func_cadActionPerformed

    private void mn_func_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_func_consActionPerformed
        new consultaf().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mn_func_consActionPerformed

    private void mn_prod_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_prod_cadActionPerformed
        new cadastrop().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mn_prod_cadActionPerformed

    private void mn_prod_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_prod_consActionPerformed

        new consultap().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mn_prod_consActionPerformed

    private void mn_forn_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_forn_cadActionPerformed
        new cadastroforn().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mn_forn_cadActionPerformed

    private void mn_forn_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_forn_consActionPerformed
        new consultaforn().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mn_forn_consActionPerformed

    private void mn_forn_gerapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_forn_gerapActionPerformed
        new gerapedido().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_mn_forn_gerapActionPerformed

    private void mn_forn_conspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_forn_conspActionPerformed
        new Consultapedido().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_mn_forn_conspActionPerformed

    private void mn_estoque_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_estoque_consActionPerformed
        new Consultae().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_mn_estoque_consActionPerformed

    private void mn_finan_relatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_finan_relatActionPerformed
        new relatorio().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_mn_finan_relatActionPerformed

    private void txt_descprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descprodActionPerformed

    private void btn_cadprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadprodActionPerformed
        // TODO add your handling code here:
        
        String nome, cod, desc;
        
        nome = txt_nomeprod.getText();
        cod = txt_codprod.getText();
        desc = txt_descprod.getText();
        
        if(nome.isEmpty()|| cod.isEmpty()|| desc.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Por favor, preencha todos os campos!!");
        }
    }//GEN-LAST:event_btn_cadprodActionPerformed

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
            java.util.logging.Logger.getLogger(cadastrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadprod;
    private javax.swing.JButton btn_voltar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar menu_barra;
    private javax.swing.JMenu mn_estoque;
    private javax.swing.JMenuItem mn_estoque_cons;
    private javax.swing.JMenu mn_finan;
    private javax.swing.JMenuItem mn_finan_lista;
    private javax.swing.JMenuItem mn_finan_relat;
    private javax.swing.JMenu mn_forn;
    private javax.swing.JMenuItem mn_forn_cad;
    private javax.swing.JMenuItem mn_forn_cons;
    private javax.swing.JMenuItem mn_forn_consp;
    private javax.swing.JMenuItem mn_forn_gerap;
    private javax.swing.JMenu mn_func;
    private javax.swing.JMenuItem mn_func_cad;
    private javax.swing.JMenuItem mn_func_cons;
    private javax.swing.JMenu mn_login;
    private javax.swing.JMenuItem mn_login_func;
    private javax.swing.JMenuItem mn_login_gerente;
    private javax.swing.JMenu mn_nota;
    private javax.swing.JMenuItem mn_nota_gera;
    private javax.swing.JMenuItem mn_nota_hist;
    private javax.swing.JMenu mn_prod;
    private javax.swing.JMenuItem mn_prod_cad;
    private javax.swing.JMenuItem mn_prod_cons;
    private javax.swing.JSpinner sp_qtdprod;
    private javax.swing.JTextField txt_codprod;
    private javax.swing.JTextField txt_descprod;
    private javax.swing.JTextField txt_nomeprod;
    // End of variables declaration//GEN-END:variables
}
