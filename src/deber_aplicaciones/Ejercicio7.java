/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deber_aplicaciones;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Wellington
 */
public final class Ejercicio7 extends Object{
public static void main(String args[]){  
          
 
 Scanner lector = new Scanner(System.in); 

System.out.println(" Ingresa una palabra u oracion para convertirla a minúsculas"); 
String frase = lector.nextLine(); 
String minusculas = ""; 
for(int i = 0; i < frase.length(); i++){ 
boolean min = ( (int) frase.charAt(i) > 64) && ( (int) frase.charAt(i) < 91 ); 
if(min){ 
int x = (int) frase.charAt(i); 
x +=32 ; 
minusculas += (char) x; 
}	
else{ 
minusculas += frase.charAt(i); 
} 
} 

System.out.println(" frase = " + frase + "| convertido a = " + minusculas); 
} 

} 


