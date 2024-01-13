package leetcode;


//Medium 100% Efficiency
public class LeetCode74SearchA2DMatrix {
    public boolean searchMatriDx(int[][] mat, int target) {
        int row = mat.length;
        int col = mat[0].length;
        int start = 0;
        int end = row;
        int rowTar = 0;
        while(start<end){
            int mid = start + (end - start)/2;
            if(target>=mat[mid][0] && target<=mat[mid][col-1]){
                rowTar = mid;
                break;
            }
            else if(target < mat[mid][0]) end = mid;
            else start = mid + 1;
        }

        start = 0;
        end = col;
        while(start<end){
            int mid = start + (end-start)/2;  // 2
            if(mat[rowTar][mid]==target) return true;
            else if(target < mat[rowTar][mid]) end = mid;
            else start = mid + 1;
        }
        return false;
    }
}
