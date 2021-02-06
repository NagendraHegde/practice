package practice.algo.array;

//https://www.geeksforgeeks.org/find-number-of-islands/

public class IslandCounter {

    private final int ROW = 5;
    private final int COLUMN = 5;

    private boolean isInIsland(final int array[][], final boolean[][] visited, final int row, final int column) {
        return (row >= 0 && row < ROW && column >= 0 && column < COLUMN && array[row][column] == 1 && !visited[row][column]);
    }

    private void traverseIsland(final int array[][], final boolean[][] visited, final int i, final int j) {

        int[] rowNeighbours = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colNeighbours = {-1, 0, 1, -1, 1, -1, 0, 1};

        visited[i][j] = true;

        for (int k = 0; k < rowNeighbours.length; k++) {
            if (isInIsland(array, visited, i + rowNeighbours[k], j + colNeighbours[k])) {
                traverseIsland(array, visited, i + rowNeighbours[k], k + colNeighbours[k]);
            }
        }

    }

    public int coundIslands(final int array[][]){
        int count = 0;
        boolean visited[][] = new boolean[array.length][array[0].length];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == 1 && !visited[i][j]){
                    count++;
                    traverseIsland(array, visited, i, j);
                }
            }
        }

        return count;
    }
}
