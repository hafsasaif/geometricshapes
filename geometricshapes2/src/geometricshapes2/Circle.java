
// This work was done by "Alhnoof"
package geometricshapes;
import java.util.Scanner;
public class Circle extends TwoDimensionShape { // set a new class extaended from the main one

    private double radius; 

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        Scanner input = new Scanner(System.in);

        do
        {
            try{
                 System.out.print("Please enter the radius of the circle: ");
            this.radius = input.nextDouble();
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.radius = -1;
            }

        }while(this.radius < 0);
    }

    public double findArea()
    {
        return PI * (this.radius * this.radius);
    }

    public double findPerimeter()
    {
        return 2 * PI * this.radius;
    }

    public Circle() {
        setRadius();
        //here we will ask the user his name
        this.ShapeName("Circle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
    }

    public double findRadius(double value , boolean isArea)
    {
        if(isArea)
        {
            return Math.sqrt((value/PI));
        }else
        {
            return value / (2 * PI);
        }


    }

    public Circle(double vlaue , boolean isArea) {
       this.radius = findRadius(vlaue, isArea);
       //here we will ask the user his name
        this.ShapeName("Circle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
    }


    @Override
    public void summaryPrint()
    {   // The output if uesr Choose Circle
        System.out.println("---------The_Output--------------");
        System.out.println("Name: "+ this.getuName());
        System.out.println("Shape: "+this.getsName());
        System.out.println("Selected category: 2D");
        System.out.println("Radius: "+this.getRadius());
        System.out.println("Area: "+ findArea());
        System.out.println("Perimeter: "+findPerimeter());
    }



}
