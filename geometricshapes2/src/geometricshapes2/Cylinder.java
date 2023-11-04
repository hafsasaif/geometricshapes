
// This work was done by "Hafsa"
package geometricshapes;

import java.util.Scanner;
public class Cylinder extends ThreeDimensionShape {
    private double height;
    private double radius;

    public double getHeight() {
        return height;
    }

    public void setHeight() {
       
        Scanner input = new Scanner(System.in);
        do {
            try{
             System.out.print("Please enter the side Length of the Cylinder: ");
            this.height = input.nextDouble();   
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.height = -1;
            }
        }while(this.height < 0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.print("Please enter the side Length of the Cylinder: ");
            this.height = input.nextDouble();
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.radius = -1;
            }
            
        }while(this.radius < 0);
    }
    
    public double calculateSurfaceArea()
    {
        return (2.0 * PI * Math.pow(this.radius, 2.0) + 2.0 * PI * this.height * this.radius);
    }
    
    public double calculateVolume()
    {
        return PI * Math.pow(this.radius, 2.0) * this.height;
    }

    public Cylinder() {
        setHeight();
        setRadius();
        //here we will ask the user his name
        this.ShapeName("Cylinder");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
    }

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
        //here we will ask the user his name
        this.ShapeName("Cylinder");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
    }
    
    
     public void summaryPrint()
    {
        System.out.println("---------The_Output--------------");
        System.out.println("Name: "+ this.getuName());
        System.out.println("Shape: "+this.getsName());
        System.out.println("Selected category: 3D");
        System.out.println("Height: "+this.getHeight());
        System.out.println("Radius: "+this.getRadius());
        System.out.println("Volume: "+calculateVolume());
        System.out.println("Surface: "+calculateSurfaceArea());
    }
}
