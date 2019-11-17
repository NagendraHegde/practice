package practice.algo.graph.algo.ds;

import java.util.List;
import java.util.Set;

public interface WeightedGraph<V, E> {

    /**
     * returns the total number of nodes in the graph
     */
    public int getSize();


    /**
     *
     * @param startNode
     * @param endNode
     *
     */
    public void addEdge(V startNode, V endNode, E edge);


    /**
     *
     * @param startNode
     * @param endNode
     */
    public E removeEdge(V startNode, V endNode);


    /**
     *
     * @param node
     * @return all the nodes that are connected to passed node via edges
     */
    public Set<V> getConnectedNodes(V node);


    public Set<E> getConnectedEdges(V node);


}
