/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controle.ConectaBanco;
import Controle.ControleProduto;
import Controle.ModeloTabela;
import Model.ModeloProdutos;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Mr-Robot
 */
public class JFrProdutos extends javax.swing.JFrame {
    ConectaBanco connProduto = new ConectaBanco();
    ConectaBanco connPesquisa = new ConectaBanco();
    ModeloProdutos mod = new ModeloProdutos();
    ControleProduto control = new ControleProduto(); 
    /** Creates new form JFrProdutos */
    public JFrProdutos() {
        initComponents();
        preencherCombo();
        preencherTabela("select * from produtos ");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldPrcCompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrcVenda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxFornecedor = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jButtonAddFornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cadastro de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código:");

        jLabel3.setText("Preço de Compra:");

        jTextFieldCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setEnabled(false);

        jTextFieldPrcCompra.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPrcCompra.setEnabled(false);

        jLabel4.setText("Produto:");

        jTextFieldNomeProduto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProduto.setEnabled(false);

        jLabel5.setText("Quantidade:");

        jTextFieldQuantidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldQuantidade.setEnabled(false);

        jLabel6.setText("Preço de Venda:");

        jTextFieldPrcVenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPrcVenda.setEnabled(false);

        jLabel7.setText("Fornecedor:");

        jComboBoxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jButtonAddFornecedor.setText("+");
        jButtonAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFornecedorActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPrcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAddFornecedor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPrcVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSair))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPrcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPrcVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonSair)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        setSize(new java.awt.Dimension(997, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        //Campos Habilitado true e Desabilitado false 
        jTextFieldNomeProduto.setEnabled(true);
        jTextFieldPrcCompra.setEnabled(true);
        jTextFieldPrcVenda.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        //Limpando os campos
        jTextFieldCodigo.setText("");
        jTextFieldNomeProduto.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldPrcCompra.setText("");
        jTextFieldPrcVenda.setText("");
        jTextFieldQuantidade.setText("");
        //Botões Habilidado true e Desabilitado false
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        mod.setIdFornecedor((String) jComboBoxFornecedor.getSelectedItem());
        mod.setNomeProduto(jTextFieldNomeProduto.getText());
        mod.setPrecoCompra(Float.parseFloat(jTextFieldPrcCompra.getText()));
        mod.setPrecoVenda(Float.parseFloat(jTextFieldPrcVenda.getText()));
        mod.setQtdProduto(Integer.parseInt(jTextFieldQuantidade.getText()));
        control.inserirProduto(mod);
        jTextFieldNomeProduto.setEnabled(!true);
        jTextFieldPrcCompra.setEnabled(!true);
        jTextFieldPrcVenda.setEnabled(!true);
        jTextFieldQuantidade.setEnabled(!true);
        //Limpando os campos
        jTextFieldCodigo.setText("");
        jTextFieldNomeProduto.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldPrcCompra.setText("");
        jTextFieldPrcVenda.setText("");
        jTextFieldQuantidade.setText("");
        //Botões Habilidado true e Desabilitado false
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        preencherTabela("select * from produtos ");
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        mod.setIdProduto(Integer.parseInt(jTextFieldCodigo.getText()));
        mod.setIdFornecedor((String) jComboBoxFornecedor.getSelectedItem());
        mod.setNomeProduto(jTextFieldNomeProduto.getText());
        mod.setPrecoCompra(Float.parseFloat(jTextFieldPrcCompra.getText()));
        mod.setPrecoVenda(Float.parseFloat(jTextFieldPrcVenda.getText()));
        mod.setQtdProduto(Integer.parseInt(jTextFieldQuantidade.getText()));
        control.editarProduto(mod);
        jTextFieldNomeProduto.setEnabled(!true);
        jTextFieldPrcCompra.setEnabled(!true);
        jTextFieldPrcVenda.setEnabled(!true);
        jTextFieldQuantidade.setEnabled(!true);
        //Limpando os campos
        jTextFieldCodigo.setText("");
        jTextFieldNomeProduto.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldPrcCompra.setText("");
        jTextFieldPrcVenda.setText("");
        jTextFieldQuantidade.setText("");
        //Botões Habilidado true e Desabilitado false
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        preencherTabela("select * from produtos ");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        //Excluido produto
        mod.setIdProduto(Integer.parseInt(jTextFieldCodigo.getText()));
        control.exluirProduto(mod);
        jTextFieldNomeProduto.setEnabled(!true);
        jTextFieldPrcCompra.setEnabled(!true);
        jTextFieldPrcVenda.setEnabled(!true);
        jTextFieldQuantidade.setEnabled(!true);
        //Limpando os campos
        jTextFieldCodigo.setText("");
        jTextFieldNomeProduto.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldPrcCompra.setText("");
        jTextFieldPrcVenda.setText("");
        jTextFieldQuantidade.setText("");
        //Botões Habilidado true e Desabilitado false
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        preencherTabela("select * from produtos ");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        //Campos Habilitado !true = false e Desabilitado !false = true 
        jTextFieldNomeProduto.setEnabled(!true);
        jTextFieldPrcCompra.setEnabled(!true);
        jTextFieldPrcVenda.setEnabled(!true);
        jTextFieldQuantidade.setEnabled(!true);
        //Limpando os campos
        jTextFieldCodigo.setText("");
        jTextFieldNomeProduto.setText("");
        jTextFieldPesquisar.setText("");
        jTextFieldPrcCompra.setText("");
        jTextFieldPrcVenda.setText("");
        jTextFieldQuantidade.setText("");
        //Botões Habilidado true e Desabilitado false
        jButtonSalvar.setEnabled(!true);
        jButtonEditar.setEnabled(!true);
        jButtonExcluir.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
// para carregar os dados na campos
//        mod.setPesquisa(jTextFieldPesquisar.getText());
//        ModelProdutos model = control.buscarProduto(mod);
//        //fazendo a conversão e fazendo a chamada
//        jTextFieldCodigo.setText(String.valueOf(model.getIdProduto()));
//        jTextFieldNomeProduto.setText(model.getNomeProduto());
//        jTextFieldQuantidade.setText(String.valueOf(model.getQtdProduto()));
//        jTextFieldPrcCompra.setText(String.valueOf(model.getPrecoCompra()));
//        jTextFieldPrcVenda.setText(String.valueOf(model.getPrecoVenda()));
//        jComboBoxFornecedor.setSelectedItem(model.getIdFornecedor());
        
        preencherTabela("select * from produtos where nome_produto like '%"+jTextFieldPesquisar.getText()+"%'");
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFornecedorActionPerformed
        JFrFornecedor frm = new JFrFornecedor();
        frm.setVisible(true);
        preencherCombo();
    }//GEN-LAST:event_jButtonAddFornecedorActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        String nome_produto = ""+jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0);
        connProduto.conexao();
        connPesquisa.conexao();
        connProduto.executaSQL("select * from produtos where nome_produto='"+nome_produto+"'");
        try {
            connProduto.rs.first();
            jTextFieldCodigo.setText(String.valueOf(connProduto.rs.getInt("id_produto")));
            jTextFieldNomeProduto.setText(connProduto.rs.getString("nome_produto"));
            jTextFieldQuantidade.setText(String.valueOf(connProduto.rs.getInt("quantidade")));
            jTextFieldPrcCompra.setText(String.valueOf(connProduto.rs.getFloat("preco_compra")));
            jTextFieldPrcVenda.setText(String.valueOf(connProduto.rs.getFloat("preco_venda")));
            connPesquisa.executaSQL("select * from fornecedores where id_fornecedor="+connProduto.rs.getInt("id_fornecedor"));
            connPesquisa.rs.first();
            jComboBoxFornecedor.setSelectedItem(connPesquisa.rs.getString("nome_fornecedor"));
            connPesquisa.desconecta();
            connProduto.desconecta();
            //Otimizando os campos
            jTextFieldNomeProduto.setEnabled(true);
            jTextFieldPrcCompra.setEnabled(true);
            jTextFieldPrcVenda.setEnabled(true);
            jTextFieldQuantidade.setEnabled(true);
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao selecionar os dados!\nERRO:" +ex);
            connPesquisa.desconecta();
            connProduto.desconecta();
        }
    }//GEN-LAST:event_jTableProdutosMouseClicked

    public void preencherCombo(){
        connProduto.conexao();
        //Trazendos os dados do banco para o resultSet
        connProduto.executaSQL("select * from fornecedores order by nome_fornecedor");
        try {
            //setar o 1
            connProduto.rs.first();
            //Removendo itens
            jComboBoxFornecedor.removeAllItems();
             //enquanto estiver registro preenchar a comboBOX
            do{
                jComboBoxFornecedor.addItem(connProduto.rs.getString("nome_fornecedor"));
            }while(connProduto.rs.next());
            connProduto.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher a comboBox!\nERRO"+ ex);
            connProduto.desconecta();
        }
    }
    public void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"Nome Produto", "Quantidade", "Preço"};
        connProduto.conexao();
        connProduto.executaSQL(SQL);
        try {
            connProduto.rs.first();
            //preenchendo a tabela
            do {
                //buscar dados no resultset
                dados.add(new Object[]{connProduto.rs.getString("nome_produto"),connProduto.rs.getString("quantidade"),connProduto.rs.getString("preco_venda")});
            } while(connProduto.rs.next());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n ERRO: " + ex);
        }
        //instancia do tabela
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableProdutos.setModel(modelo);
        jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(520);
        jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(220);
        jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTableProdutos.getTableHeader().setReorderingAllowed(false);
        jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);
        jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        connProduto.desconecta();
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
            java.util.logging.Logger.getLogger(JFrProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddFornecedor;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldPrcCompra;
    private javax.swing.JTextField jTextFieldPrcVenda;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables

}
