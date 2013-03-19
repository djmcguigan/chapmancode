public class Rolling
{
    private int myDie_1;
    private int myDie_2;
    private int myDie_3;
    
    public void diceRoll()
    {
        int count = 0;
        do{
            myDie_1 = (int)(Math.random() * 6) + 1;
            myDie_2 = (int)(Math.random() * 6) + 1;
            myDie_3 = (int)(Math.random() * 6) + 1;
            count++;
            System.out.println(myDie_1 + "\t" + myDie_2 + "\t" + myDie_3);
        }while((myDie_1 == myDie_2) || (myDie_1 == myDie_3) || (myDie_2 == myDie_3));
    
        System.out.println("Count = " + count);
    }
}