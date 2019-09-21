package practice.algo.graph.algo.ds;


import java.util.List;

/**
 * @author nagendrahegde4sdmcet@gmail.com
 *
 * Graph data structure, containing nodes and edges.
 * Nodes have specific values assigned to them, Edges connect nodes.
 * Graph can be directed or undirected, upto the implementation
 */

public interface Graph<V> {

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
    public void addEdge(V startNode, V endNode);


    /**
     *
     * @param startNode
     * @param endNode
     */
    public void removeEdge(V startNode, V endNode);

    public void incrementNode();

    /**
     * removes the last node (of highest value) from the graph,
     * and removes all the edges connected to it
     */
    public void decrementNode();


    /**
     *
     * @param node
     * @return all the nodes that are connected to passed node via edges
     */
    public List<V> getConnectedNodes(V node);


}
