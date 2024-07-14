import java.util.List;
import java.util.stream.Collectors;

public class CurrencyFilter {
    public static List<Currency> filterCurrencies(List<Currency> currencies, String criteria) {
        return currencies.stream()
                .filter(currency -> currency.getName().contains(criteria))
                .collect(Collectors.toList());
    }
}
