package JavaDSA.LinkedList;

public class SwapNode2 {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addF(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addL(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // public void addM(int idx, int data) {
    //     if(idx == 0) {
    //         addF(data);
    //         return;
    //     }
    //     Node newNode = new Node(data);
    //     Node temp = head;
    //     int i = 0;
    //     while(i < idx - 1) {
    //         temp = temp.next;
    //         i++;
    //     }
    //     newNode.next = temp.next;
    //     temp.next = newNode;
    // }
    public Node swap(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node dummy = new Node(-1);
        Node prev = dummy;
        dummy.next = head;
        while(prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }
        return dummy.next;
    }
    
    public void print() {
        if(head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SwapNode2 sp = new SwapNode2();

        sp.addF(6);
        sp.addF(5);
        sp.addF(4);
        sp.addF(3);
        sp.addF(2);
        sp.addF(1);
        sp.print();

        head = sp.swap(head);
        sp.print();
    }
}
