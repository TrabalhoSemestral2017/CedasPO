/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Cossa
 */
public class Tela2Principal extends javax.swing.JFrame {

    /**
     * Creates new form Tela2Principal
     */
    TelaFuncionario telafuncionario = new TelaFuncionario();
    InternalFrameCliente cli = new InternalFrameCliente();
    public Tela2Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        painelPrincipal = new javax.swing.JPanel();
        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        CadastroFuncionario = new javax.swing.JMenuItem();
        cadastroCliente = new javax.swing.JMenuItem();
        CadastroResidencia = new javax.swing.JMenuItem();
        cadastroUsuario = new javax.swing.JMenuItem();
        menuAluguer = new javax.swing.JMenu();
        menuContrato = new javax.swing.JMenu();
        menuRelatorio = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuDefinicao = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        DesktopPane.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1392, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelPrincipal, java.awt.BorderLayout.PAGE_END);

        menuCadastro.setText("Cadastro");

        CadastroFuncionario.setText("Funcionario");
        CadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(CadastroFuncionario);

        cadastroCliente.setText("Cliente");
        cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroCliente);

        CadastroResidencia.setText("Residencia");
        CadastroResidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroResidenciaActionPerformed(evt);
            }
        });
        menuCadastro.add(CadastroResidencia);

        cadastroUsuario.setText("Usuario");
        cadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroUsuario);

        jMenuBar1.add(menuCadastro);

        menuAluguer.setText("Aluguer");
        jMenuBar1.add(menuAluguer);

        menuContrato.setText("Contractos");
        jMenuBar1.add(menuContrato);

        menuRelatorio.setText("Relatorios");

        jMenuItem6.setText("Pagamentos");
        menuRelatorio.add(jMenuItem6);

        jMenuItem7.setText("Dividas");
        menuRelatorio.add(jMenuItem7);

        jMenuBar1.add(menuRelatorio);

        menuDefinicao.setText("Definicao");
        jMenuBar1.add(menuDefinicao);

        menuSobre.setText("Sobre");
        jMenuBar1.add(menuSobre);

        menuAjuda.setText("Ajuda");
        jMenuBar1.add(menuAjuda);

        menuSair.setText("Sair");
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroUsuarioActionPerformed

    private void CadastroResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroResidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroResidenciaActionPerformed

    private void CadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFuncionarioActionPerformed
        
    }//GEN-LAST:event_CadastroFuncionarioActionPerformed

    private void cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteActionPerformed
       DesktopPane.add(cli);
        cli.setVisible(true);
    }//GEN-LAST:event_cadastroClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Tela2Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastroFuncionario;
    private javax.swing.JMenuItem CadastroResidencia;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuItem cadastroCliente;
    private javax.swing.JMenuItem cadastroUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuAluguer;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuContrato;
    private javax.swing.JMenu menuDefinicao;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}