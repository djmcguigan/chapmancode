import java.util.*;
import java.io.*;

public class Grades{
	private int numClasses;
	private int numFails;
	private double GPA;
	
	public Grades(){
		
	}
	
	public void getGrades(){
		Scanner hojinFails = new Scanner(System.in);
		String input = " ";
		do{
			System.out.print("Input a grade, Q to quit: ");
			input = hojinFails.nextLine();
			System.out.println();
			if(input.equalsIgnoreCase("a")){
				GPA += 4.0;
				numClasses++;
			}
			else if(input.equalsIgnoreCase("b")){
				GPA += 3.0;
				numClasses++;
			}
			else if(input.equalsIgnoreCase("c")){
				GPA += 2.0;
				numClasses++;
			}
			else if(input.equalsIgnoreCase("d")){
				GPA += 1.0;
				numClasses++;
			}
			else if(input.equalsIgnoreCase("f")){
				GPA += 0.0;
				numClasses++;
				numFails++;
			}
			else{
				if(!input.equalsIgnoreCase("q"))
					System.out.println("Please enter a valid grade.");
			}
		}while(!input.equalsIgnoreCase("q"));
	}
	
	public void calculateGPA(){
		GPA = GPA/numClasses;
	}
	
	public void out(){
		if(numClasses < 4)
			System.out.println("INELIGIBLE, STUDENT TAKING TOO FEW CLASSES");
		else if(GPA > 2.0 && numFails > 0)
			System.out.println("INELIGIBLE, GPA IS ABOVE 2.0, BUT STUDENT HAS AN F");
		else if(GPA > 2.0){
			System.out.println("ELIGIBLE");
		}
		else if(GPA < 2.0 && numFails > 0){
			System.out.println("INELIGIBLE, GPA IS BELOW 2.0, AND STUDENT HAS AN F");
		}
		else if(GPA < 2.0 && numFails == 0){
			System.out.println("INELIBIBLE, GPA IS BELOW 2.0");
		}
		else if(GPA > 2.0 && numFails > 0)
			System.out.println("INELIGIBLE, GPA IS ABOVE 2.0, BUT STUDENT HAS AN F");
	}
	
	public static void main(String[] args){
		Grades parker = new Grades();
		parker.getGrades();
		parker.calculateGPA();
		parker.out();
	}
}