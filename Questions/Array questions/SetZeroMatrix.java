// SetZeroMatrix LeetCode Problem #73
public class SetZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };

        setZeroes(matrix);

        // Print the modified matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;

        // Step 1: Mark the rows and columns
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Zero out cells based on marks
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle first column
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

