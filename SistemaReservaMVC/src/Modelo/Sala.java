/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Sala {
    private String nombre;
    private String tipo;
    private int capacidad;
    private String pelicula;
    private boolean[] asientos; // Para almacenar la disponibilidad de los asientos (true = reservado, false = disponible)

    public Sala(String nombre, String tipo, int capacidad, String pelicula) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.pelicula = pelicula;
        this.asientos = new boolean[capacidad];  // Inicializa los asientos, todos están disponibles al principio
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPelicula() {
        return pelicula;
    }

    // Método para reservar un asiento
    public boolean reservarAsiento(int asiento) {
        if (asiento >= 0 && asiento < capacidad) {
            if (!asientos[asiento]) {  // Si el asiento está disponible
                asientos[asiento] = true;  // Se marca como reservado
                System.out.println("Asiento " + asiento + " reservado.");
                return true;
            } else {
                System.out.println("El asiento " + asiento + " ya está reservado.");
                return false;
            }
        } else {
            System.out.println("Número de asiento inválido.");
            return false;
        }
    }

    // Método para cancelar una reserva de asiento
    public boolean cancelarReserva(int asiento) {
        if (asiento >= 0 && asiento < capacidad) {
            if (asientos[asiento]) {  // Si el asiento está reservado
                asientos[asiento] = false;  // Se marca como disponible
                System.out.println("Reserva del asiento " + asiento + " cancelada.");
                return true;
            } else {
                System.out.println("El asiento " + asiento + " no está reservado.");
                return false;
            }
        } else {
            System.out.println("Número de asiento inválido.");
            return false;
        }
    }

    // Método para verificar la disponibilidad de un asiento
    public boolean verificarDisponibilidad(int asiento) {
        if (asiento >= 0 && asiento < capacidad) {
            return !asientos[asiento];  // Si el asiento está disponible (false), devuelve true
        }
        return false;
    }

    // Método para mostrar el estado de los asientos
    public void mostrarEstado() {
        System.out.println("Estado de los asientos en la sala " + nombre + ":");
        for (int i = 0; i < capacidad; i++) {
            System.out.println("Asiento " + i + ": " + (asientos[i] ? "Reservado" : "Disponible"));
        }
    }
}



