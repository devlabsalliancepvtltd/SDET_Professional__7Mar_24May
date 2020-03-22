package core_java.Collections.Sets;
import java.util.*; 

public class TreeSetDemo {
	 public static void main(String args[]){  
	 TreeSet<Integer> set=new TreeSet<Integer>();  //maintains ascending order : sort the elements itself
	         set.add(23);  
	         set.add(56);  
	         set.add(71);
	         set.add(91);
	         set.add(100); 
	         set.add(40); 
	         set.add(60); 
	         set.add(12); 
	         System.out.println("Traversing elements through Iterator");  
	         Iterator<Integer> i=set.iterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
	         System.out.println("Highest Value: "+set.pollLast());  //returns and removes the highest element
	         System.out.println("Lowest Value: "+set.pollFirst()); // returns and removes the smallest element
	         
	         //navigable set operations
	         System.out.println("Initial Set: "+set);  
	         System.out.println("Reverse Set: "+set.descendingSet());  //gives the set in descending order
		
		 System.out.println("Head Set: "+set.headSet(40, false));
		 System.out.println("SubSet: "+set.subSet(40, false, 60, true));
		 System.out.println("TailSet: "+set.tailSet(71, true));
		 System.out.println(set);
		 System.out.println("Traversing elements through Iterator in descending order"
		 );
		
		  Iterator<Integer> i1=set.descendingIterator(); System.out.println(set);
		 while(i1.hasNext()) { System.out.println(i1.next()); }
		
	 }  
}
