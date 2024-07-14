import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "URL_DE_LA_API";
            String response = ApiConsumer.getApiResponse(url);

            CurrencyList currencyList = JsonParser.parseJson(response, CurrencyList.class);
            List<Currency> filteredCurrencies = CurrencyFilter.filterCurrencies(currencyList.getCurrencies(), "criteria");

            ResultDisplay.displayCurrencies(filteredCurrencies);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
