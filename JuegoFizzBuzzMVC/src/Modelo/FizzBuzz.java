/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class FizzBuzz {
    public static String calcular(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz (divisible por 3 y 5)";
        } else if (numero % 3 == 0) {
            return "Fizz (divisible por 3)";
        } else if (numero % 5 == 0) {
            return "Buzz (divisible por 5)";
        } else {
            return "Número: " + numero;
        }
    }
}
