package FA_Question;

class UpperTriangular {
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;

        System.out.println("Upper Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}





