/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josew
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        openMenuItem1 = new javax.swing.JMenuItem();
        openMenuItem2 = new javax.swing.JMenuItem();
        fileMenu1 = new javax.swing.JMenu();
        openMenuItem3 = new javax.swing.JMenuItem();
        openMenuItem4 = new javax.swing.JMenuItem();
        openMenuItem5 = new javax.swing.JMenuItem();
        fileMenu2 = new javax.swing.JMenu();
        openMenuItem6 = new javax.swing.JMenuItem();
        openMenuItem7 = new javax.swing.JMenuItem();
        openMenuItem8 = new javax.swing.JMenuItem();
        openMenuItem9 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Carro");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Cadastro");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        openMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem1.setMnemonic('o');
        openMenuItem1.setText("Atualizar");
        openMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem1);

        openMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem2.setMnemonic('o');
        openMenuItem2.setText("Deletar");
        openMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem2);

        menuBar.add(fileMenu);

        fileMenu1.setMnemonic('f');
        fileMenu1.setText("Cliente");

        openMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        openMenuItem3.setMnemonic('o');
        openMenuItem3.setText("Cadastro");
        openMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu1.add(openMenuItem3);

        openMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        openMenuItem4.setMnemonic('o');
        openMenuItem4.setText("Atualizar");
        openMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem4ActionPerformed(evt);
            }
        });
        fileMenu1.add(openMenuItem4);

        openMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        openMenuItem5.setMnemonic('o');
        openMenuItem5.setText("Deletar");
        openMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem5ActionPerformed(evt);
            }
        });
        fileMenu1.add(openMenuItem5);

        menuBar.add(fileMenu1);

        fileMenu2.setMnemonic('f');
        fileMenu2.setText("Venda");

        openMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        openMenuItem6.setMnemonic('o');
        openMenuItem6.setText("Cadastro");
        openMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem6ActionPerformed(evt);
            }
        });
        fileMenu2.add(openMenuItem6);

        openMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        openMenuItem7.setMnemonic('o');
        openMenuItem7.setText("Atualizar Data da Venda");
        openMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem7ActionPerformed(evt);
            }
        });
        fileMenu2.add(openMenuItem7);

        openMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        openMenuItem8.setMnemonic('o');
        openMenuItem8.setText("Atualizar Status da Venda");
        openMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem8ActionPerformed(evt);
            }
        });
        fileMenu2.add(openMenuItem8);

        openMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        openMenuItem9.setMnemonic('o');
        openMenuItem9.setText("Lista Todas as Vendas");
        openMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem9ActionPerformed(evt);
            }
        });
        fileMenu2.add(openMenuItem9);

        menuBar.add(fileMenu2);

        jMenu1.setText("Exit");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        CarroCadastro carro = null;
        try {
            carro = new CarroCadastro();
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        carro.setVisible(true);
        this.desktopPane.add(carro);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void openMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem1ActionPerformed
        CarroAtualizar carro = null;
        try {
            carro = new CarroAtualizar();
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        carro.setVisible(true);
        this.desktopPane.add(carro);
    }//GEN-LAST:event_openMenuItem1ActionPerformed

    private void openMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem2ActionPerformed
        CarroDeletar carro = null;
        try {
            carro = new CarroDeletar();
        } catch (Exception e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        carro.setVisible(true);
        this.desktopPane.add(carro);
    }//GEN-LAST:event_openMenuItem2ActionPerformed

    private void openMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem3ActionPerformed
        ClienteCadastro cliente = null;
        try {
            cliente = new ClienteCadastro();
        } catch (Exception e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        cliente.setVisible(true);
        this.desktopPane.add(cliente);
    }//GEN-LAST:event_openMenuItem3ActionPerformed

    private void openMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem4ActionPerformed
        ClienteAtualizar cliente = null;
        try {
            cliente = new ClienteAtualizar();
        } catch (Exception e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        cliente.setVisible(true);
        this.desktopPane.add(cliente);
    }//GEN-LAST:event_openMenuItem4ActionPerformed

    private void openMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem5ActionPerformed
        ClienteDeletar cliente = null;
        try {
            cliente = new ClienteDeletar();
        } catch (Exception e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        cliente.setVisible(true);
        this.desktopPane.add(cliente);
    }//GEN-LAST:event_openMenuItem5ActionPerformed

    private void openMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem6ActionPerformed
        VendaCadastro venda = null;
        try {
            venda = new VendaCadastro();
        } catch (Exception e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        venda.setVisible(true);
        this.desktopPane.add(venda);
    }//GEN-LAST:event_openMenuItem6ActionPerformed

    private void openMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem7ActionPerformed
        VendaAtualizarData venda = null;
        try {
            venda = new VendaAtualizarData();
        } catch (Exception e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        venda.setVisible(true);
        this.desktopPane.add(venda);
    }//GEN-LAST:event_openMenuItem7ActionPerformed

    private void openMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem8ActionPerformed
        VendaAlterarStatus venda = null;
        try {
            venda = new VendaAlterarStatus();
        } catch (Exception e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        venda.setVisible(true);
        this.desktopPane.add(venda);
    }//GEN-LAST:event_openMenuItem8ActionPerformed

    private void openMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem9ActionPerformed
        VendaListarTodasAsVendas venda = null;
        try {
            venda = new VendaListarTodasAsVendas();
        } catch (Exception e) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, e);
        }
        venda.setVisible(true);
        this.desktopPane.add(venda);
    }//GEN-LAST:event_openMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu fileMenu2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem openMenuItem1;
    private javax.swing.JMenuItem openMenuItem2;
    private javax.swing.JMenuItem openMenuItem3;
    private javax.swing.JMenuItem openMenuItem4;
    private javax.swing.JMenuItem openMenuItem5;
    private javax.swing.JMenuItem openMenuItem6;
    private javax.swing.JMenuItem openMenuItem7;
    private javax.swing.JMenuItem openMenuItem8;
    private javax.swing.JMenuItem openMenuItem9;
    // End of variables declaration//GEN-END:variables
}
