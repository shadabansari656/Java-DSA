package JavaDSA.LinkedList;

public class DoublyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }

    public void addMiddle(int idx, int data) {
        Node newNode = new Node(data);
        if(idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return;
        }
        Node temp = head;
        size ++;
        int i = 0;
        while (i < idx -1) {
            temp = temp.next;
            i ++;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast() {
        if(head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public void reverseDLL() {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addLast(6);
        dll.addLast(7);
        dll.addLast(8);
        dll.addLast(9);
        dll.addLast(10);
        dll.print();
        // System.out.println(dll.size);

        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);

        // dll.addMiddle(4, 50);
        // dll.print();
        // System.out.println(dll.size);

        // dll.removeLast();
        // dll.print();
        // System.out.println(dll.size);

        dll.reverseDLL();
        dll.print();
    }
}