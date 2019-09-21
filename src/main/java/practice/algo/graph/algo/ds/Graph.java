package practice.algo.graph.algo.ds;


/**
 * @author nagendrahegde4sdmcet@gmail.com
 *
 * Graph data structure, containing nodes and edges.
 * Nodes have specific values assigned to them, Edges connect nodes.
 * Graph can be directed or undirected, upto the implementation
 */

public interface Graph<T> {

    /**
     *
     * @param startNode
     * @param endNode
     *
     */
    public void addEdge(T startNode, T endNode);


    /**
     *
     * @param startNode
     * @param endNode
     */
    public void removeEdge(T startNode, T endNode);
}
