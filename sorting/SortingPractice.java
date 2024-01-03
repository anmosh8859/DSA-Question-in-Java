package sorting;

public class SortingPractice {
    public void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //selection sort where max element is swapped at last
    public void selectionSort(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int maxIndex = -1;
            int maxElement = Integer.MIN_VALUE;
            for(int j = 0 ; j < arr.length - i ; j++){
                if(maxElement<arr[j]){
                    maxIndex = j;
                    maxElement = arr[j];
                }
            }
            if(maxIndex!=-1) swap(arr,maxIndex,arr.length-i - 1);
        }
    }
}
