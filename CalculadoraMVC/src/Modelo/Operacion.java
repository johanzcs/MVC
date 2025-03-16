/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Operacion extends OperacionBase {
    private String tipoOperacion;
    private static List<String> historialOperaciones = new ArrayList<>();

    public Operacion(double num1, double num2, String tipoOperacion) {
        super(num1, num2);
        this.tipoOperacion = tipoOperacion;
    }

    public double calcular() {
        double resultado;
        switch (tipoOperacion) {
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = (num2 != 0) ? num1 / num2 : Double.NaN; break;
            default: throw new IllegalArgumentException("Operación no válida");
        }
        historialOperaciones.add(num1 + " " + tipoOperacion + " " + num2 + " = " + resultado);
        return resultado;
    }

    public static List<String> obtenerHistorial() {
        return historialOperaciones;
    }
}