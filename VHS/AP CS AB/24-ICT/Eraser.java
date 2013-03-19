import java.io.*;
import java.util.Scanner;

public class Eraser{
    private static final int NUM = 22;
    
    public void load(boolean[][] grid){
        String fileName = "digital.txt";
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
    
    public void erase(boolean[][] grid, int row, int col){

        if (1 <= row && row <= NUM && 1 <= col && col <= NUM){
            // boundary check, if false, a base case
            if (true == grid[row][col]){
                // if false, base case
                grid[row][col] = false;
                    erase(grid, row - 1, col);
                    erase(grid, row, col + 1);
                    erase(grid, row + 1, col);
                    erase(grid, row, col - 1);
            }
        }
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
                    System.out.print("@");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}