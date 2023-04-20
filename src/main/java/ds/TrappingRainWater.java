package ds;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];

        leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        int water =0;
        for(int i=1;i<height.length-1;i++){
            water = water + Math.min(leftmax[i-1],rightmax[i+1]- height[i]);
        }
        return water;
    }
    public static void main (String args[]){
        int height[] ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
