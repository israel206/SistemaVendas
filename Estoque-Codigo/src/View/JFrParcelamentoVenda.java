/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.ConectaBanco;
import Controle.ControleParcelamentoVenda;
import Controle.ModeloTabela;
import Model.ModeloParcelamentoVenda;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Mr-Robot
 */
public class JFrParcelamentoVenda extends javax.swing.JFrame {
    
    int qtdParcela, i = 1, cont = 1;//cont usada para verificar quantas parcelas foram geradas
    float porc, valorVenda, valorParcela;
    float valorAtuaParc;
    
    ConectaBanco connParcela = new ConectaBanco();
    ModeloParcelamentoVenda modParcelamento = new ModeloParcelamentoVenda();
    ControleParcelamentoVenda controlParcelamento = new ControleParcelamentoVenda();

    /**
     * Creates new form JFrParcelamentoVenda
     */
    public JFrParcelamentoVenda(int cod) {
        initComponents();
        connParcela.conexao();
        try {
            connParcela.executaSQL("select * from vendas where id_venda=" +cod);
            connParcela.rs.first();
            jTextFieldCodVenda.setText(String.valueOf(cod));
            jTextFieldValorVenda.setText(String.valueOf(connParcela.rs.getFloat("valor_venda")));
            jTextFieldData.setText(String.valueOf(connParcela.rs.getString("data_venda")));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao buscar a venda!\nERRO:"+ex);
        }
    }
    //construtor
    private JFrParcelamentoVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jTextFieldCodVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldValorVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQtdParcelas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldJurosParcelas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jButtonParcelar = new javax.swing.JButton();
        jButtonGerarDuplicadas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParcelasVendas = new javax.swing.JTable();
        jTextFieldData = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Parcelamento Vendas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Parcelamento de Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código Venda:");

        jTextFieldCodVenda.setEnabled(false);

        jLabel3.setText("Valor da Venda:");

        jTextFieldValorVenda.setEnabled(false);

        jLabel4.setText("Data da Venda:");

        jLabel5.setText("Quantidade de Parcelas:");

        jLabel6.setText("Juros das Parcelas:");

        jLabel7.setText("Valor Total:");

        jTextFieldValorTotal.setEnabled(false);

        jButtonParcelar.setText("Parcelar");
        jButtonParcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParcelarActionPerformed(evt);
            }
        });

        jButtonGerarDuplicadas.setText("Gerar Duplicads");
        jButtonGerarDuplicadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarDuplicadasActionPerformed(evt);
            }
        });

        jTableParcelasVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableParcelasVendas);

        jTextFieldData.setEnabled(false);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)))
                                .addGap(111, 111, 111))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonParcelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonGerarDuplicadas))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(195, 195, 195)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jTextFieldQtdParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)
                                        .addComponent(jTextFieldJurosParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldValorTotal)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                                .addComponent(jButtonSair)
                                .addGap(81, 81, 81))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQtdParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldJurosParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonParcelar)
                    .addComponent(jButtonGerarDuplicadas)
                    .addComponent(jButtonSair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(314, 314, 314))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        setSize(new java.awt.Dimension(869, 621));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonParcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParcelarActionPerformed
        // TODO add your handling code here:
        qtdParcela = Integer.parseInt(jTextFieldQtdParcelas.getText());
        porc = Float.parseFloat(jTextFieldJurosParcelas.getText());
        valorVenda = Float.parseFloat(jTextFieldValorVenda.getText());
        valorParcela = valorVenda / qtdParcela;
        jTableParcelasVendas.removeAll();
        preencherTabelaParcelas();
    }//GEN-LAST:event_jButtonParcelarActionPerformed

    private void jButtonGerarDuplicadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarDuplicadasActionPerformed
        // TODO add your handling code here:
        int j = 1;//controlar a inserção da parcelas no banco de dados
        String datavenc = jTextFieldData.getText();//variaveis para armazenar a data
        String dia,mes,ano;//variavel para armazenar a data
        dia = "" + datavenc.charAt(0) + datavenc.charAt(1) + "/";
        mes = "" + datavenc.charAt(3) + datavenc.charAt(4);
        ano = "/" + datavenc.charAt(6) + datavenc.charAt(7) + datavenc.charAt(8) + datavenc.charAt(9);
        int  anoInt = Integer.parseInt("" + datavenc.charAt(6) + datavenc.charAt(7) + datavenc.charAt(8) + datavenc.charAt(9));//converte o ano para inteiro
        int mesInt = Integer.parseInt(mes);//converte o mes para inteiro
        
        while(j < cont){
            if(mesInt < 10){
               modParcelamento.setCodVenda(Integer.parseInt(jTextFieldCodVenda.getText()));
               modParcelamento.setValorParcela(valorParcela + (valorParcela * (porc / 100)));//valor da parcela com porcentagem
               modParcelamento.setValor_total(Float.parseFloat(jTextFieldValorTotal.getText()));
               modParcelamento.setValor_venda(Float.parseFloat(jTextFieldValorVenda.getText()));
               modParcelamento.setNumeroParc(j);
               modParcelamento.setDataVenc(dia + "0" + mesInt + "/" + anoInt);
               controlParcelamento.SalvarParcela(modParcelamento);
            }else{
               modParcelamento.setCodVenda(Integer.parseInt(jTextFieldCodVenda.getText()));
               modParcelamento.setValorParcela(valorParcela + (valorParcela * (porc / 100)));
               modParcelamento.setValor_total(Float.parseFloat(jTextFieldValorTotal.getText()));
               modParcelamento.setValor_venda(Float.parseFloat(jTextFieldValorVenda.getText()));
               modParcelamento.setNumeroParc(j);
               modParcelamento.setDataVenc(dia + mesInt + "/" + anoInt);
               controlParcelamento.SalvarParcela(modParcelamento); 
            }
            mesInt++;
            if(mesInt > 12){//novo valor para o ano
                anoInt++;//incrementa o ano
                mesInt = 1;//inicia o ano novamente
            }
            j++;
        }
        JOptionPane.showMessageDialog(rootPane, "Parcelas geradas!");
        
    }//GEN-LAST:event_jButtonGerarDuplicadasActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    public void preencherTabelaParcelas(){
        
        ArrayList dados = new ArrayList();
        
        //AjustaData dataParcela = new AjustaData();
        
        String[] Colunas = new String[]{"Código", "Data da Venda", "Valor da Parcela"};
        
        float valorTotal = 0;
        String data = jTextFieldData.getText();
        String dia,mes,ano;//variavel para armazenar a data
        dia = "" + data.charAt(0) + data.charAt(1) + "/";
        mes = "" + data.charAt(3) + data.charAt(4);
        ano = "/" + data.charAt(6) + data.charAt(7) + data.charAt(8) + data.charAt(9);
        
        valorAtuaParc = valorParcela + (valorParcela * (porc / 100));//formula para calculo de porcentagem
        
        int anoInt = Integer.parseInt("" + data.charAt(6) + data.charAt(7) + data.charAt(8) + data.charAt(9));//converte o ano para inteiro
        int mesInt = Integer.parseInt(mes);//converte o mes para inteiro
        
        while(i <= qtdParcela) {
            valorTotal = valorTotal + valorAtuaParc;//valor total da venda parcelada
            if(mesInt < 10){
                dados.add(new Object[]{i , dia + "0" + mesInt + "/" + anoInt, valorAtuaParc});//15/06/2020
            }else{
                dados.add(new Object[]{i , dia + mesInt + "/" + anoInt, valorAtuaParc});
            }
            mesInt++;
            if(mesInt > 12){//novo valor para o ano
                anoInt++;//incrementa o ano
                mesInt = 1;//inicia o ano novamente
            }
            i++;
            cont++;
        }
        jTextFieldValorTotal.setText(String.valueOf(valorTotal));//escreve no formulario o valor total da venda
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableParcelasVendas.setModel(modelo);
        jTableParcelasVendas.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTableParcelasVendas.getColumnModel().getColumn(0).setResizable(false);
        jTableParcelasVendas.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableParcelasVendas.getColumnModel().getColumn(1).setResizable(false);
        jTableParcelasVendas.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableParcelasVendas.getColumnModel().getColumn(2).setResizable(false);
        jTableParcelasVendas.getTableHeader().setReorderingAllowed(false);
        jTableParcelasVendas.setAutoResizeMode(jTableParcelasVendas.AUTO_RESIZE_OFF);
        jTableParcelasVendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(JFrParcelamentoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrParcelamentoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrParcelamentoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrParcelamentoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrParcelamentoVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarDuplicadas;
    private javax.swing.JButton jButtonParcelar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableParcelasVendas;
    private javax.swing.JTextField jTextFieldCodVenda;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldJurosParcelas;
    private javax.swing.JTextField jTextFieldQtdParcelas;
    private javax.swing.JTextField jTextFieldValorTotal;
    private javax.swing.JTextField jTextFieldValorVenda;
    // End of variables declaration//GEN-END:variables
}
