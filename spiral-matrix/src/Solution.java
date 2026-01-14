import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        // 1. Check if the matrix is empty
        if (matrix == null || matrix.length == 0) {
            return list;
        }

        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int down = matrix.length - 1;

        while (left <= right && top <= down) {
            // Move Right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            // Move Down
            for (int i = top; i <= down; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // Check if we still have rows to process
            if (top <= down) {
                // Move Left
                for (int i = right; i >= left; i--) {
                    list.add(matrix[down][i]);
                }
                down--;
            }

            // Check if we still have columns to process
            if (left <= right) {
                // Move Up
                for (int i = down; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}