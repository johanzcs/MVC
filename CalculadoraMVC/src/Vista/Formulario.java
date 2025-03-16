/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;
import java.util.List;

public class Formulario {
    private Scanner scanner;

    public Formulario() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\nMENÚ PRINCIPAL");
        System.out.println("1. Resolver una operación");
        System.out.println("2. Ver historial de operaciones");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public double solicitarNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public String solicitarOperacion() {
        System.out.print("Ingrese la operación (+, -, *, /): ");
        return scanner.next();
    }

    public void mostrarResultado(double resultado) {
        if (Double.isNaN(resultado)) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            System.out.println("Resultado: " + resultado);
        }
    }

    public void mostrarHistorial(List<String> historial) {
        System.out.println("\nHistorial de operaciones:");
        for (String operacion : historial) {
            System.out.println(operacion);
        }
    }
}
