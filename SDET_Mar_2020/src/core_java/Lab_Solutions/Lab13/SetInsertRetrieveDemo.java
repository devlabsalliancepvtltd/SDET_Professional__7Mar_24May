package core_java.Lab_Solutions.Lab13;
	import java.util.HashSet;
	import java.util.Iterator;
	 
	public class SetInsertRetrieveDemo
	{
	 
	public static void main(String[] args) {
	  
	//create object of HashSet
	 HashSet<Integer> hashSet = new HashSet();
	       
	 //add elements to HashSet object
	 hashSet.add(1);
	 hashSet.add(2);
	 hashSet.add(3);
	 hashSet.add(4);
	 hashSet.add(5);
	 hashSet.add(6);
	 hashSet.add(7);
	 hashSet.add(8);
	 
	System.out.println("Size of HashSet after addition : " + hashSet.size());
	 
	System.out.println("Hashset contains");
	 
	Iterator it=hashSet.iterator();
	             
	while(it.hasNext())
	{
		System.out.println(it.next());
	}   
	 
	}
	 
}

