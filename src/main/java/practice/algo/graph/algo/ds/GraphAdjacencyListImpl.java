package practice.algo.graph.algo.ds;

import java.util.LinkedList;

import static java.lang.String.*;

public class GraphAdjacencyListImpl {

    private LinkedList<Integer>[] adjList;
    private int size;

    public GraphAdjacencyListImpl(final int size) {
        this.size = size;
        adjList = new LinkedList[size];
    }

    public void addEdge(final int startNode, final int endNode) {

        if (startNode >= size || endNode >= size || startNode < 0 || endNode < 0) {
            throw new RuntimeException(
                    format("startNode %s or endNode %s can not be greater" +
                            " than size %s or be less than zero", startNode, endNode, size));
        }

        if(!adjList[startNode].contains(endNode)) adjList[startNode].add(endNode);
    }

    public void removeEdge(final int startNode, final int endNode){

        if (startNode >= size || endNode >= size || startNode < 0 || endNode < 0) {
            throw new RuntimeException(
                    format("startNode %s or endNode %s can not be greater" +
                            " than size %s or be less than zero", startNode, endNode, size));
        }

        if(adjList[startNode].contains(endNode)) adjList[startNode].remove(endNode);
    }

}
