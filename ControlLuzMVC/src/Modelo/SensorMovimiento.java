/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

class SensorMovimiento extends Dispositivo {
    private String ubicacion;

    public SensorMovimiento(String ubicacion) {
        super();
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void mostrarEstado() {
        System.out.println(" Sensor en " + ubicacion + ": " + (getEstado() ? "Detecta movimiento" : "Sin movimiento"));
    }
}