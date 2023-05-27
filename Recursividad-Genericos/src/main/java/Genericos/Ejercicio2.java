/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genericos;

/**
 *
 * @author melis
 */
public class Ejercicio2 {
    
    //Del modo declarar un metodo de tipo en el metodo mismo
    //Cuando se declara un -array de tipo- tenemos que hacer casting de Object a T
    //T[] arr = (T[]) new Object[];-------------------------------------
    //aqui ya se hace automaticamente el downcasting
    
    public <T> void printArray(T[] array){
        
        for(T i: array){
            System.out.println(i.toString());
        }
        
        //for(int i = 0; i < array.length; i++){
        //    System.out.println(array[i].toString());
        //}
        
    }
    
}
