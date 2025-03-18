/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ControladorSensores {
    private List<SensorTemperatura> sensoresTemp;
    private List<SensorHumedad> sensoresHum;
    private List<AireAcondicionado> aires;
    
    public ControladorSensores() {
        this.sensoresTemp = new ArrayList<>();
        this.sensoresHum = new ArrayList<>();
        this.aires = new ArrayList<>();
        agregarDispositivo("Sala");
    }
    
    public void agregarDispositivo(String ubicacion) {
        sensoresTemp.add(new SensorTemperatura(ubicacion));
        sensoresHum.add(new SensorHumedad(ubicacion));
        aires.add(new AireAcondicionado(ubicacion));
    }
    
    public void configurarSensores(String ubicacion, double temperatura, double humedad) {
        for (int i = 0; i < sensoresTemp.size(); i++) {
            if (sensoresTemp.get(i).getUbicacion().equals(ubicacion)) {
                sensoresTemp.get(i).setValor(temperatura);
                sensoresHum.get(i).setValor(humedad);
                aires.get(i).actualizarEstado(temperatura, humedad);
            }
        }
    }
    
    public void verificarSistema() {
        for (SensorTemperatura sensor : sensoresTemp) {
            sensor.mostrarValor();
        }
        for (SensorHumedad sensor : sensoresHum) {
            sensor.mostrarValor();
        }
        for (AireAcondicionado aire : aires) {
            aire.mostrarEstado();
        }
    }
}