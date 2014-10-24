
import interface_potus.Cadastro;
import interface_potus.Login;
import interface_potus.Consultae;
import interface_potus.Consultapedido;
import interface_potus.Inserire;
import interface_potus.cadastroforn;
import interface_potus.cadastrop;
import interface_potus.consultaf;
import interface_potus.consultaforn;
import interface_potus.consultap;
import interface_potus.gerapedido;
import interface_potus.relatorio;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GABRIEL
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        lbl_nome = new javax.swing.JLabel();
        lbl_img = new javax.swing.JLabel();
        btn_comanda = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        menu_barra = new javax.swing.JMenuBar();
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

        lbl_nome.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        lbl_nome.setText("Potus System");

        lbl_img.setIcon(new javax.swing.ImageIcon("C:\\Users\\GABRIEL\\Documents\\NetBeansProjects\\Interface_Potus\\bebidas-casamento-2.png")); // NOI18N

        btn_comanda.setText("Comandas");
        btn_comanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comandaActionPerformed(evt);
            }
        });

        btn_sair.setText("Sair");
        btn_sair.setName(""); // NOI18N
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        mn_func.setText("Funcionário");
        mn_func.setEnabled(false);

        mn_func_cad.setText("Cadastro ");
        mn_func_cad.setEnabled(false);
        mn_func_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_func_cadActionPerformed(evt);
            }
        });
        mn_func.add(mn_func_cad);

        mn_func_cons.setText("Consulta/Altera");
        mn_func_cons.setEnabled(false);
        mn_func_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_func_consActionPerformed(evt);
            }
        });
        mn_func.add(mn_func_cons);

        menu_barra.add(mn_func);

        mn_prod.setText("Produto");
        mn_prod.setEnabled(false);

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
        mn_forn.setEnabled(false);

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
        mn_nota.setEnabled(false);

        mn_nota_gera.setText("Gerar Nota");
        mn_nota.add(mn_nota_gera);

        mn_nota_hist.setText("Histórico");
        mn_nota.add(mn_nota_hist);

        menu_barra.add(mn_nota);

        mn_estoque.setText("Estoque");
        mn_estoque.setEnabled(false);

        mn_estoque_cons.setText("Consultar/Alterar");
        mn_estoque_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_estoque_consActionPerformed(evt);
            }
        });
        mn_estoque.add(mn_estoque_cons);

        menu_barra.add(mn_estoque);

        mn_finan.setText("Financeiro");
        mn_finan.setEnabled(false);

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
                .addGap(136, 136, 136)
                .addComponent(lbl_nome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_comanda, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(lbl_img)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_comanda, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed

        System.exit(0);
        
// TODO add your handling code here:
    }//GEN-LAST:event_btn_sairActionPerformed

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

    private void btn_comandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comandaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Não Temos isso ainda");
        
// TODO add your handling code here:
    }//GEN-LAST:event_btn_comandaActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        new Login().setVisible(true);
        Frame1.this.dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comanda;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_nome;
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
    private javax.swing.JMenu mn_nota;
    private javax.swing.JMenuItem mn_nota_gera;
    private javax.swing.JMenuItem mn_nota_hist;
    private javax.swing.JMenu mn_prod;
    private javax.swing.JMenuItem mn_prod_cad;
    private javax.swing.JMenuItem mn_prod_cons;
    // End of variables declaration//GEN-END:variables
}
