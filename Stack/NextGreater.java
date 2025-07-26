package JavaDSA.Stack;
import java.util.*;

// public class NextGreater {
//     public static void main(String[] args) {
//         int arr[] = {5,7,2,3,4};
//         System.out.print("Original Array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         Stack<Integer> s = new Stack<>();
//         int nextGreater[] = new int[arr.length];

//         for(int i = arr.length -1; i >= 0; i--) {
//             // 1. While
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }

//             // 2. If-Else
//             if (s.isEmpty()) {
//                 nextGreater[i] = -1;
//             } else {
//                 nextGreater[i] = arr[s.peek()];
//             }

//             // 3.Push in Stack
//             s.push(i);
//         }
//         System.out.println();
//         System.out.print("Next Greater: ");
//         for(int  i = 0; i<nextGreater.length; i++) {
//             System.out.print(nextGreater[i]+" ");
//         }
//     }
// }

class NextGreater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        System.out.println();
        System.out.print("Next Greater: ");
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i]+" ");
        }
    }
}