import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowAntiDiagonal {

    public int[] antiDiagonalPattern(int[][] matrix) {
        List<List<Integer>> li = new ArrayList<>();
        int len = matrix.length;
        int count = len * 2 - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i + j < count) li.add(new ArrayList<Integer>());
                li.get(i + j).add(matrix[i][j]);
            }
        }
        count = 0;
        int[] arr = new int[len * len];
        for (List<Integer> list : li) {
            for (Integer i : list) {
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        ShowAntiDiagonal pattern = new ShowAntiDiagonal();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = pattern.antiDiagonalPattern(matrix);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
