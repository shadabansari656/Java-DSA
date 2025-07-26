package JavaDSA.LinkedList;

public class CircularLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            newNode.next = head;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            newNode.next = head;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public int removeFirst() {
        if(head == null) {
            System.out.println("CLL is Empty");
            return -1;
        }
        if(head == tail) {
            head = tail = null;
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        tail.next = head;
        return val;
    }

    public void print() {
        Node temp = head;
        do {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        } while(temp != head);
        System.out.println("(back to head)");
    }
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.addFirst(30);
        cll.addFirst(20);
        cll.addFirst(10);
        cll.addLast(40);
        cll.addLast(50);
        cll.addLast(60);
        cll.print();

        cll.removeFirst();
        cll.print();
    }
}
