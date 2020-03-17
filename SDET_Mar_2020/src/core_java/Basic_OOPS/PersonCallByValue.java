package core_java.Basic_OOPS;

public class PersonCallByValue
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Paridhi",32); //p1 is reference pointing to a Person object
        System.out.println("Person1 is: " + p1.name +" of age: " +p1.age);
        
        Person p2; //only reference
        p2=p1;
        
        p2.updateDetails("Mac", 40);
        
        System.out.println("Person 1 after method call: " + p1.name + p1.age);
	}

}





