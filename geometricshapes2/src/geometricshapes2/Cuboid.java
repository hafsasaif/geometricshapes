
// This work was done by "Hafsa"
package geometricshapes;
import java.util.Scanner;


public class Cuboid {
private double Length;
private double Height;
private double breath;
private String shapeName;
private String UserName;

public double getLength() {
return Length;
}

public double getBreath() {
return breath;
}

public void setBreath() {
Scanner input = new Scanner(System.in);
do {
try{
System.out.print("Please enter the Breath of the Cuboid: ");
this.breath = input.nextDouble();
}catch(Exception e)
{
System.out.println("Wrong number");
this.breath = -1;
}
  
}while(this.breath < 0);


  
  
}

public void setLength() {
Scanner input = new Scanner(System.in);
do {
try{
System.out.print("Please enter the Length of the Pyramid: ");
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
System.out.print("Please enter the height of the Pyramid: ");
this.Height = input.nextDouble();
}catch(Exception e)
{
System.out.println("Wrong number");
this.Height = -1;
}
  
}while(this.Height < 0);
}
public double calculateSurfaceArea()
{
return 2.0 * (this.Length * this.breath + this.Length * this.Height + this.breath * this.Height);
}
  
public double calculateVolume()
{
return this.Length*this.breath*this.Height;
}

public Cuboid(double Length, double Height, double breath) {
this.Length = Length;
this.Height = Height;
this.breath = breath;
//here we will ask the user his name
this.ShapeName("Cuboid");
Scanner input = new Scanner(System.in);
System.out.print("Enter the Name: ");
String s = input.nextLine();
this.UserName(s);
summaryPrint();
}

public Cuboid() {
setLength();
setHeight();
setBreath();
//here we will ask the user his name
this.ShapeName("Cuboid");
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
System.out.println("Breath: "+ this.getBreath());
System.out.println("Volume: "+calculateVolume());
System.out.println("Surface: "+calculateSurfaceArea());
}

//setter getter for the shapename and username
private void ShapeName(String shapeName) {
this.shapeName=shapeName;
}

private void UserName(String s) {
this.UserName=s;
}

private String getuName() {
return UserName;
}

private String getsName() {
return shapeName;
}

public static void main(String args[])
{
Cuboid cu=new Cuboid(2.5, 3.5, 2.5);
cu.toString();
}

}