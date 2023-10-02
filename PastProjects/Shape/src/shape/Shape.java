package shape;
public abstract class Shape {
 
   
    String name;
    
    public void displayInfo()
    {
    System.out.println("Shape: " +  name);
    }
    public abstract void getArea();
      
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}
