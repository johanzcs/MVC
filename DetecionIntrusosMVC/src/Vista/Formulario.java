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
            System.out.println("      SISTEMA DE SEGURIDAD");
            System.out.println("===================================");
            System.out.println("1. Configurar sensores y verificar seguridad");
            System.out.println("2. Ver configuraciones guardadas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = objTeclado.nextInt();
        } while (opcion > 3 || opcion < 1);
        return opcion;
    }

    public boolean tomarEsDeNoche() {
        System.out.print("¿Es de noche? (true/false): ");
        return objTeclado.nextBoolean();
    }

    public boolean[] tomarEstadoSensores() {
        boolean[] estados = new boolean[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("¿Sensor " + (i + 1) + " detecta movimiento? (true/false): ");
            estados[i] = objTeclado.nextBoolean();
        }
        return estados;
    }
}
