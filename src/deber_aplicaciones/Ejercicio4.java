/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deber_aplicaciones;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Wellington
 */
public class Ejercicio4 {
     public static void main(String args[]){  
        String s1 ;
        String s2 ;
        int tamano1,tamano2;
        s1 =JOptionPane.showInputDialog(null,"Ingrese una frase","Frase 1",JOptionPane.QUESTION_MESSAGE);
        s2= JOptionPane.showInputDialog(null,"Ingrese otra frase","Frase 2",JOptionPane.QUESTION_MESSAGE);
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        tamano2=s2.length();
        tamano1=s1.length();
              
        char [] cadenaS1=s1.toCharArray();
        char[] cadenaS2=s2.toCharArray();
        //String cadenaSalida = null;
        
        for (int i = 0; i < tamano2; i++) {
            for (int j = 0; j < tamano1; j++) {
                if (cadenaS1[j]==cadenaS2[i]) {
                    cadenaS1[j]=' ';
                }
            }
            
        }
        String salida="";
        for (int i=0;i<tamano1;i++)
               if (cadenaS1[i]!=' ') {
                   
                  salida=salida+cadenaS1[i]; 
                   //System.out.println(" " + cadenaS1[i]);
               }
        JOptionPane.showMessageDialog(null,salida,"Resultado",JOptionPane.INFORMATION_MESSAGE);

    }
    
}
