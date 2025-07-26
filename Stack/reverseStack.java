package JavaDSA.Stack;
import java.util.Stack;

import javax.swing.Popup;

// public class reverseStack {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void revStack(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }
//         int top = s.pop();
//         revStack(s);
//         pushAtBottom(s,top);
//     }
//     public static void printStack(Stack<Integer> s) {
//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println("Original Stack: ");
//         Stack<Integer> copy = new Stack<>(); 
//         copy.addAll(s); // 3, 2, 1
//         printStack(copy);

//         revStack(s);

//         System.out.println("Reversed Stack: ");
//         printStack(s); // 1, 2, 3
//     }
// }



class reverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void revStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        revStack(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        Stack<Integer> copy = new Stack<>();
        copy.addAll(s);
        System.out.println("Original Stack: ");
        printStack(copy);
        revStack(s);
        System.out.println("Reversed Stack: ");
        printStack(s);
    }
}