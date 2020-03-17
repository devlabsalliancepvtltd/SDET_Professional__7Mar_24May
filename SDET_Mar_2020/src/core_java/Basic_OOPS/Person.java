package core_java.Basic_OOPS;

public class Person
{
	 String name;
	 int age;
	 
	 Person(String name, int age)
	 {
		 this.name = name;
		 this.age= age;
	 }
	 
//	 public String toString()
//	 {
//		 return "Name is: " + name + " and Age is: " +age;
//	 }
//	 
	  public void updateDetails(String name, int age)
	  {
		  this.name = name;
		  this.age= age;
	  }
 }