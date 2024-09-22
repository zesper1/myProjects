package testingan;
import java.util.Scanner;
import java.util.Arrays;
public class StudentName {
    
    public static void main(String[] args) {
        String[] studentNamesArray = StudentName.strArray();
        
        StudentName.print(studentNamesArray);
        StudentName.sort(studentNamesArray);
        StudentName.find(studentNamesArray);
    }
    
    private static String [] strArray (){
        Scanner s = new Scanner(System.in);
        String [] stn = new String [5];
        System.out.println("Enter Names: ");
            for(int i = 0; i < stn.length; i++){
                stn[i] = s.nextLine();
            }
        return stn;
    }
    private static void print(String[] array) {
        System.out.println("\nPrinted Names: ");
        for(String names: array){
            System.out.println(names);
        }
    }
    private static void sort(String[] array){
        Arrays.sort(array);
        System.out.println("\nThe sorted Array: ");
        for(String names : array)
            System.out.println(names);
        
    }
    private static void find(String[] array){
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter a name: ");
        String name = s.nextLine();
        
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i].equalsIgnoreCase(name)){
                index = i;
                break;
            } 
        }
        if(index != -1){ System.out.println("The index of the name is: " + index);} 
        else { System.out.println("Name not found"); }
    }
}
