//program to print the sum of all the elements of an array

package core_java.Arrays;
import java.util.*;

public class SumArray {

	public static void main(String[] args) {
		
		int[] arr = new int[5]; //declaration
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for(int i=0;i<5;i++)
		{
			arr[i] = reader.nextInt();
		}
		
		reader.close();
		
		int sum =0;
		
		/*
		 * for(int i=0;i<5;i++) { sum = sum + arr[i]; // sum += arr[i]; }
		 */
		
		//JVM finds out the loop counter from teh size of the array passed
		
		 for(int num : arr) //type var: collection/array var stores the type of data inside the array
		 { 
			 sum+=num; //sum = sum+num; }
		 }
		 
		
        System.out.println("Sum is " +sum);
	}

}
