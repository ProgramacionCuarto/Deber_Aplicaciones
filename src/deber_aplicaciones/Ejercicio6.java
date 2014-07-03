/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deber_aplicaciones;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Wellington
 */
public class Ejercicio6 {
    
    public Ejercicio6(){
        super();
    }
        
        
public static void main(String[] args) throws IOException {
    
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Ingrese uns frase : ");
      String frase=br.readLine();
      String []cads=frase.split(" ");

      for(int i=cads.length-1;i>=0;i--){
          System.out.print(cads[i]+" ");
      }

    }

    }