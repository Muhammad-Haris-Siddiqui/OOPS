package Matrix;

public class matrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
            {2, 3, 4},
            {5, 7, 6}
        };
        int[][] B = {
            {2, 3},
            {5, 7},
            {1, 2}
        };
        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < A[0].length; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
