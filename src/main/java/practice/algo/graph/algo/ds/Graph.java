package practice.algo.graph.algo.ds;


/**
 * @author nagendrahegde4sdmcet@gmail.com
 *
 * Graph data structure, containing nodes and edges.
 * Nodes have specific values assigned to them, Edges connect nodes.
 * Graph can be directed or undirected, upto the implementation
 */

public interface Graph<T, V> {

    /**
     *
     * @param startNode
     * @param endNode
     *
     */
    public void addEdge(T startNode, V endNode);


    /**
     *
     * @param startNode
     * @param endNode
     */
    public void removeEdge(T startNode, V endNode);
}
