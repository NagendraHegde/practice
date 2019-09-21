package practice.algo.graph.algo.ds;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.String.*;

public class GraphAdjacencyListImpl implements Graph<Integer> {

    private LinkedList<Integer>[] adjList;
    private int size;
    private int currentPosition = 0;

    public GraphAdjacencyListImpl(final int size) {
        this.size = size;
        adjList = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            adjList[i] = new LinkedList<>();
        }
        this.adjList[currentPosition++] = new LinkedList<Integer>();
    }

    public int getSize(){
        return size;
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

        adjList[startNode].remove(endNode);
    }

    public void decrementNode() {
        if(size == 0){
            throw new RuntimeException("No nodes to remove/decrement");
        }
        Arrays.stream(adjList).forEach(node -> node.remove(size));
        this.adjList[size] = null;
        size--;
    }

    public List<Integer> getConnectedNodes(Integer node) {
        return adjList[node];
    }

}
