/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deber_aplicaciones;
import javax.swing.JOptionPane;
/**
 *
 * @author Wellington
 */

public class Ejercicio5 {
  public static void main( String args[] ) {
int valor[] = new int[100]; 
int i, j, r, total = 0, vg = 0, pk = 0; 
String v, op; 


op = JOptionPane.showInputDialog(null, "Ingrese Cantidad de Datos para la lista ", JOptionPane.PLAIN_MESSAGE); 
pk = Integer.parseInt(op); 


for (i = 1; i <= pk; i++) { 
v = JOptionPane.showInputDialog(null, "ingrese valor: " + "[" + i + "]", "INGRESE DATOS", JOptionPane.PLAIN_MESSAGE); 
valor[i] = Integer.parseInt(v); 
} 
//FIN DEL INGRESO DE DATOS AL ARREGLO VALOR[] 
//Inicio de MOSTRANDO LISTA 
System.out.println("lista de Numeros ingresados"); 

for (i = 1; i <= pk; i++) { 
System.out.println("valor[" + i + "] =" + valor[i]); 
} 
//fin de la lista de MOSTRANDO LISTA 
System.out.println("\n" + "resultados despues de eliminacion de duplicados"); 
total = pk; 
for (i = 1; i < total; i++) { 
for (j = i + 1; j <= total; j++) { 
if (valor[i] == valor[j]) { 
vg++; 
for (r = j; r < total; r++) { 
valor[r] = valor[r + 1]; 
} 
total--; 
j--; 
} 
} 
} 
if (vg >= 1) { 
System.out.println("se eliminaron valores ducplicados "); 
} else { 
System.out.println("no hubo valores duplicados, no se realizo la operacion!! :D"); 
} 
//mostrando resultado despues de eliminacion 
System.out.println("NUEVA LISTA"); 
for (i = 1; i <= total; i++) { 

System.out.println("valor [" + i + "] =" + valor[i]); 
} 
//fin de mostrar 

      
  }
}