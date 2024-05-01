package com.aluracursos.conversorDeMonedas.Metodos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.Scanner;


public class CalcularConversion {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Scanner lectura = new Scanner(System.in);

    public void calcular(String busqueda, String nombreMonedaActual, String monedaAConvertir, String nombreDeMonedaAConvertir) {
        String mensaje = "Seleccionaste convertir: ";
        String valorIngresado;


        ConsumirApi consumir = new ConsumirApi();
        String data = gson.toJson(consumir.convertirMonedas(busqueda));

        JsonObject jsonObject = gson.fromJson(data, JsonObject.class);

        // Moneda Actual
        String monedaActual = jsonObject.get("base_code").getAsString();

        // Valor de moneda a convertir
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        double valorDeMonedaAConvertir = conversionRates.get(monedaAConvertir).getAsDouble();

        System.out.println(mensaje + nombreMonedaActual + " >>>>>>> " + nombreDeMonedaAConvertir);
        System.out.println("Ingresa el valor de " + monedaActual + " a convertir: ");
        valorIngresado = lectura.nextLine();
        valorIngresado.replace(".", ",");
        Double valorIngresadoToDouble = Double.parseDouble(valorIngresado);

        System.out.println("Muy bien,vamos a convertir tu dinero.");
        BarraDeCarga cargar = new BarraDeCarga();
        cargar.Barra();


        if (valorIngresadoToDouble <= 0) {

            System.out.println("¡Ingrese una cantidad mayor!");
            valorIngresadoToDouble = lectura.nextDouble();

        } else if (valorIngresadoToDouble >= 1) {

            double valorcalculado = valorIngresadoToDouble * valorDeMonedaAConvertir;
            String valorcalculadoDosDecimal = String.format("%.2f", valorcalculado);
            System.out.println("$ " + valorIngresadoToDouble + " " + nombreMonedaActual+"s" + " equivalen a >>>> " + valorcalculadoDosDecimal + " " +  nombreDeMonedaAConvertir + "s");
            System.out.println("Presiona (0) para salir.");
        }
    }
}
