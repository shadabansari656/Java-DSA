package JavaDSA.LinkedList;

public class LLdetectCycle {
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

    // public static boolean isCycle() {
    //     Node slow = head;
    //     Node fast = head;

    //     while(fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(slow == fast) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // Detect loop or cycle
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == head) {
                return true;
            }
        }
        return false;
    }

    // Remove a loop or cycle
    public static void removeCycle() {
        // detect loop
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }

        if(cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        
        // remove cycle -> last.next = null
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
