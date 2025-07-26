package JavaDSA.LinkedList;

// public class LinkedList {
//     public static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;

//     public void addFirst(int data) {
//         // Step 1 -> Create new Node
//         Node newNode = new Node(data);

//         // If Linked List is empty
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         // Step 2 -> newNode's next = head
//         newNode.next = head;  // linking

//         // Step 3 -> head = newNode
//         head = newNode;
//     }

//     public void addLast(int data) {
//         // Step 1 -> Create a new Node
//         Node newNode = new Node(data);

//         // If Linked List is Empty
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         // Step 2 -> tail's next = newNode
//         tail.next = newNode;

//         // Step 3 -> tail = newNode
//         tail = newNode;
//     }

//     public void addMiddle(int idx, int data) {

//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         Node temp = head;
//         int i = 0;

//         while (i < idx-1) {
//             temp = temp.next;
//             i++;
//         }

//         // i = idx-1; temp -> prev
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     public void print() {
//         if (head == null) {    // If we dont print this loop then it will return null value
//             System.out.println("Linked List is Empty");
//             return;
//         }   
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data+" -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         // ll.print();
//         ll.addFirst(2);
//         // ll.print();
//         ll.addFirst(1);
//         // ll.print();
//         ll.addLast(3);
//         // ll.print();
//         ll.addLast(4);
//         // ll.print();
//         ll.addMiddle(2, 9);
//         ll.print();
//     }
// }

// public class LinkedList {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addMiddle(int idx, int data) {
//         if (idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;
//         while (i < idx - 1) {
//             temp = temp.next;
//             i++;
//         }
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public int removeFirst() {
//         if (head == null) {
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         } else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }

//     public int removeLast() {
//         if (size == 0) {
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         } else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         Node prev = head;
//         int i = 0;
//         while (i < size - 2) {
//             prev = prev.next;
//             i++;
//         }
//         int val = prev.next.data;
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;
//     }

//     public void printList() {
//         if (head == null) {
//             System.out.println("LL is Empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public boolean traverseKey(int key) {
//         Node temp = head;
//         int idx = 0;

//         while (temp != null) {
//             if (temp.data == key) {
//                 System.out.println("Key "+ key +" found at index "+ idx);
//                 return true;
//             }
//             temp = temp.next;
//             idx++;
//         }
//         System.out.println("Key "+ key +" not found in the list");
//         return false;
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.addFirst(30);
//         ll.addFirst(20);
//         ll.addFirst(10);
//         ll.addLast(40);
//         ll.addLast(50);
//         ll.addLast(60);
//         ll.addMiddle(3, 90);

//         ll.printList();
//         // System.out.println(ll.size);

//         // ll.removeFirst();
//         // ll.printList();
//         // System.out.println(ll.size);

//         // ll.removeLast();
//         // ll.printList();
//         // System.out.println(ll.size);

//         ll.traverseKey(30);
//     }
// }

public class LinkedList {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        int i = 0;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public boolean iterativeSearch(int key) {
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Key " + key + " found at index " + idx);
                return true;
            }
            temp = temp.next;
            idx++;
        }
        System.out.println("Key " + key + " is not found in the list ");
        return false;
    }

    public int recHelper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = recHelper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx + 1;
    }
    public int recursiveSearch(int key) {
        // return recHelper(head, key);
        int result = recHelper(head, key);
        if(result != -1) {
            System.out.println("Key "+key+" found at index "+result);
        } else {
            System.out.println("Key "+key+" not found in the list");
        }
        return result;
    }

    public void deleteNthFromEnd(int n) {
        Node temp = head;
        int sz = 0;
        while(temp != null) {
            temp = temp.next;
            sz ++;
        }

        if(n == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int isToFind = sz - n;
        Node prev = head;
        while(i < isToFind) {
            prev = prev.next;
            i ++;
        }

        prev.next = prev.next.next;
        return;
    }

    // public Node findMid(Node head) {
    //     Node slow = head;
    //     Node fast = head;
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Q) Check Palindrome
    // Step 1 -> Find Mid
    // Step 2 -> Reverse 2nd half
    // STep 3 -> check left and right half
    public boolean checkPlaindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        // Step 1)
        Node midNode = findMid(head);
        // Step 2)
        Node prev = null;
        Node curr = midNode;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // Step 3)
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // public void reverseLL() {
    //     Node prev = null;
    //     Node curr = head;
    //     Node next = null;

    //     while (curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev =  curr;
    //         curr = next;
    //     }
    //     head = prev;
    // }

    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addLast(5);
        // ll.addLast(6);
        // ll.addMiddle(4, 55);
        ll.print();
        // System.out.println(size);

        // ll.removeLast();
        // ll.print();
        // System.out.println(size);

        // ll.iterativeSearch(4);
        // ll.iterativeSearch(2);

        // ll.recursiveSearch(1);
        // ll.recursiveSearch(5);
        // ll.recursiveSearch(10);
        // ll.recursiveSearch(112);
        // ll.recursiveSearch(322);
        // System.out.println(ll.recursiveSearch(10));

        // ll.deleteNthFromEnd(3);
        // ll.print();
        Node mid = ll.findMid(head);
        if (mid != null) {
            System.out.println("Middle node is "+mid.data);
        } else {
            System.out.println("LL is Empty");
        }
        
        // ll.reverseLL();
        // ll.print();
        System.out.println(ll.checkPlaindrome());
    }
}