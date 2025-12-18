public class TrappingRainwater {
    public static int solveTrappingRainwater(int[] height) {
        int n = height.length;
//        cal left max boundary array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
//        cal right max boundary array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
//        loop through
        for (int i = 0; i < n; i++) {
//        waterLevel = min (leftBound, rightBound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
//        trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static int solveTrappedRainWaterTwoPointer(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1, leftMax = 0, rightMax = 0, water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(solveTrappingRainwater(height));
        System.out.println(solveTrappedRainWaterTwoPointer(height));
    }
}
