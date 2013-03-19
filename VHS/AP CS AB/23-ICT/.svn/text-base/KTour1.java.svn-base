import java.util.*;

public class KTour1{
    private int[] vertical = {1, 2, 2, 1, -1, -2, -2, -1};
    private int[] horizontal = {-2, -1, 1, 2, 2, 1, -1, -2};
    private int[][] board = new int[9][9];
    private ArrayList <Integer> moveNum = new ArrayList <Integer>();
    private int count;
    private int row;
    private int col;
    private int index;  // index of moveNum arraylist
    private Position pos;

    //constructor
    public KTour1(){
        count = 1;
        row = 1;
        col = 1;
        pos = new Position(row, col);
        index = 0;
    }
    
    //i dont know what the heck im doing here
    public void moveAvailable(){
        while(moveNum.size() < 8){
            move(randNum());
        }
        
    }
    
	//random number generator
    private int randNum(){
        int rand = (int)(Math.random() * 8);
        return rand;
    }
            
    //make 1 move
    private void move(int randomNum){
        int move = randomNum;
        int r = row + vertical[move];
        int c = col + horizontal[move];
        
        if((canMove(move)) && (alreadyCalled(moveNum, move) == false)){
            count ++;
            board[r][c] = count;
            pos = new Position(r, c);
            row = pos.getRow();
            col = pos.getCol();
            System.out.println(" move #: " + count + "  row" + r + " col" + c);
            moveNum = new ArrayList <Integer>();
            
        }
        else if(alreadyCalled(moveNum, move)){
            return;
        }
        else{
            moveNum.add(index, move);
        }
    }

    //check if spot is taken
    private boolean canMove(int moveN){
        int r = row + vertical[moveN];
        int c = col + horizontal[moveN];
        if((r > 0) && (r < board.length)&& (c > 0 && c < board[row].length)){
            if(board[r][c] == 0){
                return true;
            }
        }
        return false;
    }
    
    //check if randNum is available
    private boolean alreadyCalled(ArrayList <Integer> arr, int num){
        for(int n = 0; n < arr.size(); n++){
            if(arr.get(n) == num){
                return true;
                
            }
        }
        return false;
    }
    
    public int returnCount(){return count;}
        
    //display board
    public void display(){
                
        
        // display col numbers
        System.out.print("\t");
        for(int n = 1; n < board.length; n++){
            System.out.print("\t");
            System.out.print(n%10);
            System.out.print(" ");
            
        }
        System.out.println();
        
        //display design and row numbers
        int row, col;
        for (row = 1; row < board.length; row++){
            System.out.printf("%2d", row);
            System.out.print("\t");
            for(col = 1; col < board[0].length; col++){
                System.out.print("\t");
                System.out.print(board[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("# of moves made: " + (count));
        System.out.println();
    }
    
    //driver
    public static void main(String[] args){
        KTour1 knight = new KTour1();
        //while(knight.returnCount() != 64){
            knight.moveAvailable();
            knight.display();
        //}
    }
}