/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//Importação da criptografia da senha

/**
 *
 * @author Mr-Robot
 */
public class ModeloLogin {
    private int id;
    private String nomeCompleto;
    private String login;
    private String senha;
    private String permissao;
    
    // 2 metodo de criptografia
    private String salt;
    
    ////////////////////////////////////////////////////////////////////////////////
//    public BigInteger CriptografarSenha(String senha){
//        
//        MessageDigest md5;
//        BigInteger senhacrip = null;
//        
//        try {
//            md5 = MessageDigest.getInstance("MD5");
//            md5.reset();
//            md5.update(senha.getBytes(),0, senha.length());
//            senhacrip = new BigInteger(1, md5.digest());
//             
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(ModeloLogin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return senhacrip;
//    }
    ///////////////////////////////////////////////////////////////////////////////////
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    /**
     * @return the salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt the salt to set
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
    
}
