public class GenericWDGraphDriver {
    public static void main(String[] args) {
        WDGraph<Integer> graph = new GenericWDArrAdjMatrixGraph<>(3);

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1,2, 99);
        graph.addEdge(2, 3, 120);

        System.out.println("1's neighbors: " + graph.neighbors(1));

        WDGraph<String> nameGraph = new GenericWDArrAdjMatrixGraph<>(5);

        nameGraph.addVertex("Johnny");
        nameGraph.addVertex("Jane");
        nameGraph.addVertex("Sam");
        nameGraph.addVertex("Alex");
        nameGraph.addVertex("Jin");

        nameGraph.addEdge("Johnny", "Jane", 5);
        nameGraph.addEdge("Alex", "Jane", 3);
        nameGraph.addEdge("Jin", "Jane", 1);
        nameGraph.addEdge("Johnny", "Sam", 100);
        nameGraph.addEdge("Sam", "Jane", 50);

        System.out.println("Johnny's neighbors: " + nameGraph.neighbors("Johnny"));
    }
}
