/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursividad.genericos;

import Genericos.Ejercicio2;
import Genericos.Ejercicio2ClaseGenerica;
import Recursividad.Ejercicio1Recursividad;
import Recursividad.Ejercicio2Recursividad;

/**
 *
 * @author melis
 */


public class RecursividadGenericos {

    public static void main(String[] args) {
        
        //Primer ejercicio Recursividad
        System.out.println("Primer ejercicio recursividad: Suma de los digitos de un numero entregado");
        System.out.println(Ejercicio1Recursividad.sumaDigitos(12345));
        System.out.println("");
        
        //Segundo ejercicio Recursividad
        System.out.println("Segundo ejercicio recursividad: Cuenta regresiva desde un numero hasta 0");
        Ejercicio2Recursividad.contarRegresivamente(5);
        System.out.println("");
        
        //Segundo ejercicio de genericos
        System.out.println("Segundo ejercicio Genericos: Un array de cualquier tipo se imprime en consola digito a digito");
        Ejercicio2 ejemplo = new Ejercicio2();
        
        //Creacion del array (de cualquier tipo)
        Integer[] arrayEnteros = {1,2,3,4};
        String[] arrayString = new String[2];
        arrayString[0] = "Hola";
        arrayString[1] = "Como andas";
        
        //llama al metodo generico
        //No necesita hacerse casting??????
        ejemplo.printArray(arrayEnteros);
        ejemplo.printArray(arrayString);
       
        System.out.println("");
 
        //Segundo ejercicio de genericos: otra forma seria creando la clase generica y el atributo
        System.out.println("Segundo ejercicio otro metodo");
        Integer[] arrayEnteros2 = {1,2,3};
        Ejercicio2ClaseGenerica eje2 = new Ejercicio2ClaseGenerica(arrayEnteros2);
        eje2.printArray();
    }
   
}
