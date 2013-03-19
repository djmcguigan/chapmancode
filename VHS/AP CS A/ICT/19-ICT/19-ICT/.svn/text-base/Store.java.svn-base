import java.util.*;

public class Store{
    
	private List <Item> myStore;
	
	/**
	 * default constructor
	 * @param	
	 * @return	
	 */
	public Store(){
		myStore = new ArrayList <Item>();
		file = new File("File50.txt");
	}
    
	/**
	 * param constructor
	 * @param	fName	input file name
	 * @return	
	 */
	public Store(String fName){
		myStore = new ArrayList <Item>();
		file = new File(fName);
	}

    /**
	 * load file method
	 * @param	inFileName	the name of the file to load into memory
	 * @return
	 */
    private void loadFile(String inFileName)
    {
        int id;
        int inv;
        
        Scanner inFile;
		try
		{
			inFile = new Scanner(new File(inFileName));
			while (inFile.hasNextInt())
			{
				id = inFile.nextInt();
				inv = inFile.nextInt();
				myStore.add(new Item(id, inv));
			}
		}
		catch (IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
    }
    
	/**
	 * displays the store
	 * @param	
	 * @return
	 */
	public void displayStore(){
        System.out.print
    }
    
	/**
	 * generates a string of the private variables
	 * @param	
	 * @return	
	 */
	public String toString(){}  
    
	/**
	 * mergesort method
	 * @param	
	 * @return	
	 */
	public void sort(){
		mergeSort(myStore, 0, myStore.size()-1);
	}  //to get recursive sort going
    
	/**
	 * merge method for mergesort
	 * @param	list	the list of Items in memory
	 * @param	first	the index for the first item in the list/sublist
	 * @param	mid		the index for the middle value in the list/sublist
	 * @param	last	the index for the last value in the list/sublist
	 * @return	
	 */
	private void merge(ArrayList <Item> list, int first, int mid, int last){
        ArrayList <Item> temp = new ArrayList <Comparable> (list);
       
        int indexA = first;
        int indexB = mid + 1;
       
        for(int index = first; index <= last; index++){
            if(indexA > mid){
                list.set(index, temp.get(indexB));
                indexB++;
            } 
            else if(indexB > last){
                list.set(index, temp.get(indexA));
                indexA++;
            }
            else if(list.get(indexA).compareTo(list.get(indexB)) < 0){
                list.set(index, temp.get(indexA));
                indexA++;
            }
            else{
                list.set(index, temp.get(indexB));
                indexB++;
            }
        } 
    }
	
	
    public void mergeSort(ArrayList <Item> a, int first, int last){
        if(last - first == 0){}
        else if(last - first == 1){
            if(a.get(first).compareTo(a.get(last)) > 0){
                a.swap(a, first, last);
            }
        }
        else{
            int  mid;
            mid = (first + last) / 2;
            mergeSort (a, first, mid);
            mergeSort (a, mid+1, last);
            merge (a, first, mid, last);
        }
    }
    private void swap(ArrayList <Item> list, int a, int b){
        Item temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
    public void testSearch(){
        int idToFind;
        int invReturn;
        int index;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Testing search algorithm\n");
        do{
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) ---> ");
            idToFind = in.nextInt();
            //index = bsearch(new Item(idToFind, 0));
            //recursive version call
            index = bsearch (new Item(idToFind, 0), 0, myStore.size()-1);
            System.out.print("Id # " + idToFind);
            if (index == -1){
                System.out.println("     No such part in stock");
            }
            else{
                System.out.println("     Inventory = " + myStore.get(index).getInv());
            }
        } while (idToFind >= 0);
    }
    
    /**
     **  Searches the myStore ArrayList of Item Objects for the specified
     **  item object using a iterative binary search algorithm
     **
     ** @param  idToSearch  Item object containing id value being searched for
     ** @return             index of Item if found, -1 if not found
     **/
     
     private int bSearch(Item idToSearch){
         
         return -1;
     }

/**
   *  Searches the specified ArrayList of Item Objects for the specified
   *  id using a recursive binary search algorithm
   *
   * @param  idToSearch  Id value being search for
   * @param  first       Starting index of search range
   * @param  last        Ending index of search range
   * @return             index of Item if found, -1 if not found
   */
   
    private int bsearch(Item idToSearch, int first, int last){
        int mid = (first + last) / 2;
         
        int compare = idToSearch.compareTo(list.get(mid));
        
        if(first > last)
            return -1;
        if (compare == 0)
             return mid;
        else if (compare < 0)
            return bSearch(idToSearch, first, mid - 1);
        else if (compare > 0)
            return bSearch(idToSearch, mid + 1, last);
    }
}