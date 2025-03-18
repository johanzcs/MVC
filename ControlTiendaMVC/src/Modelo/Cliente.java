/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Cliente extends Persona {
    private boolean tieneMembresia;
    
    public Cliente(String nombre, boolean tieneMembresia) {
        super(nombre);
        this.tieneMembresia = tieneMembresia;
    }
    
    public boolean tieneMembresia() {
        return tieneMembresia;
    }
}

