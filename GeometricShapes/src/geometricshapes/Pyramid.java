
// This work was done by "Alhnoof"
package geometricshapes;

import java.util.Scanner;
public class Pyramid extends ThreeDimensionShape {
    private double Length;
    private double Height;
    private double side;

    public double getLength() {
        return Length;
    }

    public void setLength() {
       Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.print("Please enter the  Length of the Pyramid: ");
            this.Length = input.nextDouble();
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.Length = -1;
            }
            
        }while(this.Length < 0);
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight() {
           Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.print("Please enter the  height of the Pyramid: ");
            this.Height = input.nextDouble();
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.Height = -1;
            }
            
        }while(this.Height < 0);
    }

    public double getSide() {
        return side;
    }

    public void setSide() {
           Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.print("Please enter the  side of the Pyramid: ");
            this.side = input.nextDouble();
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.side = -1;
            }
            
        }while(this.side < 0);
    }
    
    public double calculateSurfaceArea()
    {
        return  2.0 * this.Length * this.side + Math.pow(this.Length, 2.0);
    }
    
    public double calculateVolume()
    {
        return (1/3 * Math.pow(this.Length, 2.0) * this.Height);
    }

    public Pyramid(double Length, double Height, double side) {
        this.Length = Length;
        this.Height = Height;
        this.side = side;
        //here we will ask the user his name
        this.ShapeName("Pyramid");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
    }

    public Pyramid() {
        setLength();
        setHeight();
        setSide();
         //here we will ask the user his name
        this.ShapeName("Pyramid");
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
        System.out.println("Length: "+this.getLength());
        System.out.println("Side: "+ this.getSide());
        System.out.println("Volume: "+calculateVolume());
        System.out.println("Surface: "+calculateSurfaceArea());
    }
}
