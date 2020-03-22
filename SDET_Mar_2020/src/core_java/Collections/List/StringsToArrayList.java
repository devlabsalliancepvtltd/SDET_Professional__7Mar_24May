package core_java.Collections.List;
import java.util.*;

public class StringsToArrayList {

	public static void main(String[] args)
	{  
		String[] words = {"hai", "boom", "hello", "friend", "dear"};  
		
		List<String> list = Arrays.asList(words);  
		
		System.out.println("As a list:" +list);
		for (String e : words)  {  
			System.out.print(" "+e);  
		}  
	}  
}
