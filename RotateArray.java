import java.util.Arrays;

public class RotateArray {
    public static void intermediateArray(int [] arr, int key){
        if(key>arr.length) key%= arr.length;
        int [] res = new int[arr.length];
        int j = 0;
        for (int i = key; i < arr.length; i++) {
            res[i] = arr[j];
            j++;
        }
        for (int i = 0; i < key; i++) {
            res[i] = arr[arr.length-key+i];
        }
        System.arraycopy(res,0,arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleRotate(int [] arr, int key){
        for (int i = 0 ; i < key ; i++){
            for (int j = arr.length-1 ; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseRotate(int [] arr, int key){
        if(key > arr.length) key %= arr.length;

        int i1 = arr.length - key - 1;
        for(int i = 0; i < i1 /2 ; i++){
            int temp = arr[i];
            arr[i] = arr[i1-i];
            arr[i1-i] = temp;
        }

        for(int i = 0 ; i < arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}