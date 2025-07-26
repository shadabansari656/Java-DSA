package JavaDSA.Stack;
import java.util.*;

// public class Stack_AtBottom {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();  // remove top
//         pushAtBottom(s, data);  // recursive call
//         s.push(top);  // push back the top
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtBottom(s, 4);

//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
// }


class Stack_AtBottom {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}