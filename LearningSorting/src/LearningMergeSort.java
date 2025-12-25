import java.util.Arrays;

public class LearningMergeSort {
    public static void main(String[] args) {
        int[] arr = {6,3,9, 5, 2,8,1,4, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end){
        if (start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr, int start,int mid,int end){
        //left(0,3) = 4 right(4,6) = 3 so 6-0+1 = 7
        int[] temp = new int[end-start+1];
        int i = start, j = mid+1 , k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
//        left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
//        right
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i= start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
