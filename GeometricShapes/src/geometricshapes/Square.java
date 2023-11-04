
// This work was done by "Hafsa"
package geometricshapes;

import java.util.Scanner;
public class Square extends TwoDimensionShape{
    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public Square(double value) {
        this.sideLength = findSquareSideLength(value);
        //here we will ask the user his name
        this.ShapeName("Square");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
        
    }

    public Square() {
        setSideLength();
        //here we will ask the user his name
        this.ShapeName("Square");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
    }
    
    public void setSideLength()
    {
        Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.print("Please enter the side Length of the Square: ");
            this.sideLength = input.nextDouble();
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.sideLength = -1;
            }
            
        }while(this.sideLength < 0);
        
    }
    
    @Override
    public double findArea()
    {
        return this.sideLength * this.sideLength;
    }
    
    @Override
    public double findPerimeter()
    {
        return 4 * this.sideLength;
    }
    
    public double findSquareSideLength(double value)
    {
        return value/4.0;
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
   
}
