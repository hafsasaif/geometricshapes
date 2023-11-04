
// This work was done by "Hafsa"
package geometricshapes;
import java.util.Scanner;

public class Octagon extends TwoDimensionShape {

    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength() {
        Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.print("Please enter the side Length of the Octagon: ");
                this.sideLength = input.nextDouble();
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.sideLength = -1;
            }

        }while(this.sideLength < 0);
    }

    public Octagon() {
        setSideLength();
//here we will ask the user his name
        this.ShapeName("Octagon");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
    }

    public Octagon(double value , boolean isArea) {
        this.sideLength = this.findSideLength(value, isArea);
//here we will ask the user his name
        this.ShapeName("Octagon");
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
            return Math.sqrt(value/(2 * (1 + Math.sqrt(2))));
        }else
        {
            return value/8;
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

    @Override
    public double findArea()
    {
        return (2 * (1 + Math.sqrt(2.0)) *(this.sideLength * this.sideLength));

    }

    @Override
    public double findPerimeter()
    {
        return 8.0 * this.sideLength;
    }

}