package testbank;
import java.util.*;
public class TestBank {
    static double bal, with, dep;
    static Bank b = new Bank();
    static ArrayList <Bank> b1 = new ArrayList<>();
    static LinkedList list = new LinkedList();
    static void UserPrompt(ArrayList<Bank> b1, LinkedList list){
        Scanner s = new Scanner(System.in);
        System.out.println("\n" + "Choose a number to perform a task." + "\n" +
                "1. Add a bank user." + "\n" +
                "2. Remove a bank user." + "\n" +
                "3. Find a bank user." + "\n" +
                "4. Insert a bank user." + "\n" +
                "5. Exit." + "\n");
        System.out.print("Enter Number: ");
        int n = s.nextInt();
        switch(n){
            case 1: System.out.println(""); add(b1, list); break;
            case 2: System.out.println(""); remove(b1, list); break;
            case 3: System.out.println(""); indexOf(b1, list); break;
            case 4: System.out.println(""); insert(b1, list); break;
            case 5: System.exit(0);
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
    static void add(ArrayList<Bank> b1, LinkedList list){
        System.out.println("Hello!! Please Comply to the following requirements." + "\n");
        Scanner s = new Scanner(System.in);
        String n,o;
        int i = 1;
        while(i != 0){
            System.out.print("Enter name: ");
            n=s.nextLine();
            System.out.print("Enter account number:");
            o=s.nextLine();
            System.out.print("Deposit any amount:");
            dep=s.nextDouble();
            System.out.println("");
            System.out.println("Do you want to add another account?");
            s.nextLine();
            String d=s.nextLine();
            Bank b2 = new Bank(b.uiOwnerName(n), b.uiAccountNumber(o), b.uiBalance(dep));
            b1.add(b2);
            list.insert(b2);
            if(d.equalsIgnoreCase("yes")){}else{
            i--;
            }
        }
        for(int j=0;j< b1.size();j++){
        b1.get(j).bankUserInfo();
        System.out.println("\n");
        }
        list.display();
        System.out.println("Returning to main menu..."+"\n");
        UserPrompt(b1, list);
    }
    static void remove(ArrayList<Bank> b1, LinkedList list){
        System.out.println("Hello world!");
    }
    static void indexOf(ArrayList<Bank> b1, LinkedList list){
        System.out.println("Hello world!");
    }
    static void insert(ArrayList<Bank> b1, LinkedList list){
        System.out.println("Hello world!");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String acc,own;
//        System.out.println("Enter account name: ");
//        acc = s.nextLine();
//        b.setAccountNumber(acc);
//        System.out.println("Enter owner name: ");
//        own = s.nextLine();
//        System.out.println("");
//        b.setOwnerName(own);
//        if(bal == 0 ){
//            System.out.println("Deposit money first" + "\n" +
//                    "Input Deposit Amount: ");
//            dep = s.nextDouble();
//            bal+=dep;
//            b.setBalance(bal);
//        }
//        b.bankUserInfo();
//        System.out.println("Annual Interest: ");
//        System.out.println(b.calculateInterest());
//        int yr = 5;
//        System.out.println("Interest after " + yr + "years");
//        System.out.println(b.calculateInterest(yr));
        UserPrompt(b1, list);
    }
}
