package JavaDSA.Stack;
import java.util.*;

// public class reverseString {
//     public static String reverse(String str) {
//         Stack<Character> s = new Stack<>();
//         // Push char in to the stack
//         int idx = 0;
//         while(idx < str.length()) {
//             s.push(str.charAt(idx));
//             idx ++;
//         }

//         // StringBuilder result = new StringBuilder("");
//         // while(!s.isEmpty()) {
//         //     char curr = s.pop();
//         //     result.append(curr);
//         // }
//         // return result.toString();

//         // POP char from the stack
//         String result = "";
//         while(!s.isEmpty()) {
//             char curr = s.pop();
//             result = result + curr;  // Add at the end of the String
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         String result = reverse(str);
//         System.out.println(result);
//     }
// }


class reverseString {
    public static String rev(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx ++;
        }

        // StringBuilder res = new StringBuilder();
        // while(!s.isEmpty()) {
        //     char curr = s.pop();
        //     res.append(curr);
        // }
        // return res.toString();

        String res = "";
        while(!s.isEmpty()) {
            char curr = s.pop();
            res = res + curr;
        }
        return res;
    }
    public static void main(String[] args){
        String str = "abcd";
        String result = rev(str);
        System.out.println(result);
    }
}