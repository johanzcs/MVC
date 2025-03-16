/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ControladorTemperaturaModelo;
import Vista.Formulario;

public class ControladorTemperatura {
    private ControladorTemperaturaModelo modelo;
    private Formulario vista;
    
    public ControladorTemperatura() {
        this.modelo = new ControladorTemperaturaModelo();
        this.vista = new Formulario();
    }
    
    public void mostrarMenu() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    int temperatura = vista.ingresarTemperatura();
                    modelo.agregarTemperatura(temperatura);
                    vista.mostrarMensaje(modelo.monitorearTemperatura(temperatura));
                    break;
                case 2:
                    mostrarHistorial();
                    break;
                case 3:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
            }
        } while (opcion != 3);
    }
    
    public void mostrarHistorial() {
        vista.mostrarMensaje("Historial de temperaturas:");
        for (int temp : modelo.getRegistro().obtenerHistorial()) {
            vista.mostrarMensaje(temp + "°C");
        }
    }
}
