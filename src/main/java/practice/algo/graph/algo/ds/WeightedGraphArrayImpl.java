package practice.algo.graph.algo.ds;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WeightedGraphArrayImpl implements WeightedGraph<Integer, Integer> {


    private int[][] graph;

    WeightedGraphArrayImpl(final int[][] graph) {
        this.graph = graph;
    }

    @Override
    public int getSize() {
        return graph.length;
    }

    @Override
    public void addEdge(Integer startNode, Integer endNode, Integer edge) {
        graph[startNode][endNode] = edge;
        graph[endNode][startNode] = edge;
    }

    @Override
    public Integer removeEdge(Integer startNode, Integer endNode) {
        final int edgeWeight = graph[startNode][endNode];
        graph[startNode][endNode] = 0;
        graph[endNode][startNode] = 0;
        return edgeWeight;
    }


    @Override
    public Set<Integer> getConnectedNodes(Integer node) {

        return Arrays.stream(graph[node]).filter(value -> value > 0)
                .boxed()
                .collect(Collectors.toSet());

    }


    @Override
    public Set<Integer> getConnectedEdges(Integer node){

        return null;

    }
}
