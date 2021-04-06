import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GenericAdjListGraph<T> implements UUGraph<T> {

    private List<List<T>> graph;
    private HashMap<T, Integer> map = new HashMap<>();

    public GenericAdjListGraph() {
        graph = new ArrayList<>();
    }

    @Override
    public void addVertex(T vertex) {
        map.put(vertex, graph.size());
        graph.add(new LinkedList<T>());
    }

    @Override
    public void addEdge(T src, T dest) {
        // graph[src].add(dest);
        // figure out the "index" of src and dest
        int srcIndex = map.get(src);

        // add the edge information to the adj list to the
        // corresponding "row"

        graph.get(srcIndex).add(dest);
    }

    @Override
    public List neighbors(T vertex) {
        return null;
    }

    @Override
    public List getVertices() {
        // return the contents of the map
        List<T> allVertices = new ArrayList<>(map.keySet());
        return allVertices;
    }
}
