/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deber_aplicaciones;

import javax.swing.*;

/**
 *
 * @author Wellington
 */
public class Ejercicio11 {
    
    public static void main(String[] args) {
String tamaño,dato,salidaV="Vector\n",repetido = "\nNúmero que más se repite ",veces = "\nNúmero de veces que se repite ";
int magnitud,valor,repetidoA,veces_repetidoA,repetidoB,veces_repetidoB,i,p,k=2,iguales=0;
JTextArea areaSalida = new JTextArea();
tamaño = JOptionPane.showInputDialog("Ingrese el tamaño del vector");
magnitud = Integer.parseInt(tamaño);
int A[] = new int[magnitud];

for(i=0;i<=magnitud-1;i++){//Llenar el vector con datos proporcionados por el usuario
dato = JOptionPane.showInputDialog("Ingrese el valor para la posición" + (i+1));
valor = Integer.parseInt(dato);
A[i] = valor;
salidaV += valor + ", ";
}
p=0;
repetidoA = A[p];//Asume que el primer valor del vector es el que está repetido
veces_repetidoA = 1;
for(i=1;i<=magnitud-1;i++){//Busca y cuenta las veces que se encuentra repetido el elemento de la posición 1
if(repetidoA == A[i]){
veces_repetidoA ++;
}
}
p=1;

while(p<=magnitud-1){//Se asegura de no desbordarse del vector

repetidoB = A[p];//Asume que el primer valor del vector es el que está repetido
veces_repetidoB = 1;
for(i=p+1;i<=magnitud-1;i++){//Busca y cuenta las veces que se encuentra repetido el elemento de las demás posiciones
if(repetidoB == A[i]){
veces_repetidoB ++;
}
}
if(veces_repetidoA < veces_repetidoB){
repetidoA = repetidoB;
veces_repetidoA = veces_repetidoB;
iguales = 0;
}
else if(veces_repetidoA == veces_repetidoB){
iguales = 1;
}
p++;
}

if (veces_repetidoA == 1 || iguales != 0){
//JOptionPane.showMessageDialog(null,"ningún número se repite más que los demás\n" + );
areaSalida.setText(salidaV);
areaSalida.append("\nningún número se repite más que los demás");
JOptionPane.showMessageDialog(null,areaSalida);

}
else{
repetido += repetidoA;
veces += veces_repetidoA;
areaSalida.setText(salidaV);
areaSalida.append(repetido);
areaSalida.append(veces);

JOptionPane.showMessageDialog(null,areaSalida);
}

}
}
