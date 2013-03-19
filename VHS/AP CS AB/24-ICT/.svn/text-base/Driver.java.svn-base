import java.util.Scanner;

public class Driver{
    public static void main(String[] args){
        
        final int NUM = 22;
        String next = "Y";
        Scanner read = new Scanner(System.in);
        
        Eraser pentel = new Eraser();
        boolean[][] paper = new boolean[NUM][NUM];
        pentel.load(paper);
        pentel.display(paper);
        
        while((next.equalsIgnoreCase("Y"))){
            int row, col;
            System.out.print("Enter the row and column of a spot to erase,"
                          + " and press enter --> ");
            row = read.nextInt();
            col = read.nextInt();
        
            System.out.println();
        
            pentel.erase(paper, row, col);
            pentel.display(paper);
            
            System.out.print("\n Continue? (Y/N)");
            next = read.next();
            
            System.out.println("\n\n");
        }
    }
}