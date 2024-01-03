package sorting;

import java.util.Arrays;

public class SelectionSort {
    static void swap(int [] arr,int i, int j){
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
    static void Sort(int [] arr){
        int n =arr.length;

        for(int  i = 0 ; i < n ; i++){
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int j = 0 ; j < n-i; j++){
                if(max<arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }
            if(index!=-1) swap(arr,index,(n-i-1));
        }
    }

    public static void main(String[] args) {
// 		System.out.println("Hello World");
        int [] arr = {1,3,2,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
