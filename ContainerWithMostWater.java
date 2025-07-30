import java.util.ArrayList;

// Using Array List 
// public class ContainerWithMostWater{
//     public static int StoreWter(ArrayList<Integer> height){
//         int maxWater = 0;

//         for (int i = 0; i < height.size(); i++) {
//             for (int j = i+1; j < height.size(); j++) {
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j-i;
//                 int currWater = ht * width;
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1); 
//         height.add(8); 
//         height.add(6); 
//         height.add(2); 
//         height.add(5); 
//         height.add(4); 
//         height.add(8); 
//         height.add(3); 
//         height.add(7); 

//         System.out.println("Container With Most Water ->");

//         System.out.print("Height : [");
//         for (int i = 0; i < height.size(); i++) {
//             System.out.print(height.get(i)+", ");
//         }
//         System.out.print("]");

//         System.out.println();
//         System.out.println("Maximum Water : "+StoreWter(height));
//     }
// }


// Using Array
class ContainerWithMostWater {
    public static int storeWtr(int arr[]) {
        int maximumWater = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int ht = Math.min(arr[i],arr[j]);
                int width = j - i;
                int currWater = ht * width;
                maximumWater = Math.max(maximumWater,currWater);
            }
        }
        return maximumWater;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(storeWtr(arr));
    }
}