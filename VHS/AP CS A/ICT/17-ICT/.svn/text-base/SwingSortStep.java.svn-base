import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class SwingSortStep extends JFrame implements ActionListener{
	private Toolkit toolkit;
	private JPanel panel;
	private JLabel title;
	private JButton bubble;
	private JButton selection;
	private JButton insertion;
	private JButton mergesort;
	private String choice;
	private JButton quit;
	
	private Scanner console;
	private ArrayList <Comparable> myArray;
	private Sorts mySorts;
	
	public SwingSortStep(){
		console = new Scanner(System.in);
		myArray = null;
		mySorts = new Sorts();
		
		
		setTitle("Sorts");
		setSize(800,700);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		getContentPane().add(panel);
		
		panel.setLayout(null);
		
		title = new JLabel("Sorting Algorithm Demo Program");
		title.setFont(new Font("Arial Bold", Font.PLAIN, 28));
		title.setVisible(true);
		title.setBounds(50,50,500,250);
		
		bubble = new JButton("Bubble Sort");
		bubble.setBounds(50,400,100,50);
		bubble.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				resetArray();
				mySorts.bubbleSort(myArray);
			}
		});
	
		selection = new JButton("Selection Sort");
		selection.setBounds(200,400,100,50);
		selection.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				resetArray();
				mySorts.selectionSort(myArray);
			}
		});

		insertion = new JButton("Insertion Sort");
		insertion.setBounds(50,500,100,50);
		insertion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				resetArray();
				mySorts.insertionSort(myArray);
			}
		});

		mergesort = new JButton("Merge Sort");
		mergesort.setBounds(200,500,100,50);
		mergesort.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				resetArray();
				mySorts.insertionSort(myArray);
			}
		});

		quit = new JButton("Quit");
		quit.setBounds(50,600,100,50);
		quit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				resetArray();
				int last = myArray.size()-1;
				mySorts.mergeSort(myArray, 0, last);
			}
		});
		
		panel.add(title);
		panel.add(bubble);
		panel.add(selection);
		panel.add(insertion);
		panel.add(mergesort);
		panel.add(quit);
		
		setVisible(true);
	}

	private void fillArrayWithInts(){
		System.out.print("How many numbers do you wish to generate? ");
		int numInts = console.nextInt();
		System.out.print("Largest integer to generate? ");
		int largestInt = console.nextInt();
		
		Random randGen = new Random();
		myArray = new ArrayList<Comparable>();
		
		for(int loop = 0; loop < numInts; loop++){
			Integer x = new Integer(randGen.nextInt(largestInt) + 1);
			myArray.add(x);
		}
	}
	
	public void resetArray(){
		if(myArray == null)
			fillArrayWithInts();
		System.out.println();
		System.out.println("Array reset to:");
		screenOutput();
	}

	private void screenOutput(){
		for(int loop = 0; loop < myArray.size(); loop++){
			if(loop % 12 == 0)
				System.out.println();
			System.out.print(myArray.get(loop) + "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		SwingSortStep bob = new SwingSortStep();
	}
}