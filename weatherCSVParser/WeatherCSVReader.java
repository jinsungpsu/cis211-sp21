import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherCSVReader {
    public static void main(String[] args) {
        // let's read from a file
        // let's create some objects from that information

        try {
            Scanner input = new Scanner(new File("weatherData.csv"));

            WeatherDatabase myWeather = new WeatherDatabase();

            while (input.hasNext()) {
                String line = input.nextLine();
                // System.out.println(line);

                String dataParts[] = line.split(",");

                // System.out.println("Weather for: " + dataParts[7] + " on " + dataParts[1] + " was: " + dataParts[10]);

                WeatherData weatherDataPoint = new WeatherData(dataParts[1], dataParts[10], dataParts[7]);
                // System.out.println(weatherDataPoint);

                // myWeather.getDb().add(weatherDataPoint);
                // I would much rather make this more intuitive...

                myWeather.add(weatherDataPoint);

                /*
                "Data.Precipitation",
                "Date.Full", <----------------------- 1
                "Date.Month",
                "Date.Week of",
                "Date.Year",
                "Station.City",
                "Station.Code",
                "Station.Location",<----------------------- 7
                "Station.State",
                "Data.Temperature.Avg Temp",<----------------------- 9
                "Data.Temperature.Max Temp",
                "Data.Temperature.Min Temp",
                "Data.Wind.Direction",
                "Data.Wind.Speed"
                 */
                /*
                for (int i = 0; i < dataParts.length; i++) {
                    System.out.println("###################");
                    System.out.println(dataParts[i] + " ");
                    System.out.println("###################");
                }

                 */

            }

            System.out.println(myWeather);

        } catch (FileNotFoundException e) {
            System.out.println("Hey file wasn't found.");
            System.out.println("More error details: " + e.toString());
        }


    }
}
