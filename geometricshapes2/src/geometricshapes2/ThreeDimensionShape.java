
// This work was done by "Mohammed" 
package geometricshapes;

public abstract class ThreeDimensionShape implements Shape {
    // uName , sName we make it private 
    private String uName; 
    private String sName;
    
    @Override //we used to link @Override  
     public void UserName(String s)
     {
         this.uName = s;
     }
    @Override
    public void ShapeName(String s)
    {
        this.sName = s;
    }
    @Override
     public void summaryPrint()
    {
        System.out.println("Name: "+uName);
        System.out.println("Shape Name: "+sName);
    }
     
    public abstract double calculateSurfaceArea();
    
    public abstract double calculateVolume();

    public String getuName() {
        return uName;
    }

    public String getsName() {
        return sName;
    }
    
    
}
