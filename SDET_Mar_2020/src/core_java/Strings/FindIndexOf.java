package core_java.Strings;

import java.util.*;

public class FindIndexOf {
		public static void main(String args[]) { 
			Scanner in=new Scanner(System.in);
			String str1="";
			String str2 = "Hard work pays"; 
			System.out.println(str2); 
			System.out.print("Enter the character for which the index is to be found: ");
			str1=in.next();
			in.close();
			System.out.println("index Of the character is " +str2.indexOf(str1));  
		}
	}

