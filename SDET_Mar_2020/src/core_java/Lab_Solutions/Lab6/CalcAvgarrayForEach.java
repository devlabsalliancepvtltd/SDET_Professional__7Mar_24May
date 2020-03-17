package core_java.Lab_Solutions.Lab6;

public class CalcAvgarrayForEach {

	public static void main(String[] args) {
		int[] arr = {19, 12, 16, 20, 33};
        int total = 0;
        int length =arr.length;
        for(int i: arr)
        {
        	total = total + i;
        }

        /* arr.length returns the number of elements 
         * present in the array
         */
        int average = total / length;
        
        /* This is used for displaying the formatted output
         * if you give %.4f then the output would have 4 digits
         * after decimal point.
         */
        System.out.println("The average is: " + average);
	}
}
