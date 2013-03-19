
/**
 * Write a description of class CarRental here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.String;

public class CarRental
{
    private String myMake;
    private String myModel;
    private String myLicensePlate;
    private int myLicensePlateNum;
    private String myFirstLetter;
    private String mySecondLetter;
    private String myThirdLetter;
    private int myNumber;
    private int myTotal;
    private int myRemainder;
    private String myCode;
    
    public CarRental()
    {
        myMake = null;
        myModel = null;
        myLicensePlate = null;
        myFirstLetter = null;
        mySecondLetter = null;
        myThirdLetter = null;
        myRemainder = 0;
        myCode = null;
    }
    
    public void input()
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Input make -->  ");
        myMake = key.next();
        System.out.println();
        System.out.print("Input model -->  ");
        myModel = key.next();
        System.out.println();
        System.out.print("Input license plate w/ a space b/w the letters and numbers -->  ");
        myLicensePlate = key.next();
        myLicensePlateNum = key.nextInt();
        System.out.println();
        System.out.println();
    }
    
    public void findNumbers()
    {
        char myFirstLetter = myLicensePlate.charAt(0);
        char mySecondLetter = myLicensePlate.charAt(1);
        char myThirdLetter = myLicensePlate.charAt(2);
        myTotal = ((int)myFirstLetter + (int)mySecondLetter + (int)myThirdLetter + myLicensePlateNum);
    }
    
     public String findLetter()
     {
         int myRemainder = myTotal % 26;
         char code = (char)(myRemainder + (int)'A');
         return "" + code + myTotal;
     }
     
     public void output()
     {
         System.out.println("Make -->         " + myMake);
         System.out.println("Model -->        " + myModel);
         System.out.println("Rental Code -->  " + findLetter());
     }
}
