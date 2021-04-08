import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericAdjMatrxGraph<T> implements WDGraph<T> {
    private List<List<Integer>> graph;
    private HashMap<T, Integer> map = new HashMap<>();

    public GenericAdjMatrxGraph() {
        graph = new ArrayList<>();
    }

    @Override
    public void addVertex(T vertex) {
        map.put(vertex, graph.size());
        graph.add(new ArrayList<Integer>());

        // go back and make sure each row grows by 1...
        for (int i = 0; i < graph.size()-1; i++ ) {
            graph.get(i).add(0);
            graph.get(graph.size()-1).add(0);
        }

        // make sure that each row has the appropriate number of columns
    }

    @Override
    public void addEdge(T src, T dest, int weight) {
        int srcIndex = map.get(src);
        int destIndex = map.get(dest);

        // graph[src][dest] = weight;
        graph.get(srcIndex).set(destIndex, weight);
    }

    @Override
    public List neighbors(T vertex) {
        return null;
    }

    @Override
    public List getVertices() {
        return null;
    }
}
