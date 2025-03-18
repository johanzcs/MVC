/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

class SensorTemperatura extends Sensor {
    public SensorTemperatura(String ubicacion) {
        super(ubicacion);
    }
    
    public void mostrarValor() {
        System.out.println("️ Temperatura en " + getUbicacion() + ": " + getValor() + "°C");
    }
}