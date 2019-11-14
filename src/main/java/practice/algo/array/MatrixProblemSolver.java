package practice.algo.array;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class MatrixProblemSolver {

    public static void searchSortedMatrix(final int[][] sortedArr, final int elem) {
        int i = 0;
        int j = sortedArr.length;
        while (j >= 0 && i < sortedArr.length) {
            if(elem == sortedArr[i][j]){
                System.out.println(i + " " + j);
                return;
            }
            if(elem > sortedArr[i][j]){
                i++;
            }
            if(elem < sortedArr[i][j]){
                j--;
            }
        }


    }
}
