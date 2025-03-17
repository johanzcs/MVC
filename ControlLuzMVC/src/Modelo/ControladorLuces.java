/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ControladorLuces {
    private List<SensorMovimiento> sensores;
    private List<Luz> luces;
    private boolean esDeNoche;
    
    public ControladorLuces() {
        this.sensores = new ArrayList<>();
        this.luces = new ArrayList<>();
        this.esDeNoche = false;
    }
    
    public void agregarDispositivo(String ubicacion) {
        sensores.add(new SensorMovimiento(ubicacion));
        luces.add(new Luz(ubicacion));
    }
    
    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }
    
    public void configurarSensor(String ubicacion, boolean hayMovimiento) {
        for (int i = 0; i < sensores.size(); i++) {
            if (sensores.get(i).getUbicacion().equals(ubicacion)) {
                sensores.get(i).setEstado(hayMovimiento);
                luces.get(i).actualizarEstado(esDeNoche, hayMovimiento);
            }
        }
    }
    
    public void verificarLuces() {
        for (SensorMovimiento sensor : sensores) {
            sensor.mostrarEstado();
        }
        for (Luz luz : luces) {
            luz.mostrarEstado();
        }
    }
}
