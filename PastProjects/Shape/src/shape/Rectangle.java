package shape;
import java.util.Scanner;
public class Rectangle extends Shape {
    public void getArea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your length: ");
        int len = scan.nextInt();        
        System.out.println("Input your width: ");  
        int width = scan.nextInt();
        int area = len * width;
        System.out.println("The area of the circle is: " + area);
    }
}
