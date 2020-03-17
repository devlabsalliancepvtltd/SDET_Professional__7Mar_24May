package core_java.Basic_OOPS;

class AbstractClassDemo
{ 
    public static void main (String[] args)  
    { 
        // creating the Object of Terrestrial class 
        // and using Animal class reference. 
        Animals object1 = new Terrestrial("Elephants"); 
        object1.basicDetails("are terrestrial animals. They "); 
        object1.habitat(); 
        object1.respiration(); 
          
           
        System.out.println(" "); 
           
        // creating the Objects of circle class 
        Animals object2 = new Aquatic("Fishes"); 
        object2.basicDetails("are aquatic animals. They "); 
        object2.habitat(); 
        object2.respiration(); 
         
    } 
} 