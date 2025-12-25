import java.util.Arrays;

public class LearningQuickSort {
    public static void main(String[] args) {
        int[] arr = {6,3,9, 5, 2,8,1,4, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end){
        if (start >= end) {
                return;
        }
//        last is pivot
        int pi = partition(arr, start, end);
        quickSort(arr, start, pi - 1); //left
        quickSort(arr, pi+1, end); //right
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        int i = start - 1;

        for (int j = start; j < end; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
