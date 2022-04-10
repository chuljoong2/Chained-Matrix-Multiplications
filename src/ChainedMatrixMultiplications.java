import java.util.*;

public class ChainedMatrixMultiplications {
    private static int[] d;
    private static int[][] m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        d = new int[n]; // 행의 개수
        m = new int[n][n]; // 최소 곱셈 횟수

        for(int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
        }
    }
}
