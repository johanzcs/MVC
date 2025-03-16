/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Operacion extends OperacionBase {
    private String tipoOperacion;

    public Operacion(double num1, double num2, String tipoOperacion) {
        super(num1, num2);
        this.tipoOperacion = tipoOperacion;
    }

    public double calcular() {
        switch (tipoOperacion) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": return (num2 != 0) ? num1 / num2 : Double.NaN;
            default: throw new IllegalArgumentException("Operación no válida");
        }
    }
}