/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Formulario;
import Modelo.SistemaSeguridad;

public class Controlador {

    private SistemaSeguridad sistema;
    private Formulario formulario;

    public Controlador() {
        this.sistema = new SistemaSeguridad();
        this.formulario = new Formulario();
    }

    public void ejecutar() {
        int opcion;
        do {
            opcion = formulario.verMenuInicial();
            switch (opcion) {
                case 1:
                    boolean esDeNoche = formulario.tomarEsDeNoche();
                    sistema.setEsDeNoche(esDeNoche);

                    boolean[] estadosSensores = formulario.tomarEstadoSensores();
                    sistema.configurarSensores(estadosSensores);
                    sistema.verificarSeguridad();
                    break;

                case 2:
                    sistema.mostrarConfiguraciones(); 
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
