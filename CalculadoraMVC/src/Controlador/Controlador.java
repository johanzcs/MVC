/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Operacion;
import Vista.Formulario;

public class Controlador {
    private Formulario formulario;

    public Controlador() {
        this.formulario = new Formulario();
    }

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = formulario.mostrarMenu();
            switch (opcion) {
                case 1:
                    double num1 = formulario.solicitarNumero("Ingrese el primer número: ");
                    double num2 = formulario.solicitarNumero("Ingrese el segundo número: ");
                    String operacion = formulario.solicitarOperacion();
                    Operacion calculo = new Operacion(num1, num2, operacion);
                    formulario.mostrarResultado(calculo.calcular());
                    break;
                case 2:
                    System.out.println("Gracias por usar la calculadora. ¡Hasta la próxima!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}