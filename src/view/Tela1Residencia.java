/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ResidenciaDao;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.Residencia;
import tabela.TabelaResidencia;

/**
 *
 * @author Armano
 */
public class Tela1Residencia extends javax.swing.JInternalFrame {
   
   private static int id = 0;
    private Residencia residencia = new Residencia();
    private List<Residencia> list;
    private TabelaResidencia modelTable = new TabelaResidencia();
    ResidenciaDao controle = new ResidenciaDao();
    
    /**
     * Creates new form Residencia
     */
    public Tela1Residencia() {
        initComponents();
         jTableCadastro1.setModel(modelTable);
        modelTable.lerTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NomeField1 = new javax.swing.JTextField();
        blocojComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tipojComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ValorApagarField2 = new javax.swing.JTextField();
        ValorReabilitacaoField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LocalizacaoField1 = new javax.swing.JTextField();
        jCboEstadoOcupacao1 = new javax.swing.JComboBox<>();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        bontes1 = new javax.swing.JPanel();
        NovoImovel = new javax.swing.JButton();
        DeletarImovel = new javax.swing.JButton();
        RefreshImovel = new javax.swing.JButton();
        SalvarImovel = new javax.swing.JButton();
        PesaquisartField1 = new javax.swing.JTextField();
        pesquisaImovel = new javax.swing.JButton();
        RelatorioImovel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadastro1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1052, 721));

        jLabel2.setText("Nome");

        jLabel3.setText("Bloco");

        blocojComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A", "B", "C", "D", "E", "F", "G" }));

        jLabel5.setText("Tipo");

        tipojComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "UM", "Dois", "Treis", "Quantro" }));

        jLabel6.setText("Estado da casa ");

        jLabel8.setText("Valor do Rendamento");

        jLabel9.setText("Valor de Reabilitacao");

        jLabel11.setText("MT");

        jLabel12.setText("MT");

        jLabel4.setText("Localizacao");

        jLabel7.setText("Disponibildade");

        jCboEstadoOcupacao1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "True", "False", "" }));

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bom", "Mao", "Manutecao" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LocalizacaoField1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(blocojComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NomeField1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCboEstadoOcupacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(tipojComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ValorReabilitacaoField4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(ValorApagarField2))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NomeField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(ValorApagarField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(tipojComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(ValorReabilitacaoField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blocojComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LocalizacaoField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jCboEstadoOcupacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        NovoImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addFunc32.png"))); // NOI18N
        NovoImovel.setText("Novo");

        DeletarImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Delete_3.png"))); // NOI18N
        DeletarImovel.setText("Deletar");
        DeletarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarImovelActionPerformed(evt);
            }
        });

        RefreshImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh-24.png"))); // NOI18N
        RefreshImovel.setText("Actualizar");
        RefreshImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshImovelActionPerformed(evt);
            }
        });

        SalvarImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Accept-icon32.png"))); // NOI18N
        SalvarImovel.setText("Gravar");
        SalvarImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarImovelActionPerformed(evt);
            }
        });

        pesquisaImovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pes32.jpg"))); // NOI18N

        RelatorioImovel.setText("Relatorio");

        javax.swing.GroupLayout bontes1Layout = new javax.swing.GroupLayout(bontes1);
        bontes1.setLayout(bontes1Layout);
        bontes1Layout.setHorizontalGroup(
            bontes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bontes1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(NovoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(SalvarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(RefreshImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(DeletarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(RelatorioImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(PesaquisartField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesquisaImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        bontes1Layout.setVerticalGroup(
            bontes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bontes1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(bontes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bontes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NovoImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeletarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RefreshImovel)
                        .addComponent(SalvarImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PesaquisartField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RelatorioImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTableCadastro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCadastro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCadastro1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCadastro1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Cadastrar Imovel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bontes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bontes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeletarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarImovelActionPerformed
        // TODO add your handling code here;

        try {

            TabelaResidencia tb = new TabelaResidencia(list);

            controle.removerResidencia(id);
            modelTable.lerTabela();
            //
            //  controle.actualizar(residencia);
            //   updateTable();
            JOptionPane.showMessageDialog(null, "Removido com sucesso!!!!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover" + ex);
        }
    }//GEN-LAST:event_DeletarImovelActionPerformed

    private void RefreshImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshImovelActionPerformed
        // TODO add your handling code here:

        try {

            String nome = this.NomeField1.getText();
            String estado = this.jComboBoxEstado.getSelectedItem() + "";

            //            String nome = this.NomeField1.getText();
            String localizacao = this.LocalizacaoField1.getText();
            String valorArendamento = this.ValorApagarField2.getText();
            String valorReabilitacaoMax = this.ValorReabilitacaoField4.getText();

            String bloco = this.blocojComboBox1.getSelectedItem() + "";
            String Tipo = this.tipojComboBox2.getSelectedItem() + "";
            String estadoOcupacao = this.jCboEstadoOcupacao1.getSelectedItem() + "";

            Residencia residencia = new Residencia(nome, bloco, Tipo, estado, valorArendamento, valorReabilitacaoMax, localizacao, estadoOcupacao, new Date());

            controle.actualizar(residencia);
            updateTable();
            //  desabilitar();
            JOptionPane.showMessageDialog(null, "Funcionario salvo com sucesso");

            limparCampos();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro de insersao : " + erro);
        }
    }//GEN-LAST:event_RefreshImovelActionPerformed

    private void SalvarImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarImovelActionPerformed
        // TODO add your handling code here:

        try {

            String nome = this.NomeField1.getText();
            String estado = this.jComboBoxEstado.getSelectedItem() + "";

            //            String nome = this.NomeField1.getText();
            String localizacao = this.LocalizacaoField1.getText();
            String valorArendamento = this.ValorApagarField2.getText();
            String valorReabilitacaoMax = this.ValorReabilitacaoField4.getText();

            String bloco = this.blocojComboBox1.getSelectedItem() + "";
            String Tipo = this.tipojComboBox2.getSelectedItem() + "";
            String estadoOcupacao = this.jCboEstadoOcupacao1.getSelectedItem() + "";

            Residencia residencia = new Residencia(nome, bloco, Tipo, estado, valorArendamento, valorReabilitacaoMax, localizacao, estadoOcupacao, new Date());

            controle.salvar(residencia);
            updateTable();
            //  desabilitar();
            JOptionPane.showMessageDialog(null, "Funcionario salvo com sucesso");

            limparCampos();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro de insersao : " + erro);
        }
        modelTable.lerTabela();
    }//GEN-LAST:event_SalvarImovelActionPerformed

    private void jTableCadastro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCadastro1MouseClicked
        // TODO add your handling code here:

        //

        this.residencia = modelTable.mouseclick(jTableCadastro1.getSelectedRow());
        id = residencia.getIdResidencia();

        NomeField1.setText(this.residencia.getNome());
        jComboBoxEstado.setSelectedItem(this.residencia.getEstado());
        LocalizacaoField1.setText(this.residencia.getLocalizacao());
        ValorApagarField2.setText(this.residencia.getValorArendamento());
        ValorReabilitacaoField4.setText(this.residencia.getValorReabilitacaoMax());

        blocojComboBox1.setSelectedItem(this.residencia.getBloco());
        tipojComboBox2.setSelectedItem(this.residencia.getTipo());
        jCboEstadoOcupacao1.setSelectedItem(this.residencia.getEstadoOucupado());

    }//GEN-LAST:event_jTableCadastro1MouseClicked
public void limparCampos() {

        
        NomeField1.setText("");
        jComboBoxEstado.setSelectedIndex(-1);
        LocalizacaoField1.setText("");
        ValorApagarField2.setText("");
        ValorReabilitacaoField4.setText("");

        blocojComboBox1.setSelectedIndex(-1);
        tipojComboBox2.setSelectedIndex(-1);
        jCboEstadoOcupacao1.setSelectedIndex(-1);
        
        
    }
                                          
public void updateTable() {
        this.list = controle.findAll();
//        modelTable ;
        jTableCadastro1.setModel(modelTable);

        jTableCadastro1.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTableCadastro1.getColumnModel().getColumn(0).setResizable(false);
        jTableCadastro1.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableCadastro1.getColumnModel().getColumn(1).setResizable(false);
        jTableCadastro1.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableCadastro1.getColumnModel().getColumn(2).setResizable(false);
        jTableCadastro1.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTableCadastro1.getColumnModel().getColumn(3).setResizable(false);
        jTableCadastro1.getColumnModel().getColumn(4).setPreferredWidth(200);
        jTableCadastro1.getColumnModel().getColumn(4).setResizable(false);
        jTableCadastro1.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTableCadastro1.getColumnModel().getColumn(5).setResizable(false);
        jTableCadastro1.getColumnModel().getColumn(6).setPreferredWidth(200);
        jTableCadastro1.getColumnModel().getColumn(6).setResizable(false);
        jTableCadastro1.getColumnModel().getColumn(7).setPreferredWidth(200);
        jTableCadastro1.getColumnModel().getColumn(7).setResizable(false);
         jTableCadastro1.getColumnModel().getColumn(8).setPreferredWidth(200);
        jTableCadastro1.getColumnModel().getColumn(8).setResizable(false);
        jTableCadastro1.getColumnModel().getColumn(9).setPreferredWidth(200);
        jTableCadastro1.getColumnModel().getColumn(9).setResizable(false);

        jTableCadastro1.getTableHeader().setReorderingAllowed(false);

        jTableCadastro1.setAutoResizeMode(jTableCadastro1.AUTO_RESIZE_OFF);
        jTableCadastro1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletarImovel;
    private javax.swing.JTextField LocalizacaoField1;
    private javax.swing.JTextField NomeField1;
    private javax.swing.JButton NovoImovel;
    private javax.swing.JTextField PesaquisartField1;
    private javax.swing.JButton RefreshImovel;
    private javax.swing.JButton RelatorioImovel;
    private javax.swing.JButton SalvarImovel;
    private javax.swing.JTextField ValorApagarField2;
    private javax.swing.JTextField ValorReabilitacaoField4;
    private javax.swing.JComboBox<String> blocojComboBox1;
    private javax.swing.JPanel bontes1;
    private javax.swing.JComboBox<String> jCboEstadoOcupacao1;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadastro1;
    private javax.swing.JButton pesquisaImovel;
    private javax.swing.JComboBox<String> tipojComboBox2;
    // End of variables declaration//GEN-END:variables
}
