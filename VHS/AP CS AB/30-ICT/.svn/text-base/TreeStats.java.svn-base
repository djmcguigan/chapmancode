import java.io.*;
import java.util.Scanner;

public class TreeStats{
  private Scanner console;

  public TreeStats(){
      console = new Scanner(System.in);
  }

  public void readData (BinarySearchTree temp)
  {
    Scanner inFile;

    String fileName = "fileB.txt";
    String str;

    System.out.print("Filename to read: ");
    try{

    	inFile = new Scanner(new File(fileName));

    	//str = inFile.readToken();
    	while (inFile.hasNext()){
        	str = inFile.nextLine();
			//      System.out.print("|"+str+"|");
        	temp.insert(str);
    	}
    }catch(IOException i){
    	System.out.println("Error: " + i.getMessage());
    }
  }

    public void mainMenu (BinarySearchTree root){
        int choice;

        do{
            System.out.println("\nBinary tree menu\n");
            System.out.println("(1) Read from disk");
            System.out.println("(2) Print tree preorder");
            System.out.println("(3) Print tree inorder");
            System.out.println("(4) Print tree postorder");
            System.out.println("(5) Count nodes in the tree");
            System.out.println("(6) Count the leaves in the tree");
            System.out.println("(7) Height of tree");
            System.out.println("(8) Width of tree");
            System.out.println("(9) Clear tree");
            System.out.println();
            System.out.println("(10) Interchange tree");
            System.out.println("(11) printLevel");
            System.out.println("(12) isAncestor");
            System.out.println();
            System.out.println("(-1) Quit\n");
            System.out.print("Choice ---> ");
            choice = console.nextInt();

            System.out.println();
            switch (choice){
                case 1 :
                    readData(root);
                    break;
                case 2 :
                    System.out.println();
                    System.out.println("The tree printed preorder\n");
                    root.preOrder();
                    System.out.println();
                    break;
                case 3 :
                    System.out.println();
                    System.out.println("The tree printed inorder\n");
                    root.print();
                    System.out.println();
                    break;
                case 4 :
                    System.out.println();
                    System.out.println("The tree printed postorder\n");
                    root.postOrder();
                    System.out.println();
                    break;
                case 5 :
                    System.out.println();
                    System.out.print("Number of nodes in tree = ");
                    System.out.println(root.countNodes() + "\n");
                    break;
                case 6 :
                    System.out.println();
                    System.out.print("Number of leaves in tree = ");
                    System.out.println(root.countLeaves() + "\n");
                    break;
                case 7 :
                    System.out.println();
                    System.out.print("Height of tree = ");
                    System.out.println(root.height() + "\n");
                    break;
                case 8 :
                    System.out.println();
                    System.out.print("Width of tree = ");
                    System.out.println(root.width() + "\n");
                    break;
                case 9 :
                    root.clearTree();
                    break;
                case 10 :
                    root.interchange();
                    break;
                case 11 :
                    System.out.print("Print which level: ");
                    int level = console.nextInt();
                    root.printLevel(level);
                    System.out.println();
                    break;
                case 12 :
                    console.nextLine();//clear out line feed character
                    System.out.println("isAncestor: ");
                    System.out.print("Enter the ancestor: ");
                    String ancestor = console.nextLine();
                    System.out.print("Enter the descendant: ");
                    String descendant = console.nextLine();
                    if (root.isAncestor(ancestor, descendant))
                        System.out.println(ancestor + " is an ancestor of " + descendant);
                    else
                        System.out.println(ancestor + " is not an ancestor of " + descendant);
                    System.out.println();
                    break;
                default:
                    if (choice >= 0)
                        System.out.println("Not a valid choice!\n");
                    break;
      
            }
        }while (choice >= 0);
    }
}