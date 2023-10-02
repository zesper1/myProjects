package testingan;
import java.util.*;
public class SquaredNumbers {
    
    public static void main(String[] args) {
        int arraySize = size();
        int[] intArray = elements(arraySize);
        int[] squaredValues = square(intArray, intArray.length);
        printarray(squaredValues);
    }
     private static int size(){
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the number of elements: ");
        int size = s.nextInt();
        return size;
    }
    private static int[] elements(int size) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[size];

        System.out.println("\nEnter the elements of the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        return a;
    }
    private static int[] square(int[] array, int size) {
        int[] squaredArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        return squaredArray;
    }
    private static void printarray(int[] array) {
        System.out.println("\nThe Squared Elements of the array: ");
        for (int element : array) {
            System.out.println(element);
        }
    }
}
