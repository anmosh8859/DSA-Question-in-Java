import java.util.Arrays;

public class QuickSort {

    private static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int partition(int [] arr, int start, int end){
        int pivot = end-1;
        int i = start-1;
        for (int j = start ; j < end-1; j++) {
            if(arr[j]<arr[pivot]){
                System.out.println("start:" + start + " end: " + end);
                swap(arr,++i,j);
            }
        }
        swap(arr,++i,pivot);
        return i;
    }
    private static void quickSort(int [] arr, int start , int end){
        if(start<end-1){
            int partition = partition(arr, start, end);
            System.out.println("start:" + start + " partition: " + partition + " end: " + end);
            quickSort(arr, start, partition);
            quickSort(arr,partition+1,end);
        }
    }
    public static void quickSort(int [] arr){
        quickSort(arr,0, arr.length);
    }
}
//int [] arr  = {4,-4,2,4,3};
