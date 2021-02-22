/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mr-Robot
 */
public class AjustaData {
    
    /// DATA
    public String retornarData(){
        Date date = new Date(); 
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        return data.format(date);
    }  
}
