public class test {public static void main(String[] args) {
    int[][] arr = new int[10][10];
    int row = 1, column = 1;
    for (int x = 0; x < arr.length; x++) {
        for (int y = 0; y < arr[x].length; y++) {
            arr[x][y] = row * column;
            column = column + 1;
        }
        row = row + 1;
        column = 1;
    }
    for (int x = 0; x < arr.length; x++) {
        for (int y = 0; y < arr[x].length; y++) {
            System.out.print( " "+ arr[x][y]);
        }
        System.out.println();
    }
}
}