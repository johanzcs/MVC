/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class SistemaSeguridad {
    private SensorMovimiento[] sensores;
    private boolean esDeNoche;
    private ArrayList<boolean[]> configuraciones;  

    public SistemaSeguridad() {
        // Crear un array de 3 sensores
        this.sensores = new SensorMovimiento[3];
        this.sensores[0] = new SensorMovimiento("S1");
        this.sensores[1] = new SensorMovimiento("S2");
        this.sensores[2] = new SensorMovimiento("S3");

        this.esDeNoche = false;
        this.configuraciones = new ArrayList<>();  
    }

    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public void configurarSensores(boolean[] estados) {
        for (int i = 0; i < sensores.length; i++) {
            sensores[i].setEstado(estados[i]);
        }
        configuraciones.add(estados); 
    }

    public void mostrarConfiguraciones() {
        for (int i = 0; i < configuraciones.size(); i++) {
            System.out.print("Configuración " + (i + 1) + ": ");
            for (boolean estado : configuraciones.get(i)) {
                System.out.print(estado + " ");
            }
            System.out.println();
        }
    }

    public void verificarSeguridad() {
        for (SensorMovimiento sensor : sensores) {
            sensor.mostrarEstado();
        }

        int detecciones = 0;
        for (SensorMovimiento sensor : sensores) {
            if (sensor.getEstado()) {
                detecciones++;
            }
        }

        if (detecciones >= 2 && esDeNoche) {
            System.out.println("¡Alarma activada! Se detectó intrusión.");
        } else {
            System.out.println("Sistema seguro.");
        }
    }

    public SensorMovimiento[] getSensores() {
        return sensores;
    }
}



