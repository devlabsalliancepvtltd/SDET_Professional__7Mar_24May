package core_java.Collections;

import java.util.*;

class Employee implements Comparable<Employee>{ 

    String name;
    int id;
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    Employee (String name, int id){
        this.name=name;
        this.id=id;
    }
 
    @Override    
    public int compareTo(Employee obj)
    {
        if (this.getId() == obj.getId()) {
        	return 0;}
        else if (this.getId() < obj.getId()){ return 1;}
        else {return -1;}
    }
 
}
public class SortStudentComparable
{ 
	public static void main(String args[])
	{
	//create TreeSet object
 
	TreeSet<Employee> treeSet = new TreeSet<Employee>();     
     
       //add elements to TreeSet
    treeSet.add(new Employee("abc",1));
    treeSet.add(new Employee("xyz",2));
    treeSet.add(new Employee("ssd",3));
    treeSet.add(new Employee("ert",4));
         
    Iterator itr = treeSet.iterator();
 
 while(itr.hasNext())
 {
     Employee obj= (Employee)itr.next();
     System.out.println(obj.getName()+"  "+obj.getId()); 
  }         

}
}