package com.aluracursos.conversorDeMonedas.Metodos;

import java.util.Scanner;

public class SeleccionarMoneda {

    public void seleccionar() {
        Scanner lectura = new Scanner(System.in);
        int opcion = -1;

        Menu verMuenu = new Menu();
        verMuenu.renderizarMenu();


        while (opcion != 0) {
            opcion = lectura.nextInt();
            String monedaAConvertir;
            String nombreMonedaActual;
            String monedaActual;
            String nombreDeMonedaAConvertir;

            switch (opcion) {
                // Despedida
                case 0:
                    Menu despedia = new Menu();
                    System.out.println(despedia.getDespedida());
                    break;
                // Opciones de conversión
                case 1:
                    monedaActual = "USD";
                    nombreMonedaActual = "Dólar";
                    monedaAConvertir = "COP";
                    nombreDeMonedaAConvertir = "Peso Colombiano";
                    CalcularConversion USDtoCOP = new CalcularConversion();
                    USDtoCOP.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;
                case 2:
                    monedaActual = "COP";
                    nombreMonedaActual = "Peso Colombiano";
                    monedaAConvertir = "USD";
                    nombreDeMonedaAConvertir = "Dólar";
                    CalcularConversion COPtoUSD = new CalcularConversion();
                    COPtoUSD.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;
                case 3:
                    monedaActual = "USD";
                    nombreMonedaActual = "Dólar";
                    monedaAConvertir = "BRL";
                    nombreDeMonedaAConvertir = "Real Brasileño";
                    CalcularConversion USDtoBRL = new CalcularConversion();
                    USDtoBRL.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;
                case 4:
                    monedaActual = "BRL";
                    nombreMonedaActual = "Real Brasileño";
                    monedaAConvertir = "USD";
                    nombreDeMonedaAConvertir = "Dólar";
                    CalcularConversion BRLtoUSD = new CalcularConversion();
                    BRLtoUSD.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;
                case 5:
                    monedaActual = "USD";
                    nombreMonedaActual = "Dólar";
                    monedaAConvertir = "EUR";
                    nombreDeMonedaAConvertir = "Euro";
                    CalcularConversion USDtoEUR = new CalcularConversion();
                    USDtoEUR.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;
                case 6:
                    monedaActual = "EUR";
                    nombreMonedaActual = "Euro";
                    monedaAConvertir = "USD";
                    nombreDeMonedaAConvertir = "Dólar";
                    CalcularConversion EURtoUSD = new CalcularConversion();
                    EURtoUSD.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;
                case 7:
                    monedaActual = "EUR";
                    nombreMonedaActual = "Euro";
                    monedaAConvertir = "COP";
                    nombreDeMonedaAConvertir = "Peso Colombiano";
                    CalcularConversion EURtoCOP = new CalcularConversion();
                    EURtoCOP.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;
                case 8:
                    monedaActual = "COP";
                    nombreMonedaActual = "Peso Colombiano";
                    monedaAConvertir = "EUR";
                    nombreDeMonedaAConvertir = "Euro";
                    CalcularConversion COPtoEUR = new CalcularConversion();
                    COPtoEUR.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;
                case 9:
                    monedaActual = "USD";
                    nombreMonedaActual = "Dólar";
                    monedaAConvertir = "ARS";
                    nombreDeMonedaAConvertir = "Peso Argentino";
                    CalcularConversion USDtoARS = new CalcularConversion();
                    USDtoARS.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;
                case 10:
                    System.out.println("Peso Argentino >>>>>>> Dólar");
                    monedaActual = "ARS";
                    nombreMonedaActual = "Peso Argentino";
                    monedaAConvertir = "USD";
                    nombreDeMonedaAConvertir = "Dólar";
                    CalcularConversion ARStoUSD = new CalcularConversion();
                    ARStoUSD.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
                    break;

                // Instrucciones de uso
                case 99:
                    Menu intrucciones = new Menu();
                    System.out.println(intrucciones.getInstrucciones());
                    break;
                default:
                    System.out.println("""
                                        Por favor, ingresa una opción válida. ⛔
                                        Estamos trabajando para tener más monedas, selecciona otra conversión. 🛠️
                                        """);
            }
        }

    }
}
