package JavaDSA.Stack;

import java.util.Stack;

// public class ValidParenthesis {
//     public static boolean isValid(String str) {
//         Stack<Character> s = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if(ch == '(' || ch == '{' || ch == '[') {  // opening
//                 s.push(ch);
//             } else {  // closing
//                 if(s.isEmpty()) {
//                     return false;
//                 }
//                 if( (s.peek() == '(' && ch == ')')  // ()
//                     || (s.peek() == '{' && ch == '}')  // {}
//                     || (s.peek() == '[' && ch == ']')) {  // []
//                         s.pop();
//                 }else {
//                     return false;
//                 } 
//             }
//         }
//         if(s.isEmpty()) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         String str = "(({})[])"; // --> true
//         System.out.println(isValid(str));

//     }
// }


class ValidParenthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')
                || (s.peek() == '{' && ch == '}')
                || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "(({})[])";
        System.out.println(isValid(str));
    }
}