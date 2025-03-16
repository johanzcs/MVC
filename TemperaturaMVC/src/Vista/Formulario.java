/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;


import java.util.Scanner;

public class Formulario {
    private Scanner scanner;
    
    public Formulario() {
        this.scanner = new Scanner(System.in);
    }
    
    public int mostrarMenu() {
        int opcion;
        do {
            System.out.println("===================================");
            System.out.println(" BIENVENIDO AL CONTROL DE TEMPERATURA ");
            System.out.println("===================================");
            System.out.println("1. Ingresar temperatura");
            System.out.println("2. Mostrar historial de temperaturas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }
    
    public int ingresarTemperatura() {
        System.out.print("Ingrese la temperatura actual (°C): ");
        return scanner.nextInt();
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

