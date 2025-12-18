import java.util.PriorityQueue;

public class LargestElement {
    public static void main(String[] args) {
        int[] test = {2, 43, 1, 6, 16, 4, 3, 1, 15};
        System.out.println(largestElement(test));
        System.out.println(secondLargestElement(test));
        System.out.println(thirdLargestElement(test));
        System.out.println(KthlargestElement(test, 4));
    }
    private static int largestElement(int[] arr) {
//        linear time
        int max = arr[0];
        for (int i =1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return  max;
    }

    private static int secondLargestElement(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int first = nums[0];
        int second = nums[0];

        for (int num: nums) {

            if (num > first) {
                second = first;
                first = num;
            } else if (num != first && num > second) {
                second = num;
            }
        }
        return first == second ? -1 : second;
    }

    private static Integer thirdLargestElement(int[] nums) {
        if (nums.length < 3) {
            throw new IllegalArgumentException("At least 3 elements.");
        }
        Integer first = null, second = null, third = null;

        for (int num: nums) {
            if ( first == null || num > first){
                third = second;
                second = first;
                first = num;
            } else if ( num != first && (second == null || num > second)) {
                third = second;
                second = num;
            } else if ( num != first && num != second  && (third == null || num > third)) {
                third = num;
            }
        }
        if (third == null) {
            throw new IllegalArgumentException("At least 3 elements.");
        }
        return third;
    }

    public static int KthlargestElement(int[] nums, int k) throws NullPointerException {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for (int num : nums) {
            min_heap.offer(num);
            if (min_heap.size() > k) {
                min_heap.poll();
            }
        }
        return min_heap.peek() == null ? -1 : min_heap.peek();
    }
}
