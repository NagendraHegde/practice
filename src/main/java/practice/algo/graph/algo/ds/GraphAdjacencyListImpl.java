package practice.algo.graph.algo.ds;

import java.util.LinkedList;

import static java.lang.String.*;

public class GraphAdjacencyListImpl implements Graph<Integer> {

    private LinkedList<Integer>[] adjList;
    private int size;

    public GraphAdjacencyListImpl(final int size) {
        this.size = size;
        adjList = new LinkedList[size];
    }

    public void addEdge(final Integer startNode, final Integer endNode) {

        if (startNode >= size || endNode >= size || startNode < 0 || endNode < 0) {
            throw new RuntimeException(
                    format("startNode %s or endNode %s can not be greater" +
                            " than size %s or be less than zero", startNode, endNode, size));
        }

        if(!adjList[startNode].contains(endNode)) adjList[startNode].add(endNode);
    }

    public void removeEdge(final Integer startNode, final Integer endNode){

        if (startNode >= size || endNode >= size || startNode < 0 || endNode < 0) {
            throw new RuntimeException(
                    format("startNode %s or endNode %s can not be greater" +
                            " than size %s or be less than zero", startNode, endNode, size));
        }

        if(adjList[startNode].contains(endNode)) adjList[startNode].remove(endNode);
    }

}
