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
            System.out.println("\n Menú de FizzBuzz ");
            System.out.println("1. Ingresar número y calcular FizzBuzz");
            System.out.println("2. Mostrar historial");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }
    
    public int solicitarNumero() {
        int numero;
        do {
            System.out.print("Ingrese un número entre 1 y 100: ");
            numero = scanner.nextInt();
            if (numero < 1 || numero > 100) {
                System.out.println("Número fuera de rango. Intente nuevamente.");
            }
        } while (numero < 1 || numero > 100);
        return numero;
    }
    
    public void mostrarResultado(String resultado) {
        System.out.println("Resultado: " + resultado);
    }
    
    public void mostrarHistorial(String[] historialNumeros, String[] historialResultados) {
        System.out.println("\nHistorial de Números y Resultados:");
        for (int i = 0; i < historialNumeros.length; i++) {
            if (historialNumeros[i] != null && historialResultados[i] != null) {
                System.out.println("Número: " + historialNumeros[i] + " -> " + historialResultados[i]);
            }
        }
    }
}

