import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String a = bf.readLine();
//        String b = bf.readLine();
//        LargeIntegerSum lis = new LargeIntegerSum();
//        lis.lis(a,b);

        int [] arr  = {1,2,3,4,5,6};
//        RotateArray.intermediateArray(arr,3);
//        RotateArray.bubbleRotate(arr,3);
        RotateArray.reverseRotate(arr,3);
    }
}