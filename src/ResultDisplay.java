import java.util.List;

public class ResultDisplay {
    public static void displayCurrencies(List<Currency> currencies) {
        currencies.forEach(currency -> System.out.println(currency.toString()));
    }
}
