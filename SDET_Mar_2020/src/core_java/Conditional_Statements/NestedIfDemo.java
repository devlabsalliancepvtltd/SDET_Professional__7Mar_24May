package core_java.Conditional_Statements;
import java.util.*;

public class NestedIfDemo {

	public static void main(String[] args)
    {
		int marksObt, passMarks=40;
		char grade;
		// int count = 1;
		
		//passMarks = 40;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks obtained:");
        marksObt = input.nextInt();
        
        input.close();
        
        if(marksObt >=passMarks)
        {
        	if(marksObt >90) 
        	    grade = 'A';
        	else if(marksObt >75)
        		grade = 'B';
        	else if (marksObt >60)
        		grade = 'C';
        	else
        		grade = 'D';
        System.out.println("Passed");
        }
        
        else
        {
        	grade = 'F';
        	System.out.println("Try Harder");
        }
	}

}
