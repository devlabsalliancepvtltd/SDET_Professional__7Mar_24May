package core_java.Basic_OOPS;

public class CallByValueDemo {

		 int data=50;  
		  
		 public void change(int d)
		 {  
			 d=d+100;//changes will be made in the local variable only  
		 }  
		     
		 public static void main(String args[])
		 {  
		   CallByValueDemo op=new CallByValueDemo();  
		   System.out.println("before change "+op.data);  
		   op.change(500);  
		   System.out.println("after change "+op.data);  
		  
		 }  
		}  
