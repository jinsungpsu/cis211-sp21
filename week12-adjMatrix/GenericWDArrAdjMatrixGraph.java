import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericWDArrAdjMatrixGraph<T> implements WDGraph<T> {

    private int[][] graph;
    private HashMap<T, Integer> map = new HashMap<>();
    private HashMap<Integer, T> reverseMap = new HashMap<>();
    private int count = 0;

    public GenericWDArrAdjMatrixGraph(int numVertices) {
        graph = new int[numVertices][numVertices];
    }

    @Override
    public void addVertex(T vertex) {
        map.put(vertex, count);
        reverseMap.put(count++, vertex);
    }

    @Override
    public void addEdge(T src, T dest, int weight) {
        int srcIndex = map.get(src);
        int destIndex = map.get(dest);

        graph[srcIndex][destIndex] = weight;
    }

    @Override
    public List neighbors(T vertex) {
        int index = map.get(vertex);

        List<T> neighbors = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            if (graph[index][i] != 0) {
                neighbors.add(reverseMap.get(i));
            }
        }
        return neighbors;
    }

    @Override
    public List getVertices() {
        return null;
    }
}
