/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mr-Robot
 */
public class CriptoSenha {
    // metodo 2 de criptografia
    public static String HashFunctions(String senha){
        
        String md5 = null;
        
        if(null == senha){
            return null;
        }
        //Criando objeto MessageDigest para o MD5
        MessageDigest digest;
        
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(senha.getBytes(), 0, senha.length());
            //Convertendo para HEXA
            md5 = new BigInteger(1, digest.digest()).toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CriptoSenha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return md5;
    }
    
}
