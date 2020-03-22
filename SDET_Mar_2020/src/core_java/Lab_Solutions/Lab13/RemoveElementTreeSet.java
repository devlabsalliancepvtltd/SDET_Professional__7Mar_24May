package core_java.Lab_Solutions.Lab13;
import java.util.*;
public class RemoveElementTreeSet {

	public static void main(String args[]) {
	//create TreeSet object
	 
	TreeSet<Integer> treeSet = new TreeSet<Integer>();
	           
	   //add elements to TreeSet object
	treeSet.add(11);
	treeSet.add(12);
	treeSet.add(13);
	 
	System.out.println("TreeSet before removal : " + treeSet);
	           
	 /*
	 To remove an element from Java TreeSet object use,
	 boolean remove(Object o) method.
	 This method removes an element from TreeSet if it is present and returns
	true. Otherwise remove method returns false.
	 */
	           
	   boolean isRemoved = treeSet.remove(13);
	   System.out.println("Was 13 removed from TreeSet ? " + isRemoved);
	           
	  System.out.println("TreeSet elements after removal : " + treeSet);
	          
	 
	}
	}


	
