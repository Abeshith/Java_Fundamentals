import java.util.Arrays;

public class Recurision_Maze1 {
    public static void main(String[] args) {
        Boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        //AllPathsMaze("",maze,0,0);
        int[][] path = new int[maze.length][maze[0].length];
        AllPathsMazeWithMatriz("", maze,0,0,path,1);
    }

    static void AllPathsMaze(String p, Boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(maze[row][col] == false){
            return;
        }

        //Making changes
        maze[row][col] = false;


        if (row < maze.length - 1) {
            AllPathsMaze(p + "D", maze, row + 1, col);
        }
        if(col < maze[0].length - 1){
            AllPathsMaze(p + "R", maze, row, col + 1);
        }
        if(row > 0){
            AllPathsMaze(p + "U", maze, row - 1, col);
        }
        if(col > 0){
            AllPathsMaze(p + "L", maze, row, col - 1);
        }


        //Reverting the changes
        maze[row][col] = true;
    }

    static void AllPathsMazeWithMatriz(String p, Boolean[][] maze, int row, int col,int[][] path,int step) {
        if(row == maze.length - 1 && col == maze[0].length - 1){
            for(int[] num : path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(maze[row][col] == false){
            return;
        }

        //Making changes
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            AllPathsMazeWithMatriz(p + "D", maze, row + 1, col,path,step + 1);
        }
        if(col < maze[0].length - 1){
            AllPathsMazeWithMatriz(p + "R", maze, row, col + 1, path , step + 1);
        }
        if(row > 0){
            AllPathsMazeWithMatriz(p + "U", maze, row - 1, col, path , step + 1);
        }
        if(col > 0){
            AllPathsMazeWithMatriz(p + "L", maze, row, col - 1,path,step + 1);
        }


        //Reverting the changes
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
