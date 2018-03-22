import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner input = new Scanner(System.in);
        //input
        System.out.println("Input matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter matrix[" + i + "," + j + "]:");
                matrix[i][j] = input.nextInt();
            }
        }
        //display
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //max array
        int max = matrix[0][0];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++)
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
        }
        System.out.println("Largest element: " + max);
    }
}
