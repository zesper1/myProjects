package testbank;
import java.util.*;
class LinkedList extends Bank{
    Node head;
    static Scanner s = new Scanner(System.in);
    public LinkedList() {
        head = null;
    }
    
    void insert(Bank data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    void insertAt(int position, Bank data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            int count = 1;
            while (count < position - 1 && current.next != null) {
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    void remove(Bank data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    /*void sort() {
        Node current = head;
        Node index = null;
        int temp;
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }*/
    
    void display() {
        Node current = head;
        while (current != null) {
            current.data.bankUserInfo();
            current = current.next;
        }
        System.out.println();
    }
}
