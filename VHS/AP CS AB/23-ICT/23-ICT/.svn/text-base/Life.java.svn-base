import java.util.Scanner;
import java.io.*;

public class Life
{
    private static final int NUM = 22;
    
    public void load(boolean[][] grid){
        String fileName = "life100.txt";
        try{
            Scanner inFile = new Scanner(new File(fileName));
            inFile.nextInt();
            while(inFile.hasNextInt())
            {
                int row = inFile.nextInt();
                int col = inFile.nextInt();
                grid[row][col] = true;
                
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
  
    public void lifeRun(boolean[][] grid){
        
        boolean[][] copy = new boolean[NUM][NUM];
        
        // load copy
        for(int row = 1; row < NUM - 1; row++){
            for(int col = 1; col < NUM - 1; col++){
                copy[row][col] = grid[row][col];
            }
        }
        
        // changes in copy of births and deaths
        for(int row = 1; row < NUM-1; row++){
            for(int col = 1; col < NUM-1; col++){
                if((grid[row][col] != true) && (numNeighbors(grid, row, col) == 3)){
                    copy[row][col] = true;
                }
                else if((grid[row][col] == true) && (numNeighbors(grid, row, col) < 2) || (numNeighbors(grid, row, col) > 3)){
                    copy[row][col] = false;
                }
            }   
        }
        
        // update grid with changes
        for(int row = 1; row < NUM-1; row++){
            for(int col = 1; col < NUM-1; col++){
                grid[row][col] = copy[row][col];
            }
        }
    }

    
    private int numNeighbors(boolean[][] grid, int r, int c)
    {
        int count = 0;
        int row = r;
        int col = c;
        
        if(grid[row-1][col-1] == true)
            count ++;
        if(grid[row][col-1] == true)
            count++;
        if(grid[row+1][col-1] == true)
            count++;
        if(grid[row-1][col] == true)
            count++;
        if(grid[row+1][col] == true)
            count++;
        if(grid[row-1][col+1] == true)
            count++;
        if(grid[row][col+1] == true)
            count++;
        if(grid[row+1][col+1] == true)
            count++;
        
        return count;
    }
    
    private int countRow(boolean[][] grid, int r, int c){
        int count = 0;
        int row = r;
        for(int col = c; col < NUM; col++){
            if(grid[row][col] == true){
                count++;
            }
        }
        return count;
    }
    
    private int countCol(boolean[][] grid, int r, int c){
        int count = 0;
        int col = c;
        for(int row = r; row < NUM; row++){
            if(grid[row][col] == true){
                count++;
            }
        }
        return count;
    }
    
    private int totalNumAlive(boolean[][] grid){
        int count = 0;
        
        for(int row = 1; row < NUM-1; row++){
            for(int col = 1; col < NUM-1;col++){
                if(grid[row][col] == true){
                    count++;
                }
            }
        }
        return count;
    }
    
    public void display(boolean[][] grid){
        
        // display col numbers
        System.out.print("\t\t");
        for(int n = 1; n < NUM-1; n++){
            System.out.print(n%10);
        }
        System.out.println();
        
        //display design and row numbers
        int row, col;
        for (row = 1; row < NUM-1; row++){
            System.out.printf("%2d", row);
            System.out.print("\t\t");
            for(col = 1; col < NUM-1; col++){
                if(grid[row][col] == true){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("# in row 10 --> " + countRow(grid, 10, 0));
        System.out.println();
        System.out.println("# in col 10 --> " + countCol(grid, 0, 10));
        System.out.println();
        System.out.println("# in grid   --> " + totalNumAlive(grid));
    }

    public static void main(String[] args){
        
        final int NUM = 22;
        
        Life bio = new Life();
        boolean[][] matrix = new boolean[NUM][NUM];
        bio.load(matrix);
        bio.display(matrix);
        for(int i = 0; i < 5; i++){
            bio.lifeRun(matrix);
            bio.display(matrix);
        }
    }
}