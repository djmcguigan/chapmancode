import java.util.*;
import java.io.*;

/**
 *  Implementation of lists, using singly linked elements.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 */
public class SinglyLinkedList{
    private ListNode first;  // first element
    private ListNode last;
   

    /**
     *  Constructor for the SinglyLinkedList object
     *  Generates an empty list.
     */
    public SinglyLinkedList(){
        first = null;
        last = first;
    }   

    /**
     * Returns the first element in this list.
     *
     * @return  the first element in the linked list.
     */
    public Object getFirst(){
        if (first == null){
            throw new NoSuchElementException();
        }
        else
            return first.getValue();
    }
    
    public Object getLast(){
        if(last == null)
            throw new NoSuchElementException();
        else
            return last.getValue();
    }

    /**
     *  Inserts the given element at the beginning of this list.
     *
     * @param  value  the element to be inserted at the beginning of this list.
     */
    public void addFirst(Object value){
        // note the order that things happen:
        // head is parameter, then assigned
        first = new ListNode(value, first);
    }
    
    public void addLast(Object value){
        if(first == null){
            first = new ListNode(value);
            last = first;
        }
        else{
            last.setNext(new ListNode(value));
            last = last.getNext();
        }
    }
    
    //counts size of LinkedList
    public int getSize(){
        int count = 0;
        ListNode nub = first;
        while(nub != null){
            count++;
            nub = nub.getNext();
        }
        return count;
    }
    /**
     *  Print the contents of the entire linked list
     */
    
//--------------following methods are from OrderedList----------------//

    //loads data from "file20.txt"
    private void loadData(SinglyLinkedList list){
    
        int id,inv;
    
        try{
            Scanner inFile = new Scanner(new File("filen00b.txt"));
            while(inFile.hasNext()){
                id = inFile.nextInt();
                inv = inFile.nextInt();
                list.insert(new Item(id, inv));
            }
        }catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
    }    

    //inserts new node in order in list
    public void insert(Item blah)
    {
     
        if(first == null || last == null){
            first = new ListNode(blah, null);
            last = first;
        }
        else if(blah.compareTo((Item)(first.getValue())) < 0){
            addFirst(blah);
        }
        else if(blah.compareTo((Item)(last.getValue())) > 0){
            addLast(blah);
        }
        else{
            ListNode front = first;
            ListNode back = first;
            while( (front != null) && (blah.compareTo((Item)(front.getValue())) > 0) )
           {
                back = front;
                front = front.getNext();
            }
            back.setNext(new ListNode(blah,front));
        }
    }
    
    //finds specified item in list
    public ListNode find(Item it){
        ListNode temp = first;
        while(temp != null){
            if(it.equals((Item)(temp.getValue()))){
                return temp;
            }
            
            else{
                temp = temp.getNext();
            }
        }
        return null;
    }
    
    //removes item from list
    public boolean remove(Item item){
        ListNode front = first;
        ListNode back = first;

        if(first == null){
            return false;
        }
        else if(find(item) == null){
            return false;
        }
        else if(front == find(item)){
            first = front.getNext();
        }
        else if(find(item) != null){
            while(front != find(item)){
                back = front;
                front = front.getNext();
            }
        }
        back.setNext(front.getNext());
        return true;
    }
    
    //dumps the list
    public void clear(){
        first = null;
        last = null;
    }
    
    //SOPs the list
    public void printList(){
        ListNode temp = first;// start from the first node
        System.out.println(toString());
    }
    
    public void printBackwards(){
        printBackwards(first);
    }
    
    private void printBackwards(ListNode node){
        if(node != null){
            printBackwards(node.getNext());
            System.out.println((Item)(node.getValue()));
        }
    }

    /**
     *  Returns a string representation of this list. The string
     *  representation consists of the list's elements in order,
     *  enclosed in square brackets ("[]"). Adjacent elements are
     *  separated by the characters ", " (comma and space).
     *
     * @return    string representation of this list
     */
    public String toString(){
        String s = "[";

        ListNode temp = first;  // start from the first node
        while (temp != null){
            s += temp.getValue(); // append the data
            temp = temp.getNext(); // go to next node
            if (temp != null)
                s += ", \n";
        }
        s += "]";
        return s;
    }
}