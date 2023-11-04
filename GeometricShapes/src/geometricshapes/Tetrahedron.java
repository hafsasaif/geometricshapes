
// This work was done by "Mohammed" 

package geometricshapes;
import java.util.Scanner;
public class Tetrahedron extends ThreeDimensionShape {
        private double side;

        public double getSide() {
                return side;
        }

        public void setSide() {
                Scanner input = new Scanner(System.in);
                do {
                        try {
                                System.out.print("Please enter the side of the Tetrahedron: ");
                                this.side = input.nextDouble();
                        } catch (Exception e) {
                                System.out.println("Wrong number");
                                this.side = -1;
                        }

                } while (this.side < 0);
        }

        public double calculateSurfaceArea() {
                return Math.sqrt(3) * Math.pow(side, 2);
        }

        public double calculateVolume() {
                return Math.pow(side, 3) / (6 * Math.sqrt(2));
        }

        public Tetrahedron(double Length, double Height, double side) {
                this.side = side;
//here we will ask the user his name
                this.ShapeName("Tetrahedron");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the Name: ");
                String s = input.nextLine();
                this.UserName(s);
                summaryPrint();
        }

        public Tetrahedron() {
                setSide();
                this.ShapeName("Tetrahedron");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the Name: ");
                String s = input.nextLine();
                this.UserName(s);
                summaryPrint();

        }

        public void summaryPrint() {
                System.out.println("---------The_Output--------------");
                System.out.println("Name: " + this.getuName());
                System.out.println("Shape: " + this.getsName());
                System.out.println("Selected category: 3D");
                System.out.println("Side: " + this.getSide());
                System.out.println("Volume: " + calculateVolume());
                System.out.println("Surface: " + calculateSurfaceArea());
        }
}

