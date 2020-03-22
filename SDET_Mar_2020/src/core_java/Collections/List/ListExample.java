package core_java.Collections.List;
import java.util.*;  

	public class ListExample
	{  
		public static void main(String args[])
		{  
		 List al = new ArrayList();  
		//different data types in one list : possible
		al.add("Amit");  //add is the method for insertion
		al.add(true);
		al.add('v');  
		al.add("sdfsdfds");
		al.add(45354);
		
		al.add(1,"Sachin");  
		System.out.println("The element at 2nd position: "+al.get(2));
		
		for(int j=0;j<al.size();j++)
		{  
		  System.out.println("" +al.get(j));  //get() is used to fetch the value at a particular index
		}  
	   }  
	}  
