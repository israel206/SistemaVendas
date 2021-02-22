/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.ConectaBanco;
import Controle.ModeloTabela;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Mr-Robot
 */
public class JFrPesquisasVendas extends javax.swing.JFrame {
    
    ConectaBanco connPesquisa = new ConectaBanco();

    /**
     * Creates new form JFrPesquisasVendas
     */
    public JFrPesquisasVendas() {
        initComponents();
        try {
            MaskFormatter form = new MaskFormatter("##/##/####");//elemento que cria o formato da mascara data
            jFormattedTextFieldData_Pesquisa.setFormatterFactory(new DefaultFormatterFactory(form));//atribui a mascara ao campo
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher o a data!\n ERRO: " + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldData_Pesquisa = new javax.swing.JFormattedTextField();
        jButtonPesquisaData = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVenda_Realizadas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDetalhes_venda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Vendas");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Formulário de Pesquisa de Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Digite uma data:");

        jFormattedTextFieldData_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldData_PesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisaData.setText("Pesquisa");
        jButtonPesquisaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaDataActionPerformed(evt);
            }
        });

        jLabel3.setText("Vendas Realizadas");

        jLabel4.setText("Detalhes da Venda");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTableVenda_Realizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableVenda_Realizadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVenda_RealizadasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableVenda_Realizadas);

        jTableDetalhes_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableDetalhes_venda);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(3, 3, 3)
                                .addComponent(jFormattedTextFieldData_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisaData)
                                .addGap(80, 80, 80)
                                .addComponent(jButtonSair)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldData_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaData)
                    .addComponent(jButtonSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(341, 341, 341))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(974, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldData_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldData_PesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldData_PesquisaActionPerformed

    private void jButtonPesquisaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaDataActionPerformed
        // TODO add your handling code here:
        preencherTabelaVenda_realizada("select * from vendas inner join clientes on vendas.id_cliente = clientes.id_cliente where data_venda='"+jFormattedTextFieldData_Pesquisa.getText()+"'");
    }//GEN-LAST:event_jButtonPesquisaDataActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTableVenda_RealizadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVenda_RealizadasMouseClicked
        // TODO add your handling code here:
        int cod = (int)jTableVenda_Realizadas.getValueAt(jTableVenda_Realizadas.getSelectedRow(), 0);
        preencherTabelaDetalhes("select * from vendas inner join itens_venda_produto on vendas.id_venda = itens_venda_produto.id_venda inner join produtos on itens_venda_produto.id_produto = produtos.id_produto where vendas.id_venda="+cod);
    }//GEN-LAST:event_jTableVenda_RealizadasMouseClicked

    public void preencherTabelaVenda_realizada(String SQL){
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"ID", "Data Venda", "Valor da venda", "Cliente"};
        
        connPesquisa.executaSQL(SQL);
        try {
            connPesquisa.rs.first();
            //preenchendo a tabela
            do {
                //buscar dados no resultset
                dados.add(new Object[]{connPesquisa.rs.getString("id_venda"),connPesquisa.rs.getString("data_venda"),connPesquisa.rs.getString("valor_venda"),connPesquisa.rs.getString("id_cliente")});
                //qtd += +1;
            } while(connPesquisa.rs.next());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n ERRO: "+ex);
        }
        //JOptionPane.showMessageDialog(rootPane, "Quantidade de resgistros:" + qtd);
        //instancia do tabela
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableVenda_Realizadas.setModel(modelo);
        jTableVenda_Realizadas.getColumnModel().getColumn(0).setPreferredWidth(55);
        jTableVenda_Realizadas.getColumnModel().getColumn(0).setResizable(false);
        jTableVenda_Realizadas.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableVenda_Realizadas.getColumnModel().getColumn(1).setResizable(false);
        jTableVenda_Realizadas.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableVenda_Realizadas.getColumnModel().getColumn(2).setResizable(false);
        jTableVenda_Realizadas.getColumnModel().getColumn(3).setPreferredWidth(250);
        jTableVenda_Realizadas.getColumnModel().getColumn(3).setResizable(false);
        jTableVenda_Realizadas.getTableHeader().setReorderingAllowed(false);
        jTableVenda_Realizadas.setAutoResizeMode(jTableVenda_Realizadas.AUTO_RESIZE_OFF);
        jTableVenda_Realizadas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void preencherTabelaDetalhes(String SQL){
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"Produtos", "Quantidade"};
        
        connPesquisa.executaSQL(SQL);
        try {
            connPesquisa.rs.first();
            //preenchendo a tabela
            do {
                //buscar dados no resultset
                dados.add(new Object[]{connPesquisa.rs.getString("nome_produto"),connPesquisa.rs.getString("quantidade_produto")});
                //qtd += +1;
            } while(connPesquisa.rs.next());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n ERRO: "+ex);
        }
        //JOptionPane.showMessageDialog(rootPane, "Quantidade de resgistros:" + qtd);
        //instancia do tabela
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableDetalhes_venda.setModel(modelo);
        jTableDetalhes_venda.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableDetalhes_venda.getColumnModel().getColumn(0).setResizable(false);
        jTableDetalhes_venda.getColumnModel().getColumn(1).setPreferredWidth(190);
        jTableDetalhes_venda.getColumnModel().getColumn(1).setResizable(false);
        jTableDetalhes_venda.getTableHeader().setReorderingAllowed(false);
        jTableDetalhes_venda.setAutoResizeMode(jTableVenda_Realizadas.AUTO_RESIZE_OFF);
        jTableDetalhes_venda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(JFrPesquisasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrPesquisasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrPesquisasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrPesquisasVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrPesquisasVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisaData;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldData_Pesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableDetalhes_venda;
    private javax.swing.JTable jTableVenda_Realizadas;
    // End of variables declaration//GEN-END:variables
}
