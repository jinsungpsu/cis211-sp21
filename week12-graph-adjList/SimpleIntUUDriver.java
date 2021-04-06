public class SimpleIntUUDriver {
    public static void main(String[] args) {
        SeqIntGraph graph = new SeqIntGraph(7);

        graph.addEdge(10000,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addEdge(4,5);
        graph.addEdge(5,6);



    }
}
