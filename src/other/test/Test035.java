package other.test;

import java.util.Scanner;

public class Test035 {
	public static void main(String[] args) {
        // new Application();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            // Input
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[][] A = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }
            // Solve
            int maxArea = 0;
            for (int rowNum = 1; rowNum <= N; rowNum++) {
                for (int startRow = 0; startRow <= N - rowNum; startRow++) {
                    int numColFull1 = 0;
                    for (int col = 0; col < M; col++) {
                        boolean isColFull1 = true;
                        for (int row = startRow; row < startRow + rowNum; row++) {
                            if (A[row][col] == 0) {
                                isColFull1 = false;
                                break;
                            }
                        }
                        if (isColFull1) {
                            numColFull1++;
                        }
                    }
                    maxArea = Math.max(maxArea, rowNum * numColFull1);
                }
            }
            System.out.println(maxArea);
        }
    }
}
