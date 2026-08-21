import java.util.*;

public class Solution {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        int[][] result = new int[m][n];

        // Copy original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix.get(i).get(j);
            }
        }

        // Process each layer
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            // Top row: left -> right
            for (int j = left; j <= right; j++) {
                elements.add(matrix.get(top).get(j));
            }

            // Right column: top+1 -> bottom
            for (int i = top + 1; i <= bottom; i++) {
                elements.add(matrix.get(i).get(right));
            }

            // Bottom row: right-1 -> left
            for (int j = right - 1; j >= left; j--) {
                elements.add(matrix.get(bottom).get(j));
            }

            // Left column: bottom-1 -> top+1
            for (int i = bottom - 1; i > top; i--) {
                elements.add(matrix.get(i).get(left));
            }

            // Number of rotations
            int len = elements.size();
            int shift = r % len;

            // Put rotated elements back
            int index = shift;

            // Top row
            for (int j = left; j <= right; j++) {
                result[top][j] = elements.get(index);
                index = (index + 1) % len;
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                result[i][right] = elements.get(index);
                index = (index + 1) % len;
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                result[bottom][j] = elements.get(index);
                index = (index + 1) % len;
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                result[i][left] = elements.get(index);
                index = (index + 1) % len;
            }
        }

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }

            matrix.add(row);
        }

        matrixRotation(matrix, r);

        sc.close();
    }
}
Output:
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
