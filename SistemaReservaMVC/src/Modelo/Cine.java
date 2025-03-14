/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Clase Cine
package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Cine {
    private String nombre;
    private List<Sala> salas;

    public Cine(String nombre) {
        this.nombre = nombre;
        this.salas = new ArrayList<>();
        this.salas.add(new Sala("Sala 1", 90));
        this.salas.add(new Sala("Sala 2", 90));
        this.salas.add(new Sala("Sala 3", 90));
    }

    public String getNombre() {
        return nombre;
    }

    public List<Sala> obtenerSalas() {
        return salas;
    }

    public Sala obtenerSala(int numeroSala) {
        if (numeroSala > 0 && numeroSala <= salas.size()) {
            return salas.get(numeroSala - 1);  
        }
        return null;
    }
}




