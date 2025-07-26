package JavaDSA.LinkedList;
public class swapNodeLL {
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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

            // swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev two nodes ahead
            prev = first;
        }
        return dummy.next; // New head
    }

    public static void main(String[] args) {
        swapNodeLL sl = new swapNodeLL();
        sl.add(5);
        sl.add(4);
        sl.add(3);
        sl.add(2);
        sl.add(1);

        sl.print();

        head = sl.swap(head);
        sl.print();
    }
}

