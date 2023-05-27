/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genericos;

/**
 *
 * @author melis
 * Ejercicio 1
 * @param <E>
 * @param <T>
 */
public class Pair<E,T> {
    /*
Escriba una clase genérica llamada Pair que pueda almacenar un par de elementos de diferentes tipos. La clase
debe tener dos variables de instancia de tipo genérico llamadas first y second. Además, debe tener un
constructor que acepte dos parámetros para inicializar las variables first y second. También debes proporcionar
los métodos getFirst y getSecond para obtener los valores de las variables.
    */
    private E first = null;
    private T second = null;
    
    public Pair(E first, T second){
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
    
    
    
    
    
}
