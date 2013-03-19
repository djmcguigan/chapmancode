import java.util.*;
import java.io.*;

public class DoublyLinkedList implements Comparable{
    private DListNode first;
    private DListNode last;

    
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
//     public void addFirst(Object value){
//         // note the order that things happen:
//         // head is parameter, then assigned
//         first = new DListNode(value, null, first);
//     }
//     
//     public void addLast(Object value){
//         if(first == null){
//             first = new DListNode(value, null, null);
//             last = first;
//         }
//         else{
//             last.setNext(new DListNode(value, last, null));
//             last = last.getNext();
//         }
//     }
    
    //counts size of LinkedList
    public int getSize(){
        int count = 0;
        DListNode nub = first;
        while(nub != null){
            count++;
            nub = nub.getNext();
        }
        return count;
    }
    //loads data from "file20.txt"
    private void loadData(DoublyLinkedList list){
    
        int id,inv;
    
        try{
            Scanner inFile = new Scanner(new File("file20.txt"));
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
    public void insert(Item item)
    {
        if(first == null){
            first = new DListNode(item, null, null);
            last = first;
        }
        else if(item.compareTo((Item)(first.getValue())) <= 0){
            first = new DListNode(item,first,null);
            first.getNext().setPrevious(first);
        }
        else{
            DListNode front = first;
            DListNode back = first;
            while((front != null) && (item.compareTo((Item)(front.getValue())) >= 0)){
                back = front;
                front = front.getNext();
            }
            if(front == null){
                last = new DListNode(item, null, last);
                back.setNext(last);
            }
            else 
            {
                back.setNext(new DListNode(item, front, back));
                front.setPrevious(back.getNext());
            }
        }
    }
    
    public void insert(Object obj)
    {
        if(first == null){
            first = new DListNode(obj, null, null);
            last = first;
        }
        else if(obj.compareTo(first.getValue()) <= 0){
            first = new DListNode(obj,first,null);
            first.getNext().setPrevious(first);
        }
        else{
            DListNode front = first;
            DListNode back = first;
            while((front != null) && (obj.compareTo(front.getValue()) >= 0)){
                back = front;
                front = front.getNext();
            }
            if(front == null){
                last = new DListNode(obj, null, last);
                back.setNext(last);
            }
            else 
            {
                back.setNext(new DListNode(obj, front, back));
                front.setPrevious(back.getNext());
            }
        }
    }
    public int compareTo(Object obj){
        return this.compareTo(obj);
    }
    //finds specified item in list
    public DListNode find(Item it){
        DListNode temp = first;
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
        DListNode front = first;
        DListNode back = first;

        if(first == null){
            return false;
        }
        else if(find(item) == null){
            return false;
        }
        else if(front == find(item)){
            first = front.getNext();
            first.setPrevious(null);
        }
        else if(find(item) != null){
            while(front != find(item)){
                back = front;
                front = front.getNext();
            }
            if(front.getNext() == null){
                back.setNext(front.getNext());
                last = back;
            }
            else{
                back.setNext(front.getNext());
                (front.getNext()).setPrevious(back);
            }
        }
        return true;
    }
    
    //dumps the list
    public void clear(){
        first = null;
        last = null;
    }
    
    //SOPs the list
    public void printList(){
        DListNode temp = first;// start from the first node
        System.out.println("DLinkedList: ");
        int count = 1;
        while(temp != null){
            System.out.println(count + "     " + temp.getValue());
            temp = temp.getNext();
            count++;
        }
    }
    
    public void printBackwards(){
        int count = 1;
        printBackwards(last, count);
    }
    private void printBackwards(DListNode node, int num){        
        if(node != null){
            System.out.println(num + "    " + node.getValue());
            num++;
            printBackwards(node.getPrevious(), num);
        }
    }
    
    /**
     * public void printBackwards(){
     *     int count = 1;
     *     
     *     while(node != null){
     *         System.out.println(count + "     " + (Item)(temp.getValue()));
     *         count++;
     *     }
     *  }
     */
    

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

        DListNode temp = first;  // start from the first node
        while (temp != null){
            s += temp.getValue(); // append the data
            temp = temp.getNext();      // go to next node
            if (temp != null)
            s += ", \n";
        }
        s += "]";
        return s;
    }
}