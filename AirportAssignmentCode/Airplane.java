public class Airplane {
    private int fligthNum;
    private String airlineCode;
    private String airlineName;

    public Airplane(int fligthNum, String airlineCode, String airlineName) {
        this.fligthNum = fligthNum;
        this.airlineCode = airlineCode;
        this.airlineName = airlineName;
    }

    public int getFligthNum() {
        return fligthNum;
    }

    public void setFligthNum(int fligthNum) {
        this.fligthNum = fligthNum;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }


    @Override
    public String toString() {
        return "Airplane{" +
                "fligthNum=" + fligthNum +
                ", airlineCode='" + airlineCode + '\'' +
                ", airlineName='" + airlineName + '\'' +
                '}';
    }
}
