
/**
 * Write a description of class FibonacciDriver here.
 * 
 * @author McGuigy 
 * @version 11-21-07
 */

import java.util.Scanner;

public class FibonacciDriver
{
    public static void main(String[] cheese)
    {        
        
        Scanner key = new Scanner(System.in);
        System.out.print("Avanti Fibonacci Number --> ");
        int num = key.nextInt();
        System.out.println();
        System.out.println("The " + num + "th Fibonacci number is " + Fibonacci.fib(num));
        System.out.println();
        
        System.out.print("Avanti first multiplication number --> ");
        int num1 = key.nextInt();
        System.out.println();
        System.out.print("Avanti second multiplication number --> ");
        int num2 = key.nextInt();
        System.out.println();
        System.out.println("The product of " + num1 + " and " + num2 + " is " + Fibonacci.mult(num1,num2));
        System.out.println();
    }
}
