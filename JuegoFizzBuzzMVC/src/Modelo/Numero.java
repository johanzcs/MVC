/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Numero {
    private int valor;
    
    public Numero(int valor) {
        if (valor < 1 || valor > 100) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 100.");
        }
        this.valor = valor;
    }
    
    public int getValor() {
        return valor;
    }
}