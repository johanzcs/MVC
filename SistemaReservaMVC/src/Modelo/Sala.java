/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Sala {
    private String nombre;
    private int asientosDisponibles;

    public Sala(String nombre, int asientosDisponibles) {
        this.nombre = nombre;
        this.asientosDisponibles = asientosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void reservarAsiento() {
        if (asientosDisponibles > 0) {
            asientosDisponibles--;  
        } else {
            System.out.println("No hay asientos disponibles en esta sala.");
        }
    }

    public int asientosDisponibles() {
        return asientosDisponibles;
    }
}



