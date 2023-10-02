package shape;
import java.util.Scanner;
public class Circle extends Shape {
    
    public void getArea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your radius: ");
        double rad = scan.nextDouble();
        double pi = 3.14;
        double areaC = pi * (rad * rad);
        System.out.println("The area of the circle is: " + areaC);
    }
    
}
