package JavaDSA.LinkedList;

public class BtoDLLconvertor {
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
        if(data != 0 && data != 1) {
            throw new IllegalArgumentException("Only 0 and 1 are allowed");
        }
        Node newNode = new Node(data);
        size ++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int bdc1() {
        int decimal = 0;
        Node curr = head;
        while(curr != null) {
            decimal = decimal * 2 + curr.data;
            curr = curr.next;
        }
        return decimal;
    }
    
    // public int bdc2() {
    //     int decimal = 0;
    //     int power = size - 1;
    //     Node temp = head;
    //     while(temp != null) {
    //         decimal = decimal + temp.data * (int) Math.pow(2, power);
    //         power --;
    //         temp = temp.next;
    //     }
    //     return decimal;
    // }
    public int bdc2() {
        int decimal = 0;
        int power = size - 1;
        Node temp = head;
        while(temp != null) {
            decimal = (decimal +  temp.data * (int) Math.pow(2, power));
            power --;
            temp = temp.next;
        }
        return decimal;

    }

    public void print() {
        if(head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        BtoDLLconvertor btd = new BtoDLLconvertor();
        btd.add(1);
        btd.add(0);
        btd.add(1);
        btd.add(0);

        System.out.print("Binary Number: ");
        btd.print();
        System.out.println();

        System.out.println("Decimal Number: "+btd.bdc2());

        System.out.println("Decimal Number: "+btd.bdc1());
    }
}
