/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ControladorSensores;
import Vista.Formulario;

public class Controlador {
    private ControladorSensores objControladorSensores;
    private Formulario objFormulario;
    
    public Controlador() {
        this.objControladorSensores = new ControladorSensores();
        this.objFormulario = new Formulario();
    }
    
    public void mostrarMenu() {
        int opcion;
        do {
            opcion = objFormulario.verMenuInicial();
            switch (opcion) {
                case 1:
                    double temperatura = objFormulario.tomarTemperatura();
                    double humedad = objFormulario.tomarHumedad();
                    objControladorSensores.configurarSensores("Sala", temperatura, humedad);
                    objControladorSensores.verificarSistema();
                    break;
                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 2);
    }
}
