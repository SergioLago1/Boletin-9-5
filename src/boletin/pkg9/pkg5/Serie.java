/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Serie {
    String serie="";
    public int numElem(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de elementos de los que quieres que conste la serie "));
    }
    public void serie1(){
        int num=numElem();
        serie="";
        for(int i=2;i<=num*2;i=i+2){
            serie = serie + i +"+";
            
        }
                JOptionPane.showMessageDialog(null, "La serie a) es = "+serie);
        serie="";        
        for(int i=1;i<=num;i++){
            if (i%2!=0)
                serie = serie+ "-" +i;
            else serie= serie+ "+" +i;
            
        }        
            JOptionPane.showMessageDialog(null, "la serie b) es = " + serie);
    }
    
} 

