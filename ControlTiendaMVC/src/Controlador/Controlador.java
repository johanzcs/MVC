/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ControlAcceso;
import Modelo.Cliente;
import Modelo.Empleado;
import Vista.Formulario;

public class Controlador {
    private ControlAcceso objControlAcceso;
    private Formulario objFormulario;
    
    public Controlador() {
        this.objControlAcceso = new ControlAcceso();
        this.objFormulario = new Formulario();
    }
    
    public void mostrarMenu() {
        int opcion;
        do {
            opcion = objFormulario.verMenuInicial();
            switch (opcion) {
                case 1:
                    boolean horario = objFormulario.tomarHorarioAtencion();
                    objControlAcceso.setHorarioAtencion(horario);
                    boolean esEmpleado = objFormulario.tomarEsEmpleado();
                    if (esEmpleado) {
                        System.out.println("Acceso permitido para empleados.");
                    } else {
                        boolean tieneMembresia = objFormulario.tomarTieneMembresia();
                        Cliente cliente = new Cliente("Cliente", tieneMembresia);
                        if (objControlAcceso.verificarAcceso(cliente)) {
                            System.out.println("Acceso permitido para clientes con membresía.");
                        } else {
                            System.out.println("Acceso denegado.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 2);
    }
}
