/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<Integer> numeros;
    private List<String> resultados;
    
    public Historial() {
        this.numeros = new ArrayList<>();
        this.resultados = new ArrayList<>();
    }
    
    public void agregarResultado(int numero, String resultado) {
        numeros.add(numero);
        resultados.add(resultado);
    }
    
    public String[] obtenerHistorialNumeros() {
        return numeros.stream().map(String::valueOf).toArray(String[]::new);
    }
    
    public String[] obtenerHistorialResultados() {
        return resultados.toArray(new String[0]);
    }
}