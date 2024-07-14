import com.google.gson.Gson;

public class JsonParser {
    private static final Gson gson = new Gson();

    public static <T> T parseJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }
}
