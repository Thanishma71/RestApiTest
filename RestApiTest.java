import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class RestApiTest {

    private static final String API_KEY = "58cc91a0d670f786cc1df80d4413be2b";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String city = scanner.nextLine();
        scanner.close();

        try {
            JSONObject weatherData = fetchWeatherData(city);
            if (weatherData != null) {
                displayWeatherData(weatherData);
            }
        } catch (IOException e) {
            System.out.println("Error fetching data: " + e.getMessage());
        }
    }

    private static JSONObject fetchWeatherData(String city) throws IOException {
        String urlString = String.format(API_URL, city, API_KEY);
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode == 200) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
            return new JSONObject(sb.toString());
        } else {
            System.out.println("HTTP error: " + responseCode);
            return null;
        }
    }

    private static void displayWeatherData(JSONObject weatherData) {
        System.out.println("\nWeather in " + weatherData.getString("name") + ":");
        JSONObject main = weatherData.getJSONObject("main");
        System.out.println("Temperature: " + main.getDouble("temp") + " °C");
        System.out.println("Humidity: " + main.getInt("humidity") + "%");
        JSONObject wind = weatherData.getJSONObject("wind");
        System.out.println("Wind Speed: " + wind.getDouble("speed") + " m/s");
    }
}
