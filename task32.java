// дз 3 задание 2
public class task32 {
    public static void main(String args[]) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {2, 0, 3, 4, 0}, {3, 2, 4, 1, 2},
                {0, 1, 2, 3, 4}, {0, 4, 3, 2, 1}};
        int nozero = 0;
        for (int i = 0; i < matrix.length; i++) {
            int zerocount = 0;
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
                if (matrix[i][y] == 0) {
                    zerocount += 1;
                    }
                }
            System.out.println();
            if (zerocount == 0) {
                nozero += 1;
            }
        }
        System.out.println("Строк без нулей - " + nozero);
        int[] temp = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
    }

}
