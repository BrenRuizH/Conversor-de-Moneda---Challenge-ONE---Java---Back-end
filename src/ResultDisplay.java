import java.util.Map;

public class ResultDisplay {
    public static void displayCurrencies(Map<String, Double> rates) {
        rates.forEach((currency, rate) -> System.out.println(currency + ": " + rate));
    }
}
