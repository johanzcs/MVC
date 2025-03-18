/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

class SensorHumedad extends Sensor {
    public SensorHumedad(String ubicacion) {
        super(ubicacion);
    }
    
    public void mostrarValor() {
        System.out.println(" Humedad en " + getUbicacion() + ": " + getValor() + "%");
    }
}
