/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

/**
 *
 * @author melis
 */
public class Ejercicio2Recursividad {
    /*
Escribe una función recursiva llamada contarRegresivamente que tome un número entero positivo como
parámetro e imprima en la consola un conteo regresivo desde ese número hasta 0. La función debe utilizar la
recursión para lograr esto.
    */
    
    public static void contarRegresivamente(int i){
        //caso base
        if(i == 0){
            System.out.println(i);
        }
        
        //sino agarra el numero lo imprime y continua el ciclo
        else{
            System.out.println(i);
            contarRegresivamente(i-1);
        }
    }
    
}
