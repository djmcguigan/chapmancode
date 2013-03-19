import java.util.Scanner;

public class Driver{
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