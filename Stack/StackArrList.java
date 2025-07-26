package JavaDSA.Stack;
import java.util.ArrayList;

public class StackArrList {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push Operation
        public static void push(int data) {
            list.add(data);
        }

        // Pop Operation
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek Operation
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
