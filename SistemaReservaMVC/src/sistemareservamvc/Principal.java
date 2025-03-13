/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemareservamvc;

import Controlador.Controlador;

public class Principal {
    public static void main(String[] args) {
        Controlador objControlador = new Controlador(); // Crear el controlador
        objControlador.gestionarOpciones(); // Llamar al método correcto para gestionar el menú
    }
}

