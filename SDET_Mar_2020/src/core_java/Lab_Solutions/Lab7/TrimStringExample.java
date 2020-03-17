package core_java.Lab_Solutions.Lab7;

public class TrimStringExample {

	public static void main(String args[]){
		String str ="    She sells sea shells on the sea shore    ";
		System.out.println("Input string is: "+str);
		System.out.println("After trimming, the result is:" );
		String str1 = str.trim();
		System.out.println(str1);
	}
}
