public class mazee {
    static int rowIndex[] = {0, 0, -1, 1};
    static int colIndex[] = {-1, 1, 0, 0};

    public static void main(String[] args) {
        int n = 4;
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        boolean sol[][] = new boolean[n][n];
        if (solveMaze(maze, sol, 0, 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean solveMaze(int[][] maze, boolean[][] sol, int row, int col) {
        if (row == maze.length - 1 && col == maze.length - 1 && maze[row][col] == 1) {
            sol[row][col] = true;
            return true;
        }
        // Current move is valid
        if (isMovePossible(maze, row, col)) {
            // Check if the position has been visited or not
            if (sol[row][col]) {
                return false;
            }
            // If it is not visited, we update our solution
            sol[row][col] = true;
            // Try moving in all four directions: left, right, up, down
            for (int i = 0; i < 4; i++) {
                int rowi = row + rowIndex[i];
                int coli = col + colIndex[i];
                if (solveMaze(maze, sol, rowi, coli)) {
                    return true;
                }
            }
            sol[row][col] = false;
            return false;
        }
        return false;
    }

    private static boolean isMovePossible(int[][] maze, int row, int col) {
        return row >= 0 && row < 4 && col >= 0 && col < 4 && maze[row][col] == 1;
    }
}
