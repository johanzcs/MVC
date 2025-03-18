/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ControlAcceso {
    private boolean horarioAtencion;
    private List<Empleado> empleados;
    private List<Cliente> clientes;
    
    public ControlAcceso() {
        this.horarioAtencion = false;
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    public void setHorarioAtencion(boolean horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
    
    public void agregarEmpleado(String nombre) {
        empleados.add(new Empleado(nombre));
    }
    
    public void agregarCliente(String nombre, boolean tieneMembresia) {
        clientes.add(new Cliente(nombre, tieneMembresia));
    }
    
    public boolean verificarAcceso(Persona persona) {
        if (persona instanceof Empleado) {
            return true;
        } else if (persona instanceof Cliente) {
            Cliente cliente = (Cliente) persona;
            return cliente.tieneMembresia() && horarioAtencion;
        }
        return false;
    }
}