/**
 * main
 * 1) Find source position
 * 2) Perform DFS -> up, down, left, right
 */
class DFS {
  // Utility arrays to assist with moving in the four cardinal directions
  int[] RowUtil = {-1, 1, 0, 0};
  int[] ColUtil = {0, 0, -1, 1};

  public void FindPathExist(int[][] grid) {
      // Initialize the visited array
      boolean[][] visited = new boolean[grid.length][grid[0].length];
      int srcRow = -1;
      int srcCol = -1;

      // Find the source position
      for (int i = 0; i < grid.length; i++) {
          for (int j = 0; j < grid[0].length; j++) {
              if (grid[i][j] == 1) {
                  srcRow = i;
                  srcCol = j;
                  break;
              }
          }
      }

      // Check if a path exists from source to destination
      System.out.println(CheckPath(visited, grid, srcRow, srcCol));
  }

  private boolean CheckPath(boolean[][] visited, int[][] grid, int srcRow, int srcCol) {
      // If destination is found
      if (grid[srcRow][srcCol] == 2) {
          return true;
      }

      // Mark the current cell as visited
      visited[srcRow][srcCol] = true;

      // Explore all four possible directions
      for (int check = 0; check < 4; check++) {
          int newRow = srcRow + RowUtil[check];
          int newCol = srcCol + ColUtil[check];

          // Move to the next cell if it's a valid move
          if (ValidMove(grid, visited, newRow, newCol)) {
              if (CheckPath(visited, grid, newRow, newCol)) {
                  return true;
              }
          }
      }

      // Backtrack: unmark the current cell as visited
      visited[srcRow][srcCol] = false;
      return false;
  }

  private boolean ValidMove(int[][] grid, boolean[][] visited, int newRow, int newCol) {
      // Check if the move is within the grid bounds and the cell is not blocked (0), and not visited
      int n = grid.length;
      return newRow >= 0 && newRow < n && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] != 0 && !visited[newRow][newCol];
  }
}

public class checkpath {
  public static void main(String[] args) {
      int[][] grid = {
          {0, 3, 3, 0},
          {0, 3, 0, 0},
          {0, 3, 0, 2},
          {3, 3, 1, 0}
      };

      DFS dfs = new DFS();
      dfs.FindPathExist(grid);
  }
}
