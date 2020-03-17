package core_java.Strings;

public class FirstStringExample {

	public static void main(String[] args) {
		
		String str1 = "Hello"; //str1 and str2 are two reference variables pointing t the same string literal
		String str2 = "Hello";
		
		String str3 = new String("Hello"); //2 string objects created in Heap area with contents as Hello
		String str4 = new String("Hello");
		
		char ch[] = {'s','t','r','i','n','g','s'};
		String s2 = new String(ch); //new string object created with the elements from a character array
		System.out.println(s2);
		
		//comparison of strings
		
		/*
		 * if(str1==str2) //== compares hashcodes and not content {
		 * System.out.println("str1==str2"); } else { System.out.println("str1!=str2");
		 * }
		 * 
		 * 
		 * if(str3==str4) { System.out.println("str3==str4"); } else {
		 * System.out.println("str3!=str4"); }
		 * 
		 * //equals() and equalsIgnoreCase() //== compares reference variables which are
		 * hashcodes while equals() compares content
		 * 
		 * if(str3.equalsIgnoreCase(str4)) {
		 * System.out.println("str3 is equal to str4"); } else {
		 * System.out.println("str3 is not equal to str4"); }
		 * 
		 * if(str3.compareTo(str4)==0) {
		 * System.out.println("str3 is equal to str4 by compareTo"); } else {
		 * System.out.println("str3 is not equal to str4 by compareTo"); }
		 */
		
		//length()
		String s5 = "Rohit  , Virat, Shikhar,   Ashwin";
		int len = s5.length(); //arrays have length whereas Strings have length()
		System.out.println("Length of s5 is" + len);
		
		//charAt()
		char c1 = s5.charAt(9);
		System.out.println(c1);
		
        //toUpperCase() toLowerCase()
		String s6 = s5.toUpperCase();
		//s5.toUpperCase();
		System.out.println("s5 is" + s5);
		
		//contains
		if(s5.contains("Shikhar"))
		{
			System.out.println("Shikhar is present");
		}
		
		//indexOf 
		int index1 = s5.indexOf("Virat");
		System.out.println("Index of Virat" +index1);		
			
		//lastIndexOf 
		int index2 = s5.lastIndexOf("i");
		System.out.println("Last Index" +index2);
		
		//replace
		String s10 = s5.replace('i','u');
		System.out.println("Altered String with u"+s10);
		
		//subString()
		String s8 = s5.substring(6); //start from 6th index and print till the end of the string :includes the index mentioned
		System.out.println("Substring 1 is"+s8);
		
		String s9 = s5.substring(6,8); //last INdex is not included, only the first index is included
		System.out.println("Substring 2 is"+s9);
		
		//convert to CharArray
		char[] arr = s5.toCharArray();
		for(char ch2: arr)
		{
			System.out.println(ch2 + "");
		}
		
		//split()
		String[] strArr = s5.split(",");
		for(String s: strArr)
		{
			System.out.println(s.trim());
		}
		
	}

}
