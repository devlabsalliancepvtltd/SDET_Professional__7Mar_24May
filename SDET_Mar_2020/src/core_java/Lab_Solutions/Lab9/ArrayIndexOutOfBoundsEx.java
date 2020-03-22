package core_java.Lab_Solutions.Lab9;

public class ArrayIndexOutOfBoundsEx 
{

	    static  void printArrayValue(){
	        try{
	        String[] array = new String[]{"one","two","three","four","five"};
	        //Trying to get value at index 10. But the length of array is 5
	        //Hence exception is thrown
	        String value = array[10];
	        }catch(Exception e){
	            System.err.println("Exception is : "+e.toString());
	        }
	    }
	    
	    public static void main(String[] args)
	    {
	        printArrayValue();
	    }
	}
