public class GenericUUGraphDriver {
    public static void main(String[] args) {
        UUGraph<Integer> graph = new GenericAdjListGraph<>();

        for (int i =0; i<7; i++) {
            graph.addVertex(i);
        }

        System.out.println("All vertices in this graph: " + graph.getVertices());

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addEdge(4,5);
        graph.addEdge(5,6);

        UUGraph<String> sGraph = new GenericAdjListGraph<>();

        sGraph.addVertex("Hello");
        sGraph.addVertex("World");
        sGraph.addVertex("This");
        sGraph.addVertex("Graph");
        sGraph.addVertex("Has");
        sGraph.addVertex("Strings");

        sGraph.addEdge("Has", "Hello");

        System.out.println("All vertices in this graph: " + sGraph.getVertices());

        UUGraph<Airport> airportGraph = new GenericAdjListGraph<>();

        Airport jfk = new Airport("JFK");
        Airport ewr = new Airport("EWR");
        Airport sfo = new Airport("SFO");

        airportGraph.addVertex(jfk);
        airportGraph.addVertex(ewr);
        airportGraph.addVertex(sfo);

        airportGraph.addEdge(jfk, sfo);

        System.out.println("All vertices in this graph: " + airportGraph.getVertices());
    }

}
