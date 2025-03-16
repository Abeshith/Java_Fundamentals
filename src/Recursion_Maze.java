public class Recursion_Maze {
    public static void main(String[] args) {
        System.out.println(maze(3,3));

        System.out.println("Paths:");
        maze("",3,3);

        System.out.println();
        System.out.println("Diagonal:");
        diagonalmaze("",3,3);

        System.out.println();
        System.out.println("Obstacles");
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        pathobstacles("",maze,0,0);
    }
    static int maze(int r, int c){
        if(r == 1 || c == 1) return 1;

        int left = maze(r-1, c);
        int right = maze(r, c - 1);
        return left + right;
    }

    static void maze(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1) {
            maze(p + "D", r-1, c);
        }
        if (c > 1) {
            maze(p + "R", r, c-1);
        }
    }

    static void diagonalmaze(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1 && c > 1){
            diagonalmaze(p + "Diagonal-", r-1, c - 1);
        }
        if(r > 1){
            diagonalmaze(p + "Down-", r-1, c);
        }
        if(c > 1) {
            diagonalmaze(p + "Right-", r, c - 1);
        }
    }

    static void pathobstacles(String p,boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        if(r < maze.length - 1){
            pathobstacles(p + "Down-", maze, r+1, c);
        }
        if(c < maze[0].length -1){
            pathobstacles(p + "Right-", maze, r, c+1);
        }
    }
}
