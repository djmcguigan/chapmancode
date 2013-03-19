/**
   Lab Assignment AB28.1 - Email Directory
   
   File Name: EMDirectory.java

   The class EMDirectory stores email addresses as strings that are stored
   and accessed by name. The directory is initially setup in the constructor
   that reads  the information from the indicated file and creates the
   email directory. The email directory is then be able to add additonal names
   and email addresses, lookup the email address that goes with a name,
   look up all email addresses that have names with the same last name,
   and display all name - email pairs.
 
   @author     McGuigy
   @created    Nov. 21, 20008  
   
   Period 03
  
   Sources: Chris Nevison
   Modifiied by Jason Quesenberry and Nancy Quesenberry
   February 9, 2006
 */
import java.io.*;
import java.util.*;

public class EMDirectory{
    private Map<Name, String> dir;

    /**
     * Constructs an empty email directory map.
     */
    public EMDirectory(){
        dir = new TreeMap<Name, String>();
    }

    /**
     * Constructs an email directory map by reading name and email
     * information from the indicated file name and adding them to the
     * email directory map. The name information serves as the key for
     * the email address items
   
     * @param dirFile - file name containing names and email addresses
     */
    public EMDirectory(String dirFile){
        dir = new TreeMap<Name, String>();

        Scanner in;
    
        try{
            in = new Scanner(new File(dirFile));
            while(in.hasNext()){
                String lastName = "";
                String firstName = "";
                String emailAddr = "";
                if(in.hasNext())
                    firstName = in.next();
                if(in.hasNext())
                    lastName = in.next();
                if(in.hasNext())
                    emailAddr = in.next();

                addEntry(new Name(lastName, firstName), emailAddr);
            }
        }catch(IOException i){
            System.out.println("Error: " + i.getMessage());
        }
    }
    
    /**
     * Your description here
     * 
     * @param name  Your description here
     * @param emailAddr  Your description here
     */
    public void addEntry(Name name, String emailAddr){
        dir.put(name, emailAddr);
    }
    
    /**
     * Your description here
     * 
     * @param name  Your description here
     * @returns  Your description here
     */
    public String lookup(Name name){
        if(dir.containsKey(name) != false){
            return((String)(dir.get(name)));
        }
        return null;
    }
    
    /**
     * 
     * 
     * @param lastName  Your description here
     * @returns  all emails addresses associated with lastName
     */
    public Set lookupLastName(String lastName){
        Set <String> result = new TreeSet<String>();
        Set <Name> temp = new TreeSet<Name>();
        temp = dir.keySet();
        Iterator it = temp.iterator();
        while(it.hasNext()){
            Name ad = (Name)(it.next());
            if(ad.last().compareTo(lastName) == 0){
                result.add(dir.get(ad));
            }
        }
        return result;
    }
    
    /**
     * Your description here
     */
    public void listAll(){
        Set <Name> temp = dir.keySet();
        Iterator iter = temp.iterator();
        while(iter.hasNext()){
            Name blah = (Name)iter.next();
            System.out.println(blah.toString() + "\t" + dir.get(blah));
        }
    }
}