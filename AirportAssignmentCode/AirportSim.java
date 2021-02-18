public class AirportSim {
    public static void main(String[] args) {
        Queue<Airplane> runway1 = new CircularArrayQueue<>();
        Queue<Airplane> runway2 = new CircularArrayQueue<>();

        //test1(runway1, runway2);

        //test2();

        //test3():

        airportSimulator(runway1, runway2);
    }

    private static void airportSimulator(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        // write some code so that runway1 and runway2 are dequeued according to the assignment logic
    }

    //one runway is empty
    static void test1(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        runway2.enqueue(new Airplane(140, "AA", "American Airlines"));
        runway2.enqueue(new Airplane(130, "AA", "American Airlines"));
        runway2.enqueue(new Airplane(142, "AA", "American Airlines"));
        runway2.enqueue(new Airplane(1483, "AA", "American Airlines"));
        runway2.enqueue(new Airplane(1401, "AA", "American Airlines"));
    }

    //equal runways
    static void test2(Queue<Airplane> runway1, Queue<Airplane> runway2) {

    }

    //unequal runways
    static void test3(Queue<Airplane> runway1, Queue<Airplane> runway2) {

    }


}
