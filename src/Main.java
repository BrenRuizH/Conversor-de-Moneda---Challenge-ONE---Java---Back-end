import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("La moneda base es USD - Dólares:");
        String baseCurrency = "USD";

        try {
            String response = ApiConsumer.getApiResponse(baseCurrency);
            Currency currency = JsonParser.parseJson(response, Currency.class);

            String[] selectedCurrencies = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
            Map<String, Double> filteredCurrencies = CurrencyFilter.filterCurrencies(currency.getConversionRates(), selectedCurrencies);

            ResultDisplay.displayCurrencies(filteredCurrencies);

            System.out.println("Ingrese el código de la moneda de origen:");
            String fromCurrency = scanner.nextLine().toUpperCase();

            System.out.println("Ingrese el código de la moneda de destino:");
            String toCurrency = scanner.nextLine().toUpperCase();

            System.out.println("Ingrese la cantidad a convertir:");
            double amount = scanner.nextDouble();

            double fromRate = filteredCurrencies.get(fromCurrency);
            double toRate = filteredCurrencies.get(toCurrency);
            double conversionRate = toRate / fromRate;

            double convertedAmount = CurrencyConverter.convert(amount, conversionRate);
            System.out.println("Cantidad convertida: " + convertedAmount);

        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
