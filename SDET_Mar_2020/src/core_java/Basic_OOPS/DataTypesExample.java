package core_java.Basic_OOPS;

public class DataTypesExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int itemA=200, itemB=80, itemC=150;
       
        double discount=0.15,total_amt;
        
        total_amt=((3*itemA)+(5*itemB)+(2*itemC));
        
        total_amt = total_amt - discount*total_amt;
       // total_amt-= (0.15*total_amt);
        
        total_amt+=(0.02*total_amt);
        
       System.out.println("The total amount is " + total_amt);
	}    
}
