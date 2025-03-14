/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareservamvc;

import Controlador.Controlador;
import Vista.Formulario;

public class Principal {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();  
        Formulario formulario = new Formulario(controlador);  
        formulario.mostrarMenu();  
    }
}





