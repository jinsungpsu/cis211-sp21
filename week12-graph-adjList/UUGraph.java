// undirected, unweighted graph interface

import java.util.List;

public interface UUGraph<T> {
    public void addVertex(T vertex);

    public void addEdge(T src, T dest);

    public List neighbors(T vertex);

    public List getVertices();
}
