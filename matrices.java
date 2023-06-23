import java.util.Scanner;
class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get input for matrix 1
        System.out.print("Enter the number of rows in matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix 1: ");
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        // get input for matrix 2
        System.out.print("Enter the number of rows in matrix 2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix 2: ");
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        // check if matrices can be added
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices cannot be added. Number of rows and columns must match.");
            scanner.close();
            return;
        }
        // perform matrix addition
        int[][] result = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // print the result
        System.out.println("The sum of the matrices is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
