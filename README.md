# RestApiTest

"Company":CODTECH IT Solutions

Name: Bezawada Thanishma

Intern ID:CT04DN1543

"DOmain":JAVA Programming

"Duration":8 weeks

"Mentor":Neela Santhosh Kumar


Description: "The Java Weather App is a simple command-line-based application that enables users to access current weather information for any city in the world. It is developed using Java and integrates the OpenWeatherMap API to fetch live weather data. The primary purpose of this project is to demonstrate how Java can interact with web APIs, process HTTP responses, and parse JSON data to provide a user-friendly output. This application is ideal for beginners who want to explore real-world programming concepts like working with external APIs, handling input/output operations, and manipulating JSON structures. When the program is run, it prompts the user to enter the name of a city. After receiving the input, it constructs a URL by appending the city name and API key to the base endpoint provided by OpenWeatherMap. It then sends an HTTP GET request to the server using Java's built-in HttpURLConnection class. If the request is successful and the server responds with HTTP status code 200, the application proceeds to read the input stream line-by-line and builds the entire JSON response string.

This string is parsed using the org.json library's JSONObject class to extract key weather parameters such as the temperature (in degrees Celsius), humidity (as a percentage), and wind speed (in meters per second). These values are then printed to the console in a clean and structured format, making the app simple and easy to use for any user. If the response code is anything other than 200 (e.g., due to a misspelled city name or network issue), the program displays an appropriate error message. The app includes exception handling to manage potential errors like network failures, malformed URLs, or I/O exceptions during API interaction. One of the highlights of this application is its clear separation of concerns: the fetchWeatherData method is responsible for making the API call and returning the parsed JSON object, while the displayWeatherData method handles the formatting and display logic.

From a learning perspective, this project provides exposure to multiple core concepts in Java including user input handling using Scanner, network communication using the java.net package, stream processing using BufferedReader, string manipulation using StringBuilder, and JSON parsing using a third-party library. Furthermore, this app serves as a great starting point for future enhancements such as displaying additional weather details (e.g., pressure, sunrise/sunset times), adding support for country codes, integrating error logging, or developing a GUI-based version using JavaFX or Swing. To run this application, the user must have Java installed on their system and must include the json-20210307.jar file in their classpath during compilation and execution. The API key used in the app can be easily obtained by creating a free account on the OpenWeatherMap website. Overall, the Java Weather App is a lightweight yet practical project that illustrates how a basic Java program can connect to the internet, fetch useful data from public APIs, and present it to users effectively. It combines simplicity with functionality and is ideal for students, interns, or hobbyists looking to build their Java development skills."


Output:

<img width="959" alt="Image" src="https://github.com/user-attachments/assets/0827bd8d-4f04-457d-9294-904a5365ed59" />
