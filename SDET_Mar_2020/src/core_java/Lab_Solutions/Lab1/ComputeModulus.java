package core_java.Lab_Solutions.Lab1;

import java.util.Scanner;

public class ComputeModulus {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int first, second,mod;
        
         System.out.println("Enter the first number: ");
         first = scanner.nextInt();
         System.out.println("Enter the second number: ");
         second = scanner.nextInt();
         scanner.close();
         
		 mod= first%second;
		 System.out.println("The modulus is: " + mod);

	}

}
