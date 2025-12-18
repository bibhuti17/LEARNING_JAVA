import java.lang.reflect.GenericDeclaration;

public class MaxSubarraySum {
    public static int solveMaxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currSum, n = nums.length;

//brute force
//O(n3) - time complexity space = O(1)
//        for (int i = 0; i < n; i++) {
//            int start = i;
//            for (int j = i+1; j < n; j++) {
//                int end = j;
//                currSum = 0;
//                for (int k = start; k <= end ;k++) {
//                    currSum += nums[k];
//                    maxSum = Math.max(maxSum, currSum);
//                }
//            }
//        }

//prefix sum pattern
//O(n) space and O(n2) time
//        int[] prefix = new int[n];
//        prefix[0] = nums[0];
//        for (int i = 1; i < n; i++) {
//            prefix[i] = prefix[i - 1] + nums[i];
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
//                maxSum = Math.max(maxSum, currSum);
//            }
//        }

//Kadane's algo - negative sum values ko zero kardo
//Time = O(n) Space O(1)
        maxSum = nums[0];
        currSum = nums[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, -6, -1, -3};
        System.out.println(solveMaxSubarraySum(arr));
    }
}
