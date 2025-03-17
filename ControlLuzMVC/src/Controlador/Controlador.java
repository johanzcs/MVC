/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.ControladorLuces;
import Vista.Formulario;

public class Controlador {
    private ControladorLuces objControladorLuces;
    private Formulario objFormulario;
    
    public Controlador() {
        this.objControladorLuces = new ControladorLuces();
        this.objFormulario = new Formulario();
        objControladorLuces.agregarDispositivo("Sala");
    }
    
    public void mostrarMenu() {
        int opcion;
        do {
            opcion = objFormulario.verMenuInicial();
            switch (opcion) {
                case 1:
                    boolean esDeNoche = objFormulario.tomarEsDeNoche();
                    objControladorLuces.setEsDeNoche(esDeNoche);
                    boolean hayMovimiento = objFormulario.tomarHayMovimiento();
                    objControladorLuces.configurarSensor("Sala", hayMovimiento);
                    objControladorLuces.verificarLuces();
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

