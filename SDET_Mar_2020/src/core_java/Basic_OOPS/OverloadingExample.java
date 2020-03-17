package core_java.Basic_OOPS;

public class OverloadingExample {
    
    float perimeter;
    
    void calcualtePerimeter(int a)
    {
        perimeter=4*a;
        System.out.println("The perimeter of the square is " + perimeter);
    }
    
    void calculatePerimeter(int a, int b)
    {
        perimeter= (2*a)+(2*b);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
    
    void calculatePerimeter(int a, int b, int c)
    {
        perimeter= a+b+c;
        System.out.println("The perimeter of the triangle is " + perimeter);
        
    }
    

    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        
    	OverloadingExample p= new OverloadingExample();
        p.calcualtePerimeter(2);
        p.calculatePerimeter(2, 3);
        p.calculatePerimeter(2, 3, 4);
        
    }

}
