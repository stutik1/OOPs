//package ds;
//
// public class ContainerWithMostWater {
//     public static int maxArea(int[] height) {
//         int area = 0;
//         for (int i = 0; i < height.length; i++) {
//             for (int j = i + 1; j < height.length; j++) {
//                 area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
//             }
//         }
//         return area;
//     }
//
//     public static int usingTwoPointer(int[] height){
//         int left =0;
//         int right = height.length-1;
//     }
//        public static void main(String args[]){
//        int height[] = { 1,8,6,2,5,4,8,3,7 };
//        System.out.println(maxArea(height));
//    }
// }
