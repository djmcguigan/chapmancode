public class BGDriver{
    public static void main(String[] args){
        int[][] pattern = { {3, 4},
                            {7, 8} };
                            
        int[][] rotatePattern = { {10, 6},
                                  {11, 7} };
        BoardGame shmen = new BoardGame();
        shmen.patternPos(pattern);
        shmen.display();
        System.out.println();
        shmen.displayRotate();
        System.out.println();
        
        //displayRotatedPatternPos
        Position posit = shmen.rotatedPatternPos(rotatePattern);
        System.out.println("RotatedPatternPos:");
        if(posit != null){
            System.out.println("Row = " + posit.getRow());
            System.out.println("Col = " + posit.getCol());
        }
        else{
            System.out.println("null");
        }
    }
}