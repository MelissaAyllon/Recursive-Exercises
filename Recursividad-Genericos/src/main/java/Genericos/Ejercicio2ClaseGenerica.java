/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genericos;

/**
 *
 * @author melis
 * @param <T>
 */
public class Ejercicio2ClaseGenerica<T> {
    private T[] tipo;
    
    public Ejercicio2ClaseGenerica(T[] tipo){
        this.tipo = tipo;
    }
    
    //El T deberia de ser del mismo tipo que el generico del constructor
    public void printArray(T[] array){
        for(T i: array){
            System.out.println(i.toString());
        }
    }
    
    //sino
    public void printArray(){
        for(T i: tipo){
            System.out.println(i.toString());
        }
    }
    
    
}
