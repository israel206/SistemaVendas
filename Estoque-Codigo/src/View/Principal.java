/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.AjustaData;
import Controle.AtualizadoHora;
import Controle.ConectaBanco;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Mr-Robot
 */
public class Principal extends javax.swing.JFrame {
    
    AjustaData ajData = new AjustaData();
    
    ConectaBanco conecta = new ConectaBanco();
    /**
     * Creates new form Principal
     */
    public Principal(String user) {//recebendo uma string no campo
        initComponents();
        // Comando para maximizar tela
        this.setExtendedState(this.getExtendedState() | Principal.MAXIMIZED_BOTH);
        
        conecta.conexao();
        
        jLabelUser.setText(user);
        
        jLData.setText(ajData.retornarData());
        
        AtualizadoHora.start(jLabelHorario);
        
////        //puxando data de vencimento, caso não queira é só comentar o código
////        conecta.executaSQL("select * from vencimento");
////        try {
////            conecta.rs.last();
////            char [] data = conecta.rs.getString("datavenc").toCharArray();
////            jLabelLicExpiracao.setText( "O Sistema expira dia: " + data[0] + data[1] + "/" + data[2] + data[3] + "/" + data[4] + data[5] + data[6] + data[7]);
////        } catch (SQLException ex) {
////            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
////        }
    }

    private Principal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabelUser = new javax.swing.JLabel();
        jLabelUsuarioLogado = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jLabelLicExpiracao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuItemEstados = new javax.swing.JMenuItem();
        jMenuItemCidades = new javax.swing.JMenuItem();
        jMenuItemBairros = new javax.swing.JMenuItem();
        jMenuItemTelefones = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemFornecedores = new javax.swing.JMenuItem();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuItemValidacaoSist = new javax.swing.JMenuItem();
        jMenuItemValidacaoSistema = new javax.swing.JMenuItem();
        jMenuCompras = new javax.swing.JMenu();
        jMenuItemEstoque = new javax.swing.JMenuItem();
        jMenuItemEntradaProdutos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu = new javax.swing.JMenu();
        jMenuItemVendas = new javax.swing.JMenuItem();
        jMenuItemPesquisa_Venda = new javax.swing.JMenuItem();
        jMenuItemPagarParcelas = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas de Vendas");

        jLabelUser.setText("Usuário");

        jLabelUsuarioLogado.setForeground(new java.awt.Color(204, 0, 0));
        jLabelUsuarioLogado.setText("Usuário Logado:");

        jLabelHorario.setText("Horario");

        jLabelLicExpiracao.setText("Licença de expiração");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/armazens-automatizados-exemplo-transformacao-digital-logistica.1.4.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLData.setText("Data");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_form_add.png"))); // NOI18N
        jMenu3.setText("Cadastros");

        jMenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_key.png"))); // NOI18N
        jMenuItemUsuario.setText("Usuarios");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemUsuario);

        jMenuItemEstados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_home.png"))); // NOI18N
        jMenuItemEstados.setText("Estados");
        jMenuItemEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstadosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemEstados);

        jMenuItemCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/house.png"))); // NOI18N
        jMenuItemCidades.setText("Cidades");
        jMenuItemCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadesActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCidades);

        jMenuItemBairros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/house_go.png"))); // NOI18N
        jMenuItemBairros.setText("Bairros");
        jMenuItemBairros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBairrosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemBairros);

        jMenuItemTelefones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telephone_add.png"))); // NOI18N
        jMenuItemTelefones.setText("Telefones");
        jMenuItemTelefones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelefonesActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTelefones);

        jMenuItemClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_add.png"))); // NOI18N
        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemClientes);

        jMenuItemFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lorry.png"))); // NOI18N
        jMenuItemFornecedores.setText("Fornecedores");
        jMenuItemFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedoresActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemFornecedores);

        jMenuItemProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cart.png"))); // NOI18N
        jMenuItemProdutos.setText("Produtos");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemProdutos);

        jMenuItemValidacaoSist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/key_add.png"))); // NOI18N
        jMenuItemValidacaoSist.setText("Validação do Sistema");
        jMenuItemValidacaoSist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemValidacaoSistActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemValidacaoSist);

        jMenuItemValidacaoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lock_add.png"))); // NOI18N
        jMenuItemValidacaoSistema.setText("Liberação do Sistema");
        jMenuItemValidacaoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemValidacaoSistemaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemValidacaoSistema);

        jMenuBar2.add(jMenu3);

        jMenuCompras.setText("Estoque de Produtos");

        jMenuItemEstoque.setText("Estoque Atual");
        jMenuItemEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstoqueActionPerformed(evt);
            }
        });
        jMenuCompras.add(jMenuItemEstoque);

        jMenuItemEntradaProdutos.setText("Entrada Produtos");
        jMenuItemEntradaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEntradaProdutosActionPerformed(evt);
            }
        });
        jMenuCompras.add(jMenuItemEntradaProdutos);

        jMenuItem1.setText("Saídas Produtos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCompras.add(jMenuItem1);

        jMenuBar2.add(jMenuCompras);

        jMenu.setText("Venda");
        jMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActionPerformed(evt);
            }
        });

        jMenuItemVendas.setText("Vendas novas");
        jMenuItemVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendasActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemVendas);

        jMenuItemPesquisa_Venda.setText("Pesquisa de Vendas");
        jMenuItemPesquisa_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisa_VendaActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemPesquisa_Venda);

        jMenuItemPagarParcelas.setText("Pagar parcela");
        jMenuItemPagarParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPagarParcelasActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemPagarParcelas);

        jMenuBar2.add(jMenu);

        jMenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report_edit.png"))); // NOI18N
        jMenuRelatorios.setText("Relatórios");

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemCliente);

        jMenuBar2.add(jMenuRelatorios);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cross.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuSair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUsuarioLogado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(jLabelLicExpiracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(jLData, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser)
                    .addComponent(jLabelUsuarioLogado)
                    .addComponent(jLabelHorario)
                    .addComponent(jLabelLicExpiracao)
                    .addComponent(jLData))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(859, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstadosActionPerformed
        JFrEstados frm = new JFrEstados();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemEstadosActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        // TODO add your handling code here:
        conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadesActionPerformed
        JFrCidades frm = new JFrCidades();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemCidadesActionPerformed

    private void jMenuItemBairrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBairrosActionPerformed
        JFrBairros frm = new JFrBairros();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemBairrosActionPerformed

    private void jMenuItemTelefonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelefonesActionPerformed
        JFrTelefones frm = new JFrTelefones();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelefonesActionPerformed

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        JFrClientes frm = new JFrClientes();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedoresActionPerformed
        JFrFornecedor frm = new JFrFornecedor();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemFornecedoresActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        try {
            // TODO add your handling code here:
            conecta.executaSQL("select * from login where login='"+jLabelUser.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("permissao").equals("Administrador")){
                JFrProdutos frm = new JFrProdutos();
                frm.setVisible(true);
        }else{
                JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para acessar este módulo!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para acessar este módulo!");
        }
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
        // Exemplo de teste de criação de relatório
        try {
            conecta.executaSQL("select * from cidades");
            JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs); //Passa um resultSet Preenchido para o relatório!
            JasperPrint jpPrint = JasperFillManager.fillReport("ireport/RelatorioCidade.jasper", new HashMap(), relatResul );//indica o caminho
            JasperViewer jv = new JasperViewer(jpPrint,false); //Cria instacia para impressão (o false não deixa fecha a aplicação)
            jv.setVisible(true);//chama relatório para visualização
            //jv.toFront(); set o formulário a frente da aplicação 
        }catch (JRException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relátório!\nERRO:" + ex);
        }
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuActionPerformed

    private void jMenuItemEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstoqueActionPerformed
        
       JFrEstoqueProdutosAtual frm = new JFrEstoqueProdutosAtual();
       frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemEstoqueActionPerformed

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        try {
            // TODO add your handling code here:
            conecta.executaSQL("select * from login where login='" + jLabelUser.getText() + "'");
            conecta.rs.first();
            if(conecta.rs.getString("permissao").equals("Administrador")){
                JFrCadLogin frm = new JFrCadLogin();
                frm.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para acessar este módulo!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para acessar este módulo!");
        }
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    private void jMenuItemPesquisa_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisa_VendaActionPerformed
        // TODO add your handling code here:
        JFrPesquisasVendas frm = new JFrPesquisasVendas();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemPesquisa_VendaActionPerformed

    private void jMenuItemVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendasActionPerformed
        // TODO add your handling code here:
        JFrVendas frm = new JFrVendas();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendasActionPerformed

    private void jMenuItemPagarParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPagarParcelasActionPerformed
        // TODO add your handling code here:
        JFrBaixaPrcela frm = new JFrBaixaPrcela();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemPagarParcelasActionPerformed

    private void jMenuItemValidacaoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemValidacaoSistemaActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            conecta.executaSQL("select * from login where login='" + jLabelUser.getText() + "'");
            conecta.rs.first();
            if(conecta.rs.getString("permissao").equals("Desenvolvedor")){
                JFrCadastroDataVenc frm = new JFrCadastroDataVenc();       
                    frm.setVisible(true);
        }else{
                JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para acessar este módulo!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não possui permissão para acessar este módulo!");
        }       
    }//GEN-LAST:event_jMenuItemValidacaoSistemaActionPerformed

    private void jMenuItemValidacaoSistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemValidacaoSistActionPerformed
        // TODO add your handling code here:
        JFrValidSistema frm = new JFrValidSistema();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemValidacaoSistActionPerformed

    private void jMenuItemEntradaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEntradaProdutosActionPerformed
        // TODO add your handling code here:
        JFrEntradaEstoqueProd frm = new JFrEntradaEstoqueProd();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemEntradaProdutosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JFrSaidaEstoqueProd frm = new JFrSaidaEstoqueProd();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelLicExpiracao;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUsuarioLogado;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuCompras;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemBairros;
    private javax.swing.JMenuItem jMenuItemCidades;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemEntradaProdutos;
    private javax.swing.JMenuItem jMenuItemEstados;
    private javax.swing.JMenuItem jMenuItemEstoque;
    private javax.swing.JMenuItem jMenuItemFornecedores;
    private javax.swing.JMenuItem jMenuItemPagarParcelas;
    private javax.swing.JMenuItem jMenuItemPesquisa_Venda;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenuItem jMenuItemTelefones;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenuItem jMenuItemValidacaoSist;
    private javax.swing.JMenuItem jMenuItemValidacaoSistema;
    private javax.swing.JMenuItem jMenuItemVendas;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
