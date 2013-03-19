public class BoardGame{
    private int[][] board = { {1, 2, 3, 4},
                              {5, 6, 7, 8},
                              {9, 10, 11, 12} };
    private Position p = null;
    private Position pos = null;
    
    //constructor
    public BoardGame(){}
    
    //part a
    public Position patternPos(int[][]pattern){
        int count = 0;
        //Position p = null;
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c] == pattern[0][0]){
                    p = new Position(r, c);
                    for(int row = 0; row < pattern.length; row++){
                        for(int col = 0; col < pattern[0].length; col++){
                            if(row + r >= board.length || col + c >= board[0].length)
                                p = null;
                        }
                    }
                }
            }
        }
        return p;
    }
    
    //part b
    public static int[][] rotate(int[][] A){
        int[][] turn = new int[A[0].length][A.length];
        
        for(int r = 0; r < A.length; r++)
            for(int c = 0; c < A[0].length; c++){
                turn[c][(turn[r].length-1) - r] = A[r][c];
            }
        return turn;
    }
    
    //part c
    public Position rotatedPatternPos(int[][] pattern){
        Position pos = null;
        int degrees = 0;
        
        while(degrees != 360){
            pos = patternPos(pattern);
            if(pos != null)
                return pos;
            pattern = rotate(pattern);
            degrees += 90;
        }
        return pos;
    }
    
    public void display(){
        System.out.println("PatternPos:");
        if(p != null){
            System.out.println("Row = " + p.getRow());
            System.out.println("Col = " + p.getCol());
        }
        else{
            System.out.println("null");
        }
    }
    
    public void displayRotate(){
        System.out.println("Rotate:");
        for (int row = 0; row < rotate(board).length; row++){
            for(int col = 0; col < rotate(board)[0].length; col++){
                System.out.print(rotate(board)[row][col]);
            }
            System.out.println();
        }
    }
}