package ds;

public class maxElement {
    public static int maxElement(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }

        public static void main(String args[]){
            int nums[]={1,2,9,5,0} ;
            System.out.println(maxElement(nums));

    }
}
