package core_java.Lab_Solutions.Lab8;
import java.util.Scanner;

	public class Concatenation {
		public static void main(String[] args){
		String result;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string1: ");
		String str1=in.nextLine();
		System.out.println("Enter the string2: ");
		String str2=in.nextLine();
		in.close();
		result=str1.concat(str2);
	    System.out.println("The resulting string is: "+result);
		}
	}

