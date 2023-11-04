
// This work was done by "Mohammed" 
package geometricshapes;
import java.util.Scanner;

public class Cube extends ThreeDimensionShape {
    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength() {
        Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.print("Please enter the side Length of the Cube: ");
            this.sideLength = input.nextDouble();
            }catch(Exception e)
            {
                System.out.println("Wrong number");
                this.sideLength = -1;
            }
            
        }while(this.sideLength < 0);
    }
    
    
    @Override
    public double calculateSurfaceArea()
    {
        return Math.pow(this.sideLength, 2.0) * 6;
    }
    
    @Override
    public double calculateVolume()
    {
        return Math.pow(this.sideLength, 3.0);
    }
    
    public double findSideLength(double value , boolean isVolume)
    {
     //if the is volume equal true then we have the volume other wise it will be the surface
        if(isVolume)
        {
            return Math.cbrt(value);
        }else
        {
            return Math.sqrt((value/6.0));
        }
    }

    public Cube() {
        setSideLength();
        //here we will ask the user his name
        this.ShapeName("Cube");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String s = input.nextLine();
        this.UserName(s);
        summaryPrint();
    }

    public Cube(double value, boolean isVolume) {
        findSideLength(value, isVolume);
        //here we will ask the user his name
        this.ShapeName("Cube");
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
        System.out.println("Side: "+this.getSideLength());
        System.out.println("Volume: "+calculateVolume());
        System.out.println("Surface: "+calculateSurfaceArea());
    }
     
     
    
    
    
}
