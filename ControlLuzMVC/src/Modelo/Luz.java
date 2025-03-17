/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

class Luz extends Dispositivo {
    private String ubicacion;

    public Luz(String ubicacion) {
        super();
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void actualizarEstado(boolean esDeNoche, boolean hayMovimiento) {
        setEstado(esDeNoche && hayMovimiento);
    }

    public void mostrarEstado() {
        System.out.println(" Luz en " + ubicacion + ": " + (getEstado() ? "Encendida" : "Apagada"));
    }
} 