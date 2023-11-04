
// This work was done by "Hafsa"

package geometricshapes;
public abstract class TwoDimensionShape implements Shape {
    private String uName;
    private String sName;
    
    public abstract double findArea();
    public abstract double findPerimeter();
    public void UserName(String s)
    {
        uName = s;
    }
    
    public void ShapeName(String s)
    {
        sName = s;
    }

    public String getuName() {
        return uName;
    }

    public String getsName() {
        return sName;
    }
    
    
    public void summaryPrint()
    {
        System.out.println("Name: "+uName);
        System.out.println("Shape Name: "+sName);
    }
}
