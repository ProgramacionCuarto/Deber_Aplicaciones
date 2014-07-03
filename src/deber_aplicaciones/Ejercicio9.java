/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deber_aplicaciones;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Wellington
 */

public class Ejercicio9 {
   public static void main(String args[]) {
//   int proceso=0;
//       int Valor =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
//   proceso=Valor/2;
  int number, numbertest=0;
        boolean rep = false;
       
        System.out.print("Ingrese el valor ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
       
        while(!rep){
            numbertest++;
            if(numbertest * numbertest == number){
                rep = true;
                System.out.println("TRUE");
            }
            else if(numbertest * numbertest > number){
                System.out.println("FALSE");
                rep = true;
            }
        }
    }
   
    
}