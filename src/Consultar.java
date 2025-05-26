import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Consultar {
    public Consultar(String moneda1, String moneda2, String cantidad){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Properties prop = new Properties();
        try {
            FileInputStream input = new FileInputStream("config.properties");
            prop.load(input);
        } catch (IOException e) {
            System.out.println("Error al leer archivo de configuración.");
            return;
        }

        String apiKey = prop.getProperty("API_KEY");
        String direccion = "https://v6.exchangerate-api.com/v6/"
                + apiKey + "/pair/"
                +moneda1+ "/"
                + moneda2 +"/"+ cantidad;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Monedas conversion;
            conversion = gson.fromJson(json, Monedas.class);
            Moneda miConversion = new Moneda(conversion);
            System.out.println(miConversion);

        } catch (Exception e){
            System.out.println("Ocurrio un error: ");
            System.out.println(e.getMessage());
        }
    }
}
