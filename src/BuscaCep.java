import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCep {

    public Cep buscaCep(String cep)  {
        String busca = "https://viacep.com.br/ws/" + cep + "/json";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(busca))
                .build();

        HttpResponse<String> response = null;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException | InterruptedException e){
            System.out.println("Não foi possível buscar o Cep");
            System.out.println(e.getMessage());
        }

        return new Gson().fromJson(response.body(), Cep.class);
    }

}
