
public class MutliTable {
    public static void printTables(int r, int c) {
        int[][] arr = new int[r][c];

        int row = 1, column = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = row * column;
                column = column + 1;
            }
            row = row + 1;
            column = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();


        }
    }

    public static void main(String[] args) {

        int[][] data = new int[10][10];

        printTables(10, 10);

    }
}

