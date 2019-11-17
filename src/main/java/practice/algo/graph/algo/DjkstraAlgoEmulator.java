package practice.algo.graph.algo;

import practice.algo.graph.algo.ds.Graph;
import practice.algo.graph.algo.ds.WeightedGraph;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

/**
 * https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
 */

public class DjkstraAlgoEmulator {

    public static int[] getShortestPathToAllVertices(final int[][] graph, final int nodeNumber) {

        int[] visitedNodes = new int[graph.length];
        int[] toBeVisitedNodes = new int[graph.length];


        //initiate the algo with input
        for(int i = 0; i < graph[nodeNumber].length; i++){
            if(graph[nodeNumber][i] > 0){
                toBeVisitedNodes[i] = graph[nodeNumber][i];
            }
        }

        //run the djkstra algo
        while (!allNodesVisited(visitedNodes, nodeNumber)) {

            int nextMinNode = getIndexOfMinElem(toBeVisitedNodes);
            System.out.println("nextMinNode: " + nextMinNode);
            if (nextMinNode == -1) continue;

            visitedNodes[nextMinNode] = toBeVisitedNodes[nextMinNode];
            toBeVisitedNodes[nextMinNode] = 0;

            for(int i = 0; i < graph[nextMinNode].length; i++){
                if(graph[nextMinNode][i] > 0 && visitedNodes[i] == 0 && nodeNumber != i){
                    toBeVisitedNodes[i] = graph[nextMinNode][i];
                    System.out.println("tobevisited node adding, tobevisitednode: " + i + " weight: " + toBeVisitedNodes[i]);
                }
            }

        }


        return visitedNodes;
    }


    private static int getIndexOfMinElem(final int[] input) {

        int min = Integer.MAX_VALUE;
        int mini = -1;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < min && input[i] != 0) {
                min = input[i];
                mini = i;
            }
        }

        return mini;
    }


    private static boolean allNodesVisited(final int[] visitedNodes, final int inputnode) {
        for (int i = 0; i < visitedNodes.length; i++) {
            if (visitedNodes[i] == 0 && i !=  inputnode) return false;
        }
        return true;
    }


    private static int getMinimumWeightedEdgeNode(final int[] edges) {
        return Arrays.stream(edges).filter(value -> value > 0).min().orElse(-1);
    }

    // Driver method
    public static void main(String[] args)
    {

        System.out.println("--------------------welcome to djkstra---------------------");
        /* Let us create the example graph discussed above */
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        int[] output = getShortestPathToAllVertices(graph, 0);
        System.out.println("V  Dist");
        for(int i =0; i < output.length; i++){
            System.out.println(i+"  "+output[i]);
        }
    }


}
