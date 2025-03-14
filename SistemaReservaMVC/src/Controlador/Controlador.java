/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controlador;

import Modelo.Cine;
import Modelo.Persona;
import Modelo.Sala;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    private Cine cine;
    private List<Persona> usuarios;

    public Controlador() {
        this.cine = new Cine("Cine Central");  
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su cédula: ");
        String cedula = scanner.nextLine();

        Persona nuevoUsuario = new Persona(nombre, apellido, cedula);

        usuarios.add(nuevoUsuario);

        System.out.println("Usuario registrado correctamente: " + nuevoUsuario);
    }

    public void mostrarSalas() {
        List<Sala> salas = cine.obtenerSalas();  

        if (salas.isEmpty()) {
            System.out.println("No hay salas disponibles.");
        } else {
            System.out.println("Salas disponibles en " + cine.getNombre() + ":");
            for (int i = 0; i < salas.size(); i++) {
                System.out.println((i + 1) + ". " + salas.get(i).getNombre() + " - " + salas.get(i).asientosDisponibles() + " asientos disponibles");
            }
        }
    }

    public void gestionarReservas(Scanner scanner) {
        mostrarSalas();
        System.out.print("Seleccione una sala para hacer la reserva: ");
        int opcionSala = scanner.nextInt();

        Sala salaSeleccionada = cine.obtenerSala(opcionSala);  
        if (salaSeleccionada != null) {
            System.out.println("Reserva realizada en " + salaSeleccionada.getNombre());
            salaSeleccionada.reservarAsiento();
        } else {
            System.out.println("Sala no válida.");
        }
    }
}






