package Services;

import Modelos.ApiK;
import Modelos.Conversor;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPIMoneda implements ApiK {
    public Conversor buscaMoneda(String denominacionBase){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+KEY_FINAL+"/latest/"+denominacionBase);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversión");
        }

    }
}