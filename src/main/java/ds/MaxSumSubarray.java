package ds;

public class MaxSumSubarray {
        public static int maxSubarraySum(int[] nums, int k) {
            int maxSum = 0;
            int currentSum = 0;

            // Calculate the sum of the first 'k' elements
            for (int i = 0; i < k; i++) {
                currentSum += nums[i];
            }

            maxSum = currentSum;

            // Slide the window through the array
            for (int i = k; i < nums.length; i++) {
                // Subtract the element going out of the window
                currentSum -= nums[i - k];
                // Add the element coming into the window
                currentSum += nums[i];

                // Update the maximum sum if needed
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        }

        public static void main(String[] args) {
            int[] nums = {1, -3, 2, 1, -1, 4, 2};
            int[] num ={2,1,5,1,3,2};
            int k = 3;

            int maxSum = maxSubarraySum(nums, k);
            int max= maxSubarraySum(num,k);

            System.out.println("Maximum sum of a subarray of length " + k + ": " + maxSum);
            System.out.println(max);
        }
    }

