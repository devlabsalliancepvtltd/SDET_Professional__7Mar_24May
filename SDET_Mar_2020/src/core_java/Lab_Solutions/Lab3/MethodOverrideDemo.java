package core_java.Lab_Solutions.Lab3;

		interface BankInterface
		{  
			int getRateOfInterest();  
		}  
		
		//Creating implementing classes.  
		class SBI implements BankInterface{  
			public int getRateOfInterest(){return 8;}  
		}  
		  
		class ICICI implements BankInterface{  
			public int getRateOfInterest(){return 7;}  
		}  
		class AXIS implements BankInterface{  
			public int getRateOfInterest(){return 9;}  
		}  
		
		//Test class to create objects and call the methods  
		
		public class MethodOverrideDemo {
			public static void main(String args[]){  
				SBI s=  new SBI();  
				ICICI i=new ICICI();  
				AXIS a= new AXIS();  
				
				System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()+"%");  
				System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()+"%");  
				System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest()+"%");  
			}  
}	
