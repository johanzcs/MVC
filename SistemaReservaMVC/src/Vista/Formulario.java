/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;
import Modelo.Usuario;

public class Formulario {
    private Scanner objTeclado;

    public Formulario() {
        this.objTeclado = new Scanner(System.in);
    }

    // Menú principal del sistema
    public int verMenuInicial() {
        int opcion;
        do {
            System.out.println("\n********** SISTEMA DE RESERVAS **********");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Realizar reserva");
            System.out.println("3. Ver estado de salas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = objTeclado.nextInt();
            objTeclado.nextLine();  // Consumir el salto de línea
        } while (opcion > 4 || opcion < 1);
        return opcion;
    }

    // Método para registrar un usuario
    public Usuario registrarUsuario() {
        String nombre = obtenerEntradaTexto("Ingrese su nombre: ");
        String apellido = obtenerEntradaTexto("Ingrese su apellido: ");
        String cedula = obtenerEntradaTexto("Ingrese su cédula: ");
        Usuario usuario = new Usuario(nombre, apellido, cedula); // Crear objeto Usuario
        System.out.println("Usuario registrado correctamente.");
        return usuario;
    }

    // Método para obtener una entrada de texto (nombre, apellido, cédula)
    public String obtenerEntradaTexto(String mensaje) {
        System.out.print(mensaje);
        return objTeclado.nextLine();
    }

    // Método para obtener una entrada de número (para seleccionar opciones)
    public int obtenerEntradaNumero(String mensaje) {
        System.out.print(mensaje);
        return objTeclado.nextInt();
    }

    // Menú para la reserva de asientos
    public int verMenuReserva() {
        int opcion;
        do {
            System.out.println("\nBienvenido a la reserva de asientos.");
            System.out.println("1. Ver salas");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = objTeclado.nextInt();
            objTeclado.nextLine();  // Consumir el salto de línea
        } while (opcion > 4 || opcion < 1);
        return opcion;
    }
}

