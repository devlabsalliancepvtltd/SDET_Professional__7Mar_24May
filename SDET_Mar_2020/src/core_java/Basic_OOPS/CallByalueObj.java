package core_java.Basic_OOPS;

public class CallByalueObj {

		 int data=50;  
		  
		 public static void change(CallByalueObj op1){  
		 op1.data=op1.data+100;//changes will be made to the instance variable  
		 }  
		     
		    
		 public static void main(String args[])
		 {  
			CallByalueObj op=new CallByalueObj();  
		   System.out.println("before change "+op.data);  
		   change(op);//passing object  
		   System.out.println("after change "+op.data);  
		  
		 }  
		}  
