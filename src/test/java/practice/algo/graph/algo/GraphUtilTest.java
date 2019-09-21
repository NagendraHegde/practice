package practice.algo.graph.algo;

import org.junit.jupiter.api.Test;
import practice.algo.graph.algo.ds.Graph;
import practice.algo.graph.algo.ds.GraphAdjacencyListImpl;

import static org.junit.jupiter.api.Assertions.*;

class GraphUtilTest {

    @Test
    void topolgicalSortHappyPath() {


        // Create a graph given in the above diagram
        GraphAdjacencyListImpl g = new GraphAdjacencyListImpl(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological " +
                "sort of the given graph");
        Integer[] output = GraphUtil.topolgicalSort(g);
        for (Integer integer : output) {
            System.out.println(integer);
        }
    }
}