/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

/**
 *
 * @author melis
 */
public class Ejercicio1 {
    
    /*
Escribe una función recursiva llamada sumaDigitos que tome un número entero no negativo como parámetro y
calcule la suma de sus dígitos. La función debe descomponer el número en sus dígitos individuales y sumarlos
recursivamente hasta obtener el resultado final.
    */
    
    public static int sumaDigitos(int i){
        
        if (i < 1){
            throw new ArithmeticException("number not allow");
        }
        
        //Caso base
        //Cuando el tamano es 1  
        if(Integer.toString(i).length() == 1) {
            return i;
        }
        
        //Los otros casos: Se agarra el primer digito y se suma con el array menos ese digito 
        else{
            StringBuilder stringDigitos;
            stringDigitos = new StringBuilder(Integer.toString(i));
            
            //el primer entero a sumar
            int e = Integer.parseInt(Character.toString(stringDigitos.charAt(0)));
            
            //numero que sigue todos juntos 
            int numeros = Integer.parseInt(stringDigitos.deleteCharAt(0).toString());

            return e + sumaDigitos(numeros);
        }
        
    }
    
    
}
