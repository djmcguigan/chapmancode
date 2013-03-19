import java.util.*;

public class KTour1{
    private int[] vertical = {1, 2, 2, 1, -1, -2, -2, -1};
    private int[] horizontal = {-2, -1, 1, 2, 2, 1, -1, -2};
    private int[][] board = new int[10][10];
    int count;
    int canMoveCount;
    

    public KTour1(){
        count = 1;
        canMoveCount = 0;
    }
    
    public void moveAvailable(){
        while(canMoveCount <= 7){
            move();
        }
        
    }
            
    
    private void move(){        
        int moveNumber = (int)(Math.random() * 8);
        int row = vertical[moveNumber];
        int col = horizontal[moveNumber];
        
        if(canMove(moveNumber)){
            board[row][col] = count;
            count ++;
        }
    }

    private boolean canMove(int move){
        int row = vertical[move];
        int col = horizontal[move];
        if((board[row][col] > 0) && (board[row][col] < board.length)){
            if(board[row][col] < board[row].length){
                if(board[row][col] != 0){
                    canMoveCount = 0;
                    return true;
                }
            }
        }
        canMoveCount++;
        return false;
    }
    
    public void display(){
                
        
        // display col numbers
        System.out.print("\t");
        for(int n = 1; n < board.length-1; n++){
            System.out.print(n%10);
            System.out.print(" ");
            
        }
        System.out.println();
        
        //display design and row numbers
        int row, col;
        for (row = 1; row < board.length-1; row++){
            System.out.printf("%2d", row);
            System.out.print("\t");
            for(col = 1; col < board[0].length-1; col++){
                System.out.print(board[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        KTour1 knight = new KTour1();
        
        knight.moveAvailable();
        knight.display();
    }
}