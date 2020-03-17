package core_java.Strings;

import java.util.*;

public class StringComparison {

		public static void main(String args[]){
			String str1, str2;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter first string");
			str1 = in.nextLine();
			System.out.println("Enter second string");
			str2 = in.nextLine();
			in.close();
			if ( str1.compareTo(str2) > 0 ){
				System.out.println("First string is greater");
			}
			else if ( str1.compareTo(str2) < 0 ){
				System.out.println("First string is smaller");
			}
			else{
				System.out.println("The strings are equal");// Strings are compared based on the length of the strings.
			}
		}
	}

