package com.aluracursos.conversorDeMonedas.Metodos;

public class Menu {

    private String indice = """
            *********************************************************************
            ************* - Conversor de Monedas - Reto de Alura - **************
            *********************************************************************
            """;
    private String subMenu  = """
            >>>>>>>>>> Sean bienvenidos a nuestro conversor de monedas <<<<<<<<<<
            >>>>>>>>>> Presiona (99) para ver el menú de instrucciones <<<<<<<<<<
            >>>>>>>>>>           Presiona (0) para salir               <<<<<<<<<<
            
            ********* 1  - Dólar              >>>>>>>    Peso Colombiano ********
            ********* 2  - Peso Colombiano    >>>>>>>    Dólar           ********
            ********* 3  - Dólar              >>>>>>>    Real Brasileño  ********
            ********* 4  - Real Brasileño     >>>>>>>    Dólar           ********
            ********* 5  - Dólar              >>>>>>>    Euro            ********
            ********* 6  - Euro               >>>>>>>    Dólar           ********
            ********* 7  - Euro               >>>>>>>    Peso Colombiano ********
            ********* 8  - Peso Colombiano    >>>>>>>    Euro            ********
            ********* 9  - Dólar              >>>>>>>    Peso Argentino  ********
            ********* 10 - Peso Argentino     >>>>>>>    Dólar           ********
            """;

    private String despedida = """
            *********************************************************************
            ************* - Conversor de Monedas - Reto de Alura - **************
            ******* - Transforma tu experiencia digital con nosotros.  - ********
            ********************** - Vuelve pronto! 😎  - ***********************
            *********************************************************************
            """;

    private String instrucciones = """
            *********************************************************************
            ************* - Conversor de Monedas - Reto de Alura - **************
            ********************** - Instrucciones de uso - *********************
            **** 1 - Elige una opción para convertir                         ****
            **** 2 - Ingresa el valor a convertir                            ****
            *********************************************************************
            **** 3 - Para salir presiona (0)                                 ****
            *********************************************************************
            """;

    public void renderizarMenu() {
        System.out.println(indice);
        System.out.println(subMenu);
        System.out.println("Elija una opción: ");
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String subMenu) {
        this.subMenu = subMenu;
    }

    public String getDespedida() {
        return despedida;
    }

    public void setDespedida(String despedida) {
        this.despedida = despedida;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }
}
