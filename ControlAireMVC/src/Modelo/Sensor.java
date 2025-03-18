/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

class Sensor {
    private double valor;
    private String ubicacion;
    
    public Sensor(String ubicacion) {
        this.valor = 0.0;
        this.ubicacion = ubicacion;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
}
