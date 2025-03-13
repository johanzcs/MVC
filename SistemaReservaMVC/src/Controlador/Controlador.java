/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Formulario;
import Modelo.Cine;
import Modelo.Sala;
import Modelo.Usuario;

public class Controlador {
    private Formulario objFormulario;
    private Cine objCine;
    private Usuario objUsuario;

    public Controlador() {
        objFormulario = new Formulario();
        objCine = new Cine("Cine Central");
    }

    public void mostrarMenu() {
        int opcion;
        do {
            opcion = objFormulario.verMenuInicial();
            switch (opcion) {
                case 1:
                    objUsuario = objFormulario.registrarUsuario();
                    System.out.println("Usuario registrado correctamente.");
                    break;
                case 2:
                    realizarReserva();
                    break;
                case 3:
                    objCine.mostrarSalas();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }

    private void realizarReserva() {
        System.out.println("Bienvenido a la reserva de asientos.");
        objCine.mostrarSalas();

        int opcionSala = objFormulario.obtenerEntradaNumero("Seleccione la sala: ");

        if (opcionSala > 0 && opcionSala <= objCine.getSalas().size()) {
            Sala salaSeleccionada = objCine.obtenerSala(opcionSala - 1); // index comienza en 0
            System.out.println("Reserva realizada en " + salaSeleccionada.getNombre());
        } else {
            System.out.println("Sala no válida. Por favor, selecciona una opción válida.");
        }
    }
}




