import java.util.*;
import java.io.*;

    /**
     * Implements a recursive mergesort on a LinkedList data type
     * @author     G. Peck
     * @created    July 18, 2002
     * Modified by Jason Quesenberry and Nancy Quesenberry
     * February 9, 2006
     */
public class MergeList{
    private Scanner inFile;
    private String myFile;

    /**
     *  Open a file containing id/inventory pairs of data
     *
     * @param  fileName  File to be opened
     */
    public MergeList(String fileName){
        myFile = fileName;
    }

    /**
     *  Reads a file containing id/inv data pairs. The first line of the
     *  file contains the number of id/inventory integer pairs listed on
     *  subsequent lines.
     *
     * @param  list  Reference to LinkedList to which data will be added
     */
    public void readData(LinkedList <Item> list){
        try{
            inFile = new Scanner(new File(myFile));
            while(inFile.hasNextInt())
            {
                Item bob = new Item(inFile.nextInt(), inFile.nextInt());
                list.addFirst(bob);
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     *  Prints contents of list
     *
     * @param  list  linked list to be printed
     */
    public void printList(LinkedList <Item>list){
        ListIterator <Item> iter = list.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println();
        System.out.println();
    }

    /**
     *  Splits listA into two parts. listA retains the first
     *  half of the list, listB contains the last half of
     *  the original list.
     *
     * @param  listA    Original list. reduced by half after split.
     * @param  listB    Contains last half of the original list
     */
    private void split(LinkedList <Item> listA, LinkedList <Item> listB){
        ListIterator <Item> iter = listA.listIterator(listA.size()/2);
        while(iter.hasNext())
        {
            listB.add(iter.next());
            iter.remove();
        }
    }

    /**
     *  Two linked lists listA and listB are merged into a single
     *  linked list mergedList. They are placed in mergedList starting
     *  with the smallest item on either list and continue working up to
     *  to largest item.
     *
     * @param  listA   LinkedList in nondecreasing order
     * @param  listB   LinkedList in nondecreasing order
     * @return         List  containing all the values from lists listA
     *                 and listB, in nondecreasing order
     */
    private LinkedList merge(LinkedList <Item> listA, LinkedList <Item> listB){
        LinkedList <Item> mergedList = new LinkedList <Item>();
        ListIterator <Item> iterA = listA.listIterator(0);
        ListIterator <Item> iterB = listB.listIterator(0);
            
        for(int index = 1; index <= (listA.size() + listB.size()); index++)
        {
            if(!iterA.hasNext()){
                   mergedList.add(iterB.next());
            }
            else if(!iterB.hasNext()){   
                 mergedList.add(iterA.next());
            }
            else 
            {
                Item itA = iterA.next();
                Item itB = iterB.next();
                if(itA.compareTo(itB) < 0)
                {
                    mergedList.add(itA);
                    iterB.previous();
                }
                else
                {
                    mergedList.add(itB);
                    iterA.previous();
                }
            }
        }
        return mergedList;
    }

    /**
     *  The linked list is returned in sorted order.
     *  Sorted order has the smallest item first and the largest item
     *  last. The ordering is determined by the order defined in the
     *  Comparable class. The method uses the merge sort technique and
     *  must be recursive.
     *
     * @param  listA  LinkedList to be sorted
     * @return        LinkedList in sorted (nondecreasing) order
     */
    public LinkedList mergeSort(LinkedList <Item> listA){
        LinkedList <Item> listB = new LinkedList <Item>();
        
        if(listA == null){
            return null;
        }
        else if(listA.size() <= 1){
            return listA;
        }
        
        split(listA, listB);
        listA = mergeSort(listA);
        listB = mergeSort(listB);
        listA = merge (listA, listB);
        return listA;
    }

    /**
     *  Reverses the order of a list
     *
     * @param  list  LinkedList to be reversed
     * @return       List in reverse order
     */
    public LinkedList reverseList(LinkedList <Item> list){
        LinkedList <Item> list2 = new LinkedList <Item>();
        ListIterator<Item> reverse = list.listIterator(list.size());
        while(reverse.hasPrevious()){
            list2.add(reverse.previous());
        }
        return list2;
    }
//-------------------------driver------------------------------//
    public static void main(String[] args){
 
        LinkedList <Item> list = new LinkedList <Item>();
        LinkedList <Item> list2 = new LinkedList <Item>();
        MergeList link = new MergeList("file20.txt");
        link.readData(list);
        link.readData(list2);
        Scanner scan = new Scanner(System.in);
        String opt = "g";
        
        do{
            System.out.println("Please choose from the following: ");
            System.out.println("(1) Print original list");
            System.out.println("(2) Print sorted list");
            System.out.println("(3) Print unsorted reverse list");
            System.out.println("(4) Print sorted reverse list");
            System.out.println("(Q) Quit");
            System.out.println();
            System.out.print("Choice --> ");
            opt = scan.next() + " ";
			System.out.println();
            if(opt.charAt(0) == '1'){
                link.printList(list);
            }
            else if(opt.charAt(0) == '2'){
                link.printList(link.mergeSort(list));
            }
            else if(opt.charAt(0) == '3'){
                link.printList(link.reverseList(list2));
            }
            else if(opt.charAt(0) == '4'){
                list = link.mergeSort(list);
                list = link.reverseList(list);
                link.printList(list);
            }
        }while(opt.charAt(0) != 'Q' && opt.charAt(0) != 'q');
    }
}
