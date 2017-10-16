/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ClienteDao;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import tabela.TabelaCliente;

/**
 *
 * @author Cossa
 */
public class InternalFrameCliente extends javax.swing.JInternalFrame {

       private Cliente cliente;
    private List<Cliente> list;
    private TabelaCliente modelTable;
    ClienteDao cliDao = new ClienteDao();
    
    public InternalFrameCliente() {
        initComponents();
        desabilitar();
        updateTable();
        //jTextFieldDataIngresso.setText(new Date()+"");
    }
    
     //Metodo para Desabilitar os campos
    public void desabilitar(){
        txtNone.setEnabled(false);
        txtApelido.setEnabled(false);
      txtNacionalidade.setEnabled(false);
        cbGenero.setEnabled(false);
        txtResidencia.setEnabled(false);
        txtDocTipo.setEnabled(false);
        txtNumero.setEnabled(false);
        txtContaco.setEnabled(false);
        txtContactoEmerg.setEnabled(true);
        
        jButtonSalvar.setEnabled(false);
        jButtonActualizar.setEnabled(false);
        jButtonDelectar.setEnabled(false);
        jButtonPesquisar.setEnabled(!false);
    }
    
    //Metodo para limpar os campos
    public void limparCampos(){
         txtNone.setText("");
        txtApelido.setText("");
      txtNacionalidade.setText("");
      // cbGenero.setEnabled(false);
        txtResidencia.setText("");
        txtDocTipo.setText("");
        txtNumero.setText("");
        txtContaco.setText("");
        txtContactoEmerg.setText("");
    }
    
    //metodo que actualiza os dados na tabela
    public void updateTable(){
        this.list = cliDao.findAll();
        modelTable = new TabelaCliente(list);
        TableCliente.setModel(modelTable);
        
//Redimencionamento da tabela
//        jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(100);
//        jTableCliente.getColumnModel().getColumn(0).setResizable(false);
//        jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(150);
//        jTableCliente.getColumnModel().getColumn(1).setResizable(false);
//        jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(150);
//        jTableCliente.getColumnModel().getColumn(2).setResizable(false);
//        jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(200);
//        jTableCliente.getColumnModel().getColumn(3).setResizable(false);
//        jTableCliente.getColumnModel().getColumn(4).setPreferredWidth(200);
//        jTableCliente.getColumnModel().getColumn(4).setResizable(false);
//        jTableCliente.getTableHeader().setReorderingAllowed(false);
//        jTableCliente.setAutoResizeMode(jTableCliente.AUTO_RESIZE_OFF);
//        jTableCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    //Metodo que carega o que estiver selecionado na tabela para as textFields
    private void fillFields(){
        this.cliente = this.list.get(TableCliente.getSelectedRow());
        txtNone.setText(this.cliente.getNome());
        txtApelido.setText(this.cliente.getApelido());
        cbGenero.getItemAt(TableCliente.getSelectedRow());
        txtNacionalidade.setText(this.cliente.getNacionalidade());
        txtResidencia.setText(this.cliente.getResidencia());
        txtDocTipo.setText(this.cliente.getTipoDecumentoIdent());
        txtNumero.setText(this.cliente.getNomero());
        txtValidade.setText(this.cliente.getValidade()+"");
        txtContaco.setText(this.cliente.getContacto());
        txtContactoEmerg.setText(this.cliente.getContactoEmerg());
        
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelButoes = new javax.swing.JPanel();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonDelectar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNone = new javax.swing.JTextField();
        txtApelido = new javax.swing.JTextField();
        txtNacionalidade = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtResidencia = new javax.swing.JTextField();
        txtDocTipo = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtValidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtContaco = new javax.swing.JTextField();
        txtContactoEmerg = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1200, 800));

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setText("Registo de Clientes");
        jPanel3.add(jLabelTitulo);

        jButtonAdicionar.setText("Novo");
        jButtonAdicionar.setToolTipText("Adicionar funcionario");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonDelectar.setText("Remover");
        jButtonDelectar.setToolTipText("Remover um Funcionario");
        jButtonDelectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelectarActionPerformed(evt);
            }
        });

        jButtonSair.setToolTipText("Cancelar");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonPesquisar.setToolTipText("Pesquisar");

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setToolTipText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTextFieldPesquisar.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldPesquisar.setText("Pesquisar");
        jTextFieldPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPesquisarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPesquisarFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelButoesLayout = new javax.swing.GroupLayout(jPanelButoes);
        jPanelButoes.setLayout(jPanelButoesLayout);
        jPanelButoesLayout.setHorizontalGroup(
            jPanelButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAdicionar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addGap(18, 18, 18)
                .addComponent(jButtonActualizar)
                .addGap(18, 18, 18)
                .addComponent(jButtonDelectar)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 933, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addContainerGap())
        );
        jPanelButoesLayout.setVerticalGroup(
            jPanelButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButoesLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanelButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelButoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDelectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jLabel2.setText("Nome :");

        jLabel3.setText("Apelido");

        jLabel4.setText("Nacionalidade");

        jLabel5.setText("genero");

        txtNone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoneActionPerformed(evt);
            }
        });

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", " ", " " }));
        cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroActionPerformed(evt);
            }
        });

        jLabel1.setText("residencia");

        jLabel7.setText("Decumento");

        jLabel8.setText("Numero:");

        jLabel9.setText("Validade:");

        jLabel10.setText("Contacto");

        jLabel11.setText("ContactoEmerg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNacionalidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(txtApelido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNone, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtResidencia))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDocTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContaco, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtNumero)
                            .addComponent(txtContactoEmerg))))
                .addGap(205, 205, 205))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtDocTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtContaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContactoEmerg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanelButoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClienteMouseClicked
        this.fillFields();
        jButtonActualizar.setEnabled(!false);
        jButtonDelectar.setEnabled(!false);
        jButtonPesquisar.setEnabled(!false);

        txtNone.setEnabled(true);
        txtApelido.setEnabled(true);
        txtNacionalidade.setEnabled(true);
        cbGenero.setEnabled(true);
        txtResidencia.setEnabled(true);
        txtDocTipo.setEnabled(true);
        txtNumero.setEnabled(true);
        txtValidade.setEnabled(true);
        txtContaco.setEnabled(true);
        txtContactoEmerg.setEnabled(true);
        
        jButtonSalvar.setEnabled(!false);
        jButtonActualizar.setEnabled(!false);
        jButtonDelectar.setEnabled(!false);
        jButtonPesquisar.setEnabled(!false);
    }//GEN-LAST:event_TableClienteMouseClicked

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
       txtNone.setEnabled(true);
        txtApelido.setEnabled(true);
        txtNacionalidade.setEnabled(true);
        cbGenero.setEnabled(true);
        txtResidencia.setEnabled(true);
        txtDocTipo.setEnabled(true);
        txtNumero.setEnabled(true);
        txtValidade.setEnabled(true);
        txtContaco.setEnabled(true);
        txtContactoEmerg.setEnabled(true);
        jButtonSalvar.setEnabled(true);

        limparCampos();

    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try{
            String nome = this.txtNone.getText();
            String apelido = this.txtApelido.getText();
            String genero = this.cbGenero.getSelectedItem()+"";
            String nacionalidade = this.txtNacionalidade.getText();
            String residencia = this.txtResidencia.getText();
            String tipoDoc = this.txtDocTipo.getText();
            String numero = this.txtNumero.getText();
            String validade = this.txtValidade.getText();
            String contacto =this.txtContaco.getText();
            String contactoEmerg = this.txtContactoEmerg.getText();
            

            Cliente cliente = new Cliente();

            ClienteDao cliDao = new ClienteDao();
            cliDao.salvar(cliente);
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso");
            desabilitar();
            this.updateTable();
        }

        catch(Exception erro)
        {
            JOptionPane.showMessageDialog(null, "erro de insersao : "+erro);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDelectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelectarActionPerformed
        if (TableCliente.getSelectedRow() != -1) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente((int) TableCliente.getValueAt(TableCliente.getSelectedRow(), 0));
            cliDao.removerCliente(0);
            this.updateTable();
        }
    }//GEN-LAST:event_jButtonDelectarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextFieldPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarFocusGained
        jTextFieldPesquisar.setText("");
    }//GEN-LAST:event_jTextFieldPesquisarFocusGained

    private void jTextFieldPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarFocusLost
        jTextFieldPesquisar.setText("Pesquisar");
    }//GEN-LAST:event_jTextFieldPesquisarFocusLost

    private void cbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroActionPerformed

    private void txtNoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCliente;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonDelectar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButoes;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtContaco;
    private javax.swing.JTextField txtContactoEmerg;
    private javax.swing.JTextField txtDocTipo;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNone;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtResidencia;
    private javax.swing.JTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}
