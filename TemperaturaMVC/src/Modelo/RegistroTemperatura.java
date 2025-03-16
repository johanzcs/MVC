/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class RegistroTemperatura {
    private ArrayList<Integer> temperaturas;
    
    public RegistroTemperatura() {
        this.temperaturas = new ArrayList<>();
    }
    
    public void agregarTemperatura(int temperatura) {
        temperaturas.add(temperatura);
    }
    
    public ArrayList<Integer> obtenerHistorial() {
        return temperaturas;
    }
}