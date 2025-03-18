/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

public class Formulario {
    private Scanner objTeclado;
    
    public Formulario() {
        this.objTeclado = new Scanner(System.in);
    }
    
    public int verMenuInicial() {
        int opcion;
        do {
            System.out.println("===================================");
            System.out.println("     CONTROL DE AIRE ACONDICIONADO ");
            System.out.println("===================================");
            System.out.println("1. Configurar sensores y verificar estado");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = objTeclado.nextInt();
        } while (opcion > 2);
        return opcion;
    }
    
    public double tomarTemperatura() {
        System.out.print("Ingrese la temperatura (°C): ");
        return objTeclado.nextDouble();
    }
    
    public double tomarHumedad() {
        System.out.print("Ingrese la humedad (%): ");
        return objTeclado.nextDouble();
    }
}