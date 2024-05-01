package com.aluracursos.conversorDeMonedas.Metodos;

public class BarraDeCarga {

    public void Barra() {
        // Duración del bucle en milisegundos (5 segundos = 5000 milisegundos)
        int duracionBucle = 2000;

        // Número de iteraciones para la barra de carga
        int numIteraciones = 100;

        // Calcula el tiempo de espera entre iteraciones
        long tiempoEspera = duracionBucle / numIteraciones;

        // Bucle para la barra de carga
        for (int i = 0; i <= numIteraciones; i++) {
            // Calcula el progreso actual
            int progreso = i * 100 / numIteraciones;

            // Imprime la barra de carga
            System.out.print("\rProcesando: [");
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            for (int j = i; j < numIteraciones; j++) {
                System.out.print(" ");
            }
            System.out.print("] " + progreso + "%");

            // Espera antes de la siguiente iteración
            try {
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprime una nueva línea al finalizar
        System.out.println();
    }
}


