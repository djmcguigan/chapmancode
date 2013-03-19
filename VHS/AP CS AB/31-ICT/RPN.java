import java.util.*;
import java.io.*;

public class RPN{
    private Stack <Integer> tower;
    private Queue <String> line;
    
    public RPN(){
        tower = new Stack <Integer>();
        line = new LinkedList <String>();
    }
    
    public void calculate(){
        String temp = "";
        Scanner print = new Scanner(System.in);
        
        System.out.println("Enter numbers for calculation, q when done");
              
        do{
            temp = print.next();            
            while(!(temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/") || temp.equalsIgnoreCase("q"))){
                tower.push((int)(temp.charAt(0))- 48);
                line.add(temp);
                temp = print.next();                
            }
            
            if(!temp.equalsIgnoreCase("q")){
                int second = tower.pop() ;
                int first = tower.pop() ;
                int answer = 0;
                
                line.add(temp);
                if(temp.equals("+")){
                    tower.push((Integer)first + second);
                }
                else if(temp.equals("-")){
                    tower.push((Integer)first - second);
                }
                else if(temp.equals("*")){
                    tower.push((Integer)first * second);
                }
                else if(temp.equals("/")){
                    tower.push((Integer)first / second);
                }
            }
        }while(!temp.equalsIgnoreCase("q"));
        pretty();
    }
    
    private void pretty(){
        while(!line.isEmpty()){
            System.out.print(line.remove() + "   ");
        }
        System.out.print("=   " + tower.pop());
    }
}