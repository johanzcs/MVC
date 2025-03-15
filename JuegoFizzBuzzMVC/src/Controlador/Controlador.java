/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.Formulario;

public class Controlador {
    private Formulario vista;
    private Historial historial;
    
    public Controlador() {
        this.vista = new Formulario();
        this.historial = new Historial();
    }
    
    public void mostrarMenu() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    int numero = vista.solicitarNumero();
                    String resultado = FizzBuzz.calcular(numero);
                    historial.agregarResultado(numero, resultado);
                    vista.mostrarResultado(resultado);
                    break;
                case 2:
                    vista.mostrarHistorial(historial.obtenerHistorialNumeros(), historial.obtenerHistorialResultados());
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}
