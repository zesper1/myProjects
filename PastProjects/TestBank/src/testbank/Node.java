package testbank;
class Node extends Bank{
    Bank data;
    Node next;
    
    public Node(Bank data)
    {
        this.data = data;
        next = null;
    }
}
