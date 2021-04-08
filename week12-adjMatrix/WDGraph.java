import java.util.List;

/*
This is from the Unweighted, undirected graph interface
public void addVertex(T vertex);

public void addEdge(T src, T dest);

public List neighbors(T vertex);

public List getVertices();
 */
public interface WDGraph<T> {
    // weighted, directed
    public void addVertex(T vertex);

    public void addEdge(T src, T dest, int weight);

    public List neighbors(T vertex);

    public List getVertices();

}
