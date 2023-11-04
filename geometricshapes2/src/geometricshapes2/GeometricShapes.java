
    // This work was done by "Alhnoof"
package geometricshapes;
import java.util.Scanner;
public class GeometricShapes {

    public static void main(String[] args) {
    String category = "";
    Scanner input = new Scanner(System.in);
    do{
    try
    {  /* Here the user selects the numbers between 1 to3
        if choose 1 ==> It will go into shapes 2D
        if choose 2 ==> It will go into shapes 3D
        if choose 3 ==> You will exit the program
        */
        System.out.println("_________________WELCOME___________________");
        System.out.println("==> Please enter the Category: ");
        System.out.println("1-For 2D Shapes");
        System.out.println("2-For 3D Shapes");
        System.out.println("3-Exit");
        System.out.print("Please enter the option: ");
        category = input.nextLine();
     if(category.equalsIgnoreCase("1"))
    {
        String option="";
        do{ // here if user choose 1 It will go into shapes 2D
        System.out.println("---------------------------------------------------------");
        System.out.println("==> Please enter the shpae that you want to calculate:");
        System.out.println("1-For Circle");// chosen by "Alhnoof"
        System.out.println("2-For Square");// chosen by "Hafsa"
        System.out.println("3-For Triangle");// chosen by "Mohammed
        System.out.println("4-For Octagon");// chosen by "Hafsa"
        System.out.println("5-Exit");
        System.out.print("Please enter the option: ");
            option = input.nextLine();
            switch(option) // we use switch to choose the shapes
            {
                case "1":
                    Circle circle = new Circle();
                    break;
                case "2":
                    Square squ = new Square();
                    break;
                case "3":
                     Triangle tri = new Triangle();
                     break;
                case "4":
                     Octagon octa = new Octagon();
                     break;
                default:
                    break;
            }
        }while(!option.equalsIgnoreCase("5") );


    }else if(category.equalsIgnoreCase("2"))
    {
         String option="";
        do{
        System.out.println("---------------------------------------------------------");
        System.out.println("==> Please enter the shpae that you want to calculate:");
        System.out.println("1-For Cube"); // chosen by "Mohammed
        System.out.println("2-For Cylinder");// chosen by "Hafsa"
        System.out.println("3-For Pyramid");// chosen by "Alhnoof"
        System.out.println("4-For Cuboid");// chosen by "Hafsa"
        System.out.println("5-For Cone");// chosen by "Alhnoof"
        System.out.println("6-For Tetrahedron");// chosen by "Mohammed
        System.out.println("7-Exit");
        System.out.print("Please enter the option: ");
            option = input.nextLine();
            switch(option)// here if user choose 2 It will go into shapes 3D
            {
                case "1":
                    Cube cub = new Cube();
                    break;
                case "2":
                    Cylinder cy = new Cylinder();
                    break;
                case "3":
                     Pyramid pyrmd = new Pyramid();
                     break;
                case "4":
                    Cuboid cubo = new Cuboid();
                    break;
                case "5":
                    Cone con = new Cone();
                    break;
                case "6":
                    Tetrahedron Tetra = new Tetrahedron();
                     break;
                default:
                    break;
            }// if use input 7 or any number The same question is returned again
        }while(!option.equalsIgnoreCase("7") );
    }

    }catch(Exception e)
    {
        System.out.println("wrong option");
    }// if uere input 3 you will exit the program
    }while(!category.equalsIgnoreCase("3"));



    }

}
