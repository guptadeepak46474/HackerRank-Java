import java.util.*;

public class Java2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(maxHourglass(arr));
    }
    
    private static int findSum(int[][] arr, int r, int c) {
        int sum = arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2]
                    + arr[r+1][c+1] +
                    arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
        return sum;
    }

    public static int maxHourglass(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int sum = findSum(arr, i, j);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}