import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConsumer {
    private static final String API_KEY = "ccf67778e63254723cbc76bd";

    public static String getApiResponse(String baseCurrency) throws Exception {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + baseCurrency;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
