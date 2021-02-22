/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-Robot
 */
public class ControleValidacao {
    
    ConectaBanco connex = new ConectaBanco();
    
    int valida, operacao, senhaValidacao;
    
    public void Validar(String senha){
        
        connex.conexao();
        
        try {
            connex.executaSQL("select * from vencimento");
            connex.rs.last();
            valida = Integer.parseInt(connex.rs.getString("datavenc"));
            operacao = (valida + 132) / 4;
            senhaValidacao = Integer.parseInt(senha);
            if(operacao == senhaValidacao){
                int dia, mes, ano;
                
                String AcertaMes, AcertaDia, ProximaSenha;
                
                //pegando a data de hoje
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date hoje = new Date();
                String data = df.format(hoje);
                
                char [] senhachar = data.toCharArray();
                
                dia = Integer.parseInt("" + senhachar[0] + senhachar[1]);
                mes = Integer.parseInt("" + senhachar[3] + senhachar[4]);
                ano = Integer.parseInt("" + senhachar[6] + senhachar[7] + senhachar[8] + senhachar[9]);
                //procurando erro
                //JOptionPane.showMessageDialog(null, "" + dia);
                
                
                if(mes < 12){
                    mes++;
                    if(mes < 10){
                        AcertaMes = "0" + mes;
                    }else{
                        AcertaMes = "" + mes;
                    }
                }else{
                    mes = 1;
                    ano++;
                    AcertaMes = "0" + mes;
                }
                if(dia < 10){
                    AcertaDia = "0" + dia;
                }else{
                    AcertaDia = "" + dia;
                }
                ProximaSenha = AcertaDia + AcertaMes;
                PreparedStatement pst = connex.conn.prepareStatement("insert into vencimento(datavenc)values(?)");
                pst.setString(1, ProximaSenha);
                pst.execute();
                //JOptionPane.showMessageDialog(null, "" + ProximaSenha);
            }else{
                JOptionPane.showMessageDialog(null, "senha errada");
            }
            //JOptionPane.showMessageDialog(null, valida);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao validar!\nERRO: " + ex);
        }
        connex.desconecta();
    }
    
}
