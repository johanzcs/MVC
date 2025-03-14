/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import java.util.Scanner;

public class Formulario {
    private Controlador controlador;

    public Formulario(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Menu:");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Mostrar salas");
            System.out.println("3. Gestionar reservas");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    controlador.registrarUsuario();
                    break;
                case 2:
                    controlador.mostrarSalas();
                    break;
                case 3:
                    controlador.gestionarReservas(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}


