import java.util.ArrayList;

public class WeatherDatabase {
    private ArrayList<WeatherData> db = new ArrayList<>();

    // how to get info in and out of this databasse...

    // setters and getters?  kind of?


    public ArrayList<WeatherData> getDb() {
        return db;
    }

    public void setDb(ArrayList<WeatherData> db) {
        this.db = db;
    }

    public void add(WeatherData data) {
        db.add(data);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("My weather database contents: \n");
        output.append(db.toString());
        return output.toString();
    }
}
