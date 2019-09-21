package practice.algo.graph.algo;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import practice.algo.graph.algo.ds.GraphAdjacencyListImpl;

import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author nagendrahegde4sdmcet@gmail.com
 */

public class GraphUtil {

    /**
     * @param graph
     * @return topologically sorted integer array of nodes
     * <p>
     * This method is limited to the adjacency list impl of graph
     * <p>
     * https://www.geeksforgeeks.org/topological-sorting/
     */
    public static Integer[] topolgicalSort(final GraphAdjacencyListImpl graph) {

        final Stack<Integer> stack = new Stack<>();
        final boolean[] visited = new boolean[graph.getSize()];


        for (int i = 0; i < graph.getSize(); i++) {
            if (!visited[i]) {
                doTopologicalSort(graph, i, visited, stack);
            }
        }

        final Integer[] output = new Integer[graph.getSize()];
        for (int i = 0; i < graph.getSize(); i++) {
            output[i] = stack.pop();
        }

        return output;
    }


    private static void doTopologicalSort(final GraphAdjacencyListImpl graph,
                                   final int currentNode, final boolean[] visited,
                                   final Stack<Integer> stack) {

        visited[currentNode] = true;

        for (final Integer node : graph.getConnectedNodes(currentNode)
        ) {
            if (!visited[node]) doTopologicalSort(graph, node, visited, stack);
        }

        stack.push(currentNode);
    }
}
