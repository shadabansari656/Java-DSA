package JavaDSA.LinkedList;

public class LinkedListPalindrome {
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
    public static int size;

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
        Node temp = head;
        int i = 0;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    } 

    // Q) Check Palindrome
    // First write a code to find mid of a linked list
    
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    // Now write A CODE TO CHECK FOR PALINDROME
    
    public boolean llPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true; // Cycle exists
            }
        }
        return false; // Cycle doesnt exists
    }


    public static void main(String[] args) {
        LinkedListPalindrome llp = new LinkedListPalindrome();
        llp.add(2);
        llp.add(1);
        llp.add(1);
        llp.add(2);
        // llp.add(1);
        llp.print();

        System.out.println(llp.llPalindrome());
    }
}