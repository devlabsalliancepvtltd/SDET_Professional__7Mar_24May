package core_java.Loops;

public class ContinueBreakDemo {

	public static void main(String[] args) 
	{
	 for(int i=1;i<=50;i++)
	 {
		 if(i>=30)
		 {
			 break;
		 }
		 if(i%2==0)
		 {
			 continue;
		 }
		 else
		 {
			 System.out.println(i);}
	   }
	  System.out.println("Getting executed");
	 }
	}

