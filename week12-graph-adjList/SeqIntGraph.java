import java.util.ArrayList;
import java.util.LinkedList;

public class SeqIntGraph {
    // this graph can only hold ints, can only go in order starting at 0

    private LinkedList[] graph;

    public SeqIntGraph(int size) {
        graph = new LinkedList[1000000];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        graph[src].add(dest);
        graph[dest].add(src);
    }


}
