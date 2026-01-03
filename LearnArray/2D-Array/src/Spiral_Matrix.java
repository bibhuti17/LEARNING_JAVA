//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,21},
                {5,6,7,8,22},
                {9,10,11,12,23},
                {13,14,15,16,24},
                {17,18,19,20,25}
        };
        printSpiral(matrix);
    }

    public static void printSpiral(int[][] matrix) {
            int startRow = 0, endRow = matrix.length - 1;
            int startCol = 0, endCol = matrix[0].length - 1;

            while (startRow <= endRow && startCol <= endCol) {
                //top
                for (int j = startCol; j <= endCol; j++) {
                    System.out.print(matrix[startRow][j] + " ");
                }
                //right
                for (int i = startRow+1 ; i <= endRow; i++) {
                    System.out.print(matrix[i][endCol] + " ");
                }
                //bottom
                for (int j = endCol - 1; j >= startCol; j--) {
                    //do not print same thing more than once
                    if (startRow == endRow) {
                        break;
                    }
                    System.out.print(matrix[endRow][j] + " ");
                }
                //left
                for (int i = endRow - 1; i >= startRow+1; i--) {
                    if (startCol == endCol) {
                        break;
                    }
                    System.out.print(matrix[i][startCol] + " ");
                }
                startRow++;
                startCol++;
                endRow--;
                endCol--;
            }
    }
}