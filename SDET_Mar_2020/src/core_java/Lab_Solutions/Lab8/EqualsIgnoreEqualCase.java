package core_java.Lab_Solutions.Lab8;

public class EqualsIgnoreEqualCase {

	public static void main(String[] args){
		String str1 = "Java";
		String str2 = "JAVA";
		System.out.println("Comparing strings : "+str1 + " and "+str2);
		System.out.println(str1 + " equals "+str2+" : "+str1.equals(str2));
		System.out.println(str1 + " equalsIgnoreCase "+str2+" : "+str1.equalsIgnoreCase(str2));
	}

}
