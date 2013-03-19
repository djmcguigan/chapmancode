/**
 *  Demonstrates the use of the SinglyLinkedList class.
 *
 * @author     G. Peck
 * @created    May 12, 2002
 */
public class ListDemo{
  SinglyLinkedList myList;

  public ListDemo(){
    myList = new SinglyLinkedList();
  }

  /**
   *  Creates a SinglyLinkedList of 5 Integer nodes
   */
  public void createList(){
    for (int k = 1; k <= 5; k++){
      myList.addFirst(new Integer(k));
    }
  }

  /**
   *  Display the first element of the list
   */
  public void displayFirst(){
    System.out.println("First Element: " + myList.getFirst());
  }

  /**
   *  Print the contents of myList
   */
  public void print(){
    myList.printList();
    System.out.println();
  }
}
