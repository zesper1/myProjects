
package javaapplication10;
import java.util.Scanner;
public class JavaApplication10 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Input first digit");
        int fnum = Scan.nextInt();
        System.out.println("Input second digit");
        int snum = Scan.nextInt();
        multi(fnum, snum);
    }
    static void multi(int x, int y)
    {
        int product = x * y;
        System.out.println("The product is " + product);
    }
}
