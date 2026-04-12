
public class SpiralMatrix {
    public static void printSpiral(int[][] matrix) {
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // 1. Print top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // 2. Print right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // 3. Print bottom row
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // 4. Print left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15,16}
        };

        System.out.println("Spiral Order:");
        printSpiral(matrix);
    }
}
