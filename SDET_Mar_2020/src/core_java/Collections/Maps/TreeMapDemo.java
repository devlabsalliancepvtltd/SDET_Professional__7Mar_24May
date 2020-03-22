package core_java.Collections.Maps;
import java.util.*;


public class TreeMapDemo {

	public static void main(String args[]) {  
	    TreeMap<Integer,Book> map=new TreeMap<Integer,Book>();  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
	    
	      map.put(100,b1);    
	      map.put(102,b2);    
	      map.put(101,b3);    
	      System.out.println("Before invoking remove() method");  
	      for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	      map.remove(102);      
	      System.out.println("After invoking remove() method");  
	      for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }
	      
	    //NavigableMap methods : 
	      //Maintains descending order  
	      System.out.println("descendingMap: "+map.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+map.headMap(102,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(100, false, 102, true));   
	
	//SortedMap Methods
	 //Returns key-value pairs whose keys are less than the specified key.  
    System.out.println("headMap: "+map.headMap(102));  
    //Returns key-value pairs whose keys are greater than or equal to the specified key.  
    System.out.println("tailMap: "+map.tailMap(102));  
    //Returns key-value pairs exists in between the specified key.  
    System.out.println("subMap: "+map.subMap(100, 102)); 
	}
}
