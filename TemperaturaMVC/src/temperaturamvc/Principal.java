/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturamvc;

import Controlador.ControladorTemperatura;

public class Principal {
    public static void main(String[] args) {
        ControladorTemperatura controlador = new ControladorTemperatura();
        controlador.mostrarMenu();
    }
}
