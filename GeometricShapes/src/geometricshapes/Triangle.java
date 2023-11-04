
// This work was done by "Mohammed"
package geometricshapes;
import java.util.Scanner;

public class Triangle extends TwoDimensionShape {
    
    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength() {
        Scanner input = new Scanner(System.in);
        do {
            try{
                 System.out.print("Please enter the side Length of the Triangle: ");
            this.sideLength = input.nextDouble();
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.sideLength = -1;
            }
           
        }while(this.sideLength < 0);
    }

    public Triangle() {
        setSideLength();
        //here we will ask the user his name
        this.ShapeName("Triangle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
    }

    public Triangle(double value , boolean isArea) {
        this.sideLength = this.findSideLength(value, isArea);
        //here we will ask the user his name
        this.ShapeName("Triangle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
        
    }
    
    public double findSideLength(double value , boolean isArea)
    {
        if(isArea)
        {
            return Math.sqrt(value*4/Math.sqrt(3));
        }else
        {
            return value/3;
        }
    }
    
    @Override
    public void summaryPrint()
    {
        System.out.println("---------The_Output--------------");
        System.out.println("Name: "+ this.getuName());
        System.out.println("Shape: "+this.getsName());
        System.out.println("Selected category: 2D");
        System.out.println("Side Length: "+this.getSideLength());
        System.out.println("Area: "+ findArea());
        System.out.println("Perimeter: "+findPerimeter());
    }
    
    public double findArea()
    {
        return ((Math.sqrt(3.0)/4.0) *(this.sideLength * this.sideLength));
        
    }
    
    public double findPerimeter()
    {
        return 3.0 * this.sideLength;
    }
    
}
