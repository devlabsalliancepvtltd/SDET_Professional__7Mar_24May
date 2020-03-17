//program to print Book Name and no. of pages using arrays.


package core_java.Arrays;
import java.util.*;

public class BookArray 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[][] book = new String[2][2]; //taking no. of pages as String as we can store only one datatype and we need String for Name
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++)
		{ 
			System.out.println("Enter the book details for book");
			for (int j = 0; j < book[i].length;j++)
			{ 
				if(j==0) {
					System.out.println("Enter the book name:");
					book[i][j] =  scan.nextLine();
				}
				if(j==1)
				{
					System.out.println("Enter the no. of pages:");
					book[i][j] =  scan.nextLine();
				}
			}
			System.out.println(); 
		}
		
		scan.close();
		
		for (int i = 0; i < book.length; i++) { 
			System.out.println("Book details: ");
			for (int j = 0; j < book[i].length;j++)
			{ 
				System.out.println(" " + book[i][j]);
			}
			System.out.println(); 
			}
		
		
		

	}

}
