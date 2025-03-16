/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class ControladorTemperaturaModelo extends DispositivoControl {
    private RegistroTemperatura registro;
    
    public ControladorTemperaturaModelo() {
        this.registro = new RegistroTemperatura();
    }
    
    public void agregarTemperatura(int temperatura) {
        registro.agregarTemperatura(temperatura);
    }
    
    public RegistroTemperatura getRegistro() {
        return registro;
    }
    
    public String monitorearTemperatura(int temperatura) {
        String mensaje = "Temperatura ingresada: " + temperatura + "°C\n";
        if (temperatura < 10) {
            mensaje += "Activando calefactor...\n";
            activar();
        } else if (temperatura > 25) {
            mensaje += "Activando ventilador...\n";
            activar();
        } else {
            mensaje += "Sistema inactivo. Temperatura estable.\n";
            desactivar();
        }
        return mensaje;
    }
}