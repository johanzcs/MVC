/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

class AireAcondicionado {
    private boolean estado;
    private String ubicacion;
    
    public AireAcondicionado(String ubicacion) {
        this.estado = false;
        this.ubicacion = ubicacion;
    }
    
    public void actualizarEstado(double temperatura, double humedad) {
        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            estado = true;
        } else {
            estado = false;
        }
    }
    
    public void mostrarEstado() {
        System.out.println("️ Aire Acondicionado en " + ubicacion + ": " + (estado ? "Encendido" : "Apagado"));
    }
}
