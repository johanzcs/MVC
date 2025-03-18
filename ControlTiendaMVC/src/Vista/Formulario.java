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
            System.out.println("     CONTROL DE ACCESO A LA TIENDA ");
            System.out.println("===================================");
            System.out.println("1. Verificar acceso");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = objTeclado.nextInt();
        } while (opcion > 2);
        return opcion;
    }
    
    public boolean tomarHorarioAtencion() {
        System.out.print("¿Está dentro del horario de atención? (true/false): ");
        return objTeclado.nextBoolean();
    }
    
    public boolean tomarEsEmpleado() {
        System.out.print("¿Es empleado? (true/false): ");
        return objTeclado.nextBoolean();
    }
    
    public boolean tomarTieneMembresia() {
        System.out.print("¿Tiene membresía? (true/false): ");
        return objTeclado.nextBoolean();
    }
}