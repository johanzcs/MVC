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
            System.out.println("      CONTROL DE LUCES AUTOMÁTICO");
            System.out.println("===================================");
            System.out.println("1. Configurar luces y verificar estado");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = objTeclado.nextInt();
        } while (opcion > 2);
        return opcion;
    }
    
    public boolean tomarEsDeNoche() {
        System.out.print("¿Es de noche? (true/false): ");
        return objTeclado.nextBoolean();
    }
    
    public boolean tomarHayMovimiento() {
        System.out.print("¿Hay movimiento en la habitación? (true/false): ");
        return objTeclado.nextBoolean();
    }
}

