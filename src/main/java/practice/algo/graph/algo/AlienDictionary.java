package practice.algo.graph.algo;

import practice.algo.graph.algo.ds.GraphAdjacencyListImpl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * solution for:
 * https://www.geeksforgeeks.org/given-sorted-dictionary-find-precedence-characters/
 */

public class AlienDictionary {


    String printCharOrder(String[] dict) {
        Set<Character> characters = getDistinctChars(dict);
        GraphAdjacencyListImpl graph = new GraphAdjacencyListImpl(characters.size());


        
        
        for (String str : dict) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                graph.addEdge(chars[i] - 'a', chars[i + 1] - 'a');
            }
        }
        StringBuilder output = new StringBuilder();
        for (Integer i :
                GraphUtil.topolgicalSort(graph)) {
            output.append(i);
        }
        return output.toString();
    }


    public Set<Character> getDistinctChars(final String[] dict) {
        final Set<Character> output = new HashSet<>();
        for (String str :
                dict) {
            output.addAll(str.chars()
                    .mapToObj(i -> (char) i)
                    .collect(Collectors.toSet()));
        }
        return output;
    }

}
