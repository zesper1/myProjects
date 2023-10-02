package stacks;
import java.util.*;
import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack st = new Stack();
        //initialization of size
        System.out.print("Initialize a stack: ");
        int num = scan.nextInt();
        System.out.println("Input some Elements on the Stack: ");
        //input elements
        for(int i = 0; i < num; i++){
            int index = scan.nextInt();
            st.push(index);
        }
        //print elements
        System.out.print("Stack Elements: ");
        for(Object index : st){
            System.out.print(index + " ");
        }
        System.out.println("");
        //sorting
        Collections.sort(st);
        System.out.println("Maximum Value in stack: \n" + st.peek());
        System.out.println("Minimum Value in stack: \n" + st.get(0));
        
        System.out.println(" ");
    }
}
