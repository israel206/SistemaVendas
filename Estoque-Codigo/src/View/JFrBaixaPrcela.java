/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.ConectaBanco;
import Controle.ControleBaixaParcela;
import Controle.ModeloTabela;
import Model.ModeloBaixaParcela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Mr-Robot
 */
public class JFrBaixaPrcela extends javax.swing.JFrame {

    ModeloBaixaParcela modBaixa = new ModeloBaixaParcela();
    ControleBaixaParcela controlBaixa = new ControleBaixaParcela();
    ConectaBanco connBaixa = new ConectaBanco();
    
    /**
     * Creates new form JFrBaixaPrcela
     */
    public JFrBaixaPrcela() {
        initComponents();
        connBaixa.conexao();
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
        jFormattedTextFieldDataVencParcela = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValorParcela = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodParcela = new javax.swing.JTextField();
        jButtonBuscaParcela = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBaixa = new javax.swing.JTable();
        jButtonBaixa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Baixar Parcelas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Formulario de Baixa de Parcelas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jFormattedTextFieldDataVencParcela.setEnabled(false);

        jLabel3.setText("Data Vencimento:");

        jTextFieldCodVenda.setEnabled(false);

        jLabel4.setText("Código da venda:");

        jTextFieldValorParcela.setEnabled(false);

        jLabel5.setText("Valor da parcela:");

        jLabel2.setText("Código da parcela:");

        jButtonBuscaParcela.setText("Busca");
        jButtonBuscaParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaParcelaActionPerformed(evt);
            }
        });

        jTableBaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableBaixa);

        jButtonBaixa.setText("Efetuar Pagamento");
        jButtonBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaixaActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jFormattedTextFieldDataVencParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(73, 73, 73)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jTextFieldCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextFieldCodParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBuscaParcela)))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jTextFieldValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonBaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscaParcela)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldDataVencParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBaixa)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(485, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscaParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaParcelaActionPerformed
        // TODO add your handling code here:
        int codigo;
        if(!jTextFieldCodParcela.getText().equals("")){
            codigo = Integer.parseInt(jTextFieldCodParcela.getText());
            modBaixa.setCodParc(codigo);
            modBaixa = controlBaixa.Buscaparcela(modBaixa);
            jTextFieldCodVenda.setText(String.valueOf(modBaixa.getCodParc()));
            jTextFieldCodVenda.setText(String.valueOf(modBaixa.getCodVenda()));
            jFormattedTextFieldDataVencParcela.setText(modBaixa.getDatavenc());
            jTextFieldValorParcela.setText(String.valueOf(modBaixa.getValor()));
            preencherTabela("select * from parcela_vendas where cod_venda = '" + jTextFieldCodVenda.getText() + "' order by id_parc_venda");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Informe um número de parcela válida!");
        }
    }//GEN-LAST:event_jButtonBuscaParcelaActionPerformed

    private void jButtonBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaixaActionPerformed
        // TODO add your handling code here:
        modBaixa.setCodParc(Integer.parseInt(jTextFieldCodParcela.getText()));
        controlBaixa.BaixarParcela(modBaixa);
        preencherTabela("select * from parcela_vendas where cod_venda = '" + jTextFieldCodVenda.getText() + "' order by id_parc_venda");
    }//GEN-LAST:event_jButtonBaixaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"Cod. Parc", "Cod. Venda", "Valor", "Estado"};
        
        connBaixa.executaSQL(SQL);
        try {
            connBaixa.rs.first();
            //preenchendo a tabela
            do {
                //buscar dados no resultset
                dados.add(new Object[]{connBaixa.rs.getInt("id_parc_venda"),connBaixa.rs.getString("cod_venda"),connBaixa.rs.getString("valor_parce"),connBaixa.rs.getString("estado")});
            } while(connBaixa.rs.next());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n ERRO: " + ex);
        }
        //instancia do tabela
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableBaixa.setModel(modelo);
        jTableBaixa.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTableBaixa.getColumnModel().getColumn(0).setResizable(false);
        jTableBaixa.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableBaixa.getColumnModel().getColumn(1).setResizable(false);
        jTableBaixa.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableBaixa.getColumnModel().getColumn(2).setResizable(false);
        jTableBaixa.getColumnModel().getColumn(3).setPreferredWidth(105);
        jTableBaixa.getColumnModel().getColumn(3).setResizable(false);
        jTableBaixa.getTableHeader().setReorderingAllowed(false);
        jTableBaixa.setAutoResizeMode(jTableBaixa.AUTO_RESIZE_OFF);
        jTableBaixa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(JFrBaixaPrcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrBaixaPrcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrBaixaPrcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrBaixaPrcela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrBaixaPrcela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBaixa;
    private javax.swing.JButton jButtonBuscaParcela;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataVencParcela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBaixa;
    private javax.swing.JTextField jTextFieldCodParcela;
    private javax.swing.JTextField jTextFieldCodVenda;
    private javax.swing.JTextField jTextFieldValorParcela;
    // End of variables declaration//GEN-END:variables
}
