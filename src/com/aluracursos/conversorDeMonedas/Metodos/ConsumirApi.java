package com.aluracursos.conversorDeMonedas.Metodos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumirApi {

    public Monedas convertirMonedas(String busqueda) {

        String KEY = "fd36e7f66349c37a855b66ea";
        String URL = "https://v6.exchangerate-api.com/v6/" + KEY + "/latest/" + busqueda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No se encontró la moneda.");
        }
    }
}
