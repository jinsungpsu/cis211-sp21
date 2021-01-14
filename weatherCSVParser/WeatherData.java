public class WeatherData {
    private String date;
    private String avgTemp;
    private String location;

    public WeatherData(String date, String avgTemp, String location) {
        // implicitly calls super class constructor, but we can add it, too
        // super();
        this.date = date;
        this.avgTemp = avgTemp;
        this.location = location;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "date='" + date + '\'' +
                ", avgTemp='" + avgTemp + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

