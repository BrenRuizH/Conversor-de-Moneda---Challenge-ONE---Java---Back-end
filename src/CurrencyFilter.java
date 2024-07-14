import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CurrencyFilter {
    public static Map<String, Double> filterCurrencies(Map<String, Double> rates, String... currencies) {
        return rates.entrySet().stream()
                .filter(entry -> List.of(currencies).contains(entry.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
