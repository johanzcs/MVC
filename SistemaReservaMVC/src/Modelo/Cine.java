/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String nombreCine;
    private List<Sala> salas;

    // Constructor
    public Cine(String nombreCine) {
        this.nombreCine = nombreCine;
        this.salas = new ArrayList<>();
        // Crear algunas salas por defecto
        salas.add(new Sala("Sala 1"));
        salas.add(new Sala("Sala 2"));
        salas.add(new Sala("Sala 3"));
    }

    public String getNombreCine() {
        return nombreCine;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void mostrarSalas() {
        System.out.println("Salas disponibles en " + nombreCine + ":");
        for (int i = 0; i < salas.size(); i++) {
            System.out.println((i + 1) + ". " + salas.get(i).getNombre());
        }
    }

    public Sala obtenerSala(int index) {
        if (index >= 0 && index < salas.size()) {
            return salas.get(index);
        }
        return null; // En caso de que no exista la sala
    }
}

