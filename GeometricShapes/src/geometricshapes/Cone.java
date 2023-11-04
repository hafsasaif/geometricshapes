
// This work was done by "Alhnoof"
package geometricshapes;
import java.util.Scanner;
public class Cone extends ThreeDimensionShape {

private double Height;
private double radius;

public double getHeight() {
return Height;
}

public void setHeight() {
Scanner input = new Scanner(System.in);
do {
try{
System.out.print("Please enter the height of the Cone: ");
this.Height = input.nextDouble();
}catch(Exception e)
{
System.out.println("Wrong number");
this.Height = -1;
}
  
}while(this.Height < 0);
}

public double getRadius() {
return radius;
}

public void setRadius() {
Scanner input = new Scanner(System.in);
do {
try{
System.out.print("Please enter the radius of the Cone: ");
this.radius = input.nextDouble();
}catch(Exception e)
{
System.out.println("Wrong number");
this.radius = -1;
}
  
}while(this.radius < 0);
}
  
public double calculateSurfaceArea()
{
  //πrl+πr^2
return (22*this.radius*this.Height)/7+ (22*Math.pow(this.Height, 2.0))/7;
}
  
public double calculateVolume()
{
  // πr2h/3
return (22 * this.radius * this.radius * this.Height)/(7 * 3);
}

public Cone(double Height, double radius) {
this.Height = Height;
this.radius = radius;
//here we will ask the user his name
this.ShapeName("Cone");
Scanner input = new Scanner(System.in);
System.out.print("Enter the Name: ");
String s = input.nextLine();
this.UserName(s);
summaryPrint();
}

public Cone() {
setHeight();
setRadius();
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
System.out.println("Side: "+ this.getRadius());
System.out.println("Volume: "+calculateVolume());
System.out.println("Surface: "+calculateSurfaceArea());
}
}
