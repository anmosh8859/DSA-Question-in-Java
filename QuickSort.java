public class QuickSort {
    private static void swap(int [] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    private static int pivot(int [] arr, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <=endIndex ; i++) {
            if(arr[i] < arr[pivotIndex]){
                swapIndex++;
                swap(arr,swapIndex,i);
            }
        }
        swap(arr, pivotIndex, swapIndex);
        return swapIndex;
    }
    private static void quickSortHelper(int [] arr, int left, int right){
        if(left<right){
            int pivotIndex = pivot(arr, left,right);
            quickSortHelper(arr,left,pivotIndex-1);
            quickSortHelper(arr,pivotIndex+1,right);
        }
    }
    protected static void quickSort(int [] arr){
        quickSortHelper(arr,0, arr.length-1);
    }
}
