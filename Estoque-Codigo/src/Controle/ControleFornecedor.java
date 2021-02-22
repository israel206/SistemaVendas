/*
 * No controle é onde fazemos todas as operações,
 * com os dados, e as inserções, exclusões do banco e assim por diante
 * e através do MODELO podemos transmitir essas informações para o fornecedor 
 */
package Controle;

import Model.ModeloFornecedor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleFornecedor {
    //instância do banco
    ConectaBanco connFornecedor = new ConectaBanco();
    //uma variavel codBairro para receber o codigo do bairro antes de fazer a inserção
    //Instancia de modelo dos dados a fornecer= mod
    ModeloFornecedor mod = new ModeloFornecedor();
    ConectaBanco connAux = new ConectaBanco();
    int codBairro;
    public void Salvar(ModeloFornecedor mod){
        // chamando o metodo AchaBairro
        AchaBairro(mod.getIdBairro());
        connFornecedor.conexao();
        try {
            //setando os campo para inserção
            PreparedStatement pst = connFornecedor.conn.prepareStatement("insert into fornecedores(nome_fornecedor, endereco_fornecedor, id_bairro, cnpj_fornecedor)values(?,?,?,?)");
            //passando os parametros
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setInt(3, codBairro);
            pst.setString(4, mod.getCNPJ());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserção feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na inserção do fornecedor!\nERRO: " + ex);
        }
        connFornecedor.desconecta();
    
    }
    public void Alterar(ModeloFornecedor mod){
        //pegando o ID bairro
        AchaBairro(mod.getIdBairro());
        connFornecedor.conexao();
        try {
            PreparedStatement pst = connFornecedor.conn.prepareStatement("update fornecedores set nome_fornecedor=?, endereco_fornecedor=?, id_bairro=?, cnpj_fornecedor=? where id_fornecedor=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setInt(3, codBairro);
            pst.setString(4, mod.getCNPJ());
            pst.setInt(5, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alteração o fornecedor!\nERRO: "+ex);
        }
        connFornecedor.desconecta();
    }
    
    public void Excluir(ModeloFornecedor mod){
        connFornecedor.conexao();
        try {
            PreparedStatement pst = connFornecedor.conn.prepareStatement("delete from fornecedores where id_fornecedor=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Exclusão feita com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na exclusão do fornecedor!\nERRO: "+ex);
        }
        connFornecedor.desconecta();
    }
    //metodo de busca do bairro, com o parametro de bairro
    public void AchaBairro(String bairro){
        connFornecedor.conexao();
        try {
            // fazendo uma pesquisa no SQL da tabela Bairro
            connFornecedor.executaSQL("select * from bairros where nome_bairro='"+bairro+"'");
            connFornecedor.rs.first();
            codBairro = connFornecedor.rs.getInt("id_bairro");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar codigo do bairro!\nERRO: "+ex);
        }
        connFornecedor.desconecta();
    }
    
    //METODOS DO BOTÕES DE SEQUÊNCIAS
    public ModeloFornecedor Primeiro(){
        //forma de funcionamento do metodo
        //1 conecta com o banco
        connFornecedor.conexao();
        try {
            //2 carrega os dados
            //junção das tabelas fornecedores, bairros, cidades e estados
            connFornecedor.executaSQL("select * from fornecedores inner join bairros on fornecedores.id_bairro = bairros.id_bairro inner join cidades on bairros.id_cidade = cidades.id_cidade inner join estados on cidades.id_estado = estados.id_estado");
            //3 setar a primeira posição 
            connFornecedor.rs.first();
            
            // preencher com os dados no formularios com as informações pedidas
            mod.setId(connFornecedor.rs.getInt("id_fornecedor"));
            mod.setNome(connFornecedor.rs.getString("nome_fornecedor"));
            mod.setEndereco(connFornecedor.rs.getString("endereco_fornecedor"));
            mod.setIdBairro(connFornecedor.rs.getString("id_bairro"));
            mod.setCNPJ(connFornecedor.rs.getString("cnpj_fornecedor"));
            mod.setNome_Cidade(connFornecedor.rs.getString("nome_cidades"));
            mod.setSigla_estado(connFornecedor.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o primeiro!\nERRO: "+ex);
        }
        connFornecedor.desconecta();
        return mod;  
    }
   
    public ModeloFornecedor Anterior(){
       //connFornecedor.conexao();
        try {
            //junção das tabelas fornecedores, bairros, cidades e estados
            //connFornecedor.executaSQL("select * from fornecedores inner join bairros on fornecedores.id_bairro = bairros.id_bairros inner join cidades on bairros.id_cidade = cidades.id_cidade inner join estados on cidades.id_estado = estados.id_estado");
            connFornecedor.rs.previous();
            mod.setId(connFornecedor.rs.getInt("id_fornecedor"));
            mod.setNome(connFornecedor.rs.getString("nome_fornecedor"));
            mod.setEndereco(connFornecedor.rs.getString("endereco_fornecedor"));
            mod.setIdBairro(connFornecedor.rs.getString("id_bairro"));
            mod.setCNPJ(connFornecedor.rs.getString("cnpj_fornecedor"));
            mod.setNome_Cidade(connFornecedor.rs.getString("nome_cidades"));
            mod.setSigla_estado(connFornecedor.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o primeiro!\nERRO: "+ex);
        }
        //connFornecedor.desconecta();
        return mod;   
    }
    public ModeloFornecedor Proximo(){
       //connFornecedor.conexao();
        try {
            //junção das tabelas fornecedores, bairros, cidades e estados
            //connFornecedor.executaSQL("select * from fornecedores inner join bairros on fornecedores.id_bairro = bairros.id_bairros inner join cidades on bairros.id_cidade = cidades.id_cidade inner join estados on cidades.id_estado = estados.id_estado");
            connFornecedor.rs.next();
            mod.setId(connFornecedor.rs.getInt("id_fornecedor"));
            mod.setNome(connFornecedor.rs.getString("nome_fornecedor"));
            mod.setEndereco(connFornecedor.rs.getString("endereco_fornecedor"));
            mod.setIdBairro(connFornecedor.rs.getString("id_bairro"));
            mod.setCNPJ(connFornecedor.rs.getString("cnpj_fornecedor"));
            mod.setNome_Cidade(connFornecedor.rs.getString("nome_cidades"));
            mod.setSigla_estado(connFornecedor.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o primeiro!\nERRO: "+ex);
        }
        //connFornecedor.desconecta();
        return mod;   
    }
     public ModeloFornecedor Ultimo(){
        connFornecedor.conexao();
        try {
            //junção das tabelas fornecedores, bairros, cidades e estados
            connFornecedor.executaSQL("select * from fornecedores inner join bairros on fornecedores.id_bairro = bairros.id_bairro inner join cidades on bairros.id_cidade = cidades.id_cidade inner join estados on cidades.id_estado = estados.id_estado");
            connFornecedor.rs.last();
            mod.setId(connFornecedor.rs.getInt("id_fornecedor"));
            mod.setNome(connFornecedor.rs.getString("nome_fornecedor"));
            mod.setEndereco(connFornecedor.rs.getString("endereco_fornecedor"));
            mod.setIdBairro(connFornecedor.rs.getString("id_bairro"));
            mod.setCNPJ(connFornecedor.rs.getString("cnpj_fornecedor"));
            mod.setNome_Cidade(connFornecedor.rs.getString("nome_cidades"));
            mod.setSigla_estado(connFornecedor.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o primeiro!\nERRO: "+ex);
        }
        connFornecedor.desconecta();
        return mod;  
    }
    
}
