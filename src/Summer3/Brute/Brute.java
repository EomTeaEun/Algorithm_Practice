package Summer3.Brute;

import java.util.Scanner;

public class Brute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        int max = 0;
        for (int i = 0; i <= n-3; i++) {
            for (int j = 0; j <= n-3; j++) {
                int cnt=0;
                for(int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        cnt += grid[i+k][j+l];
                    }
                }
                max = Math.max(max,cnt);
                }
        }
        System.out.println(max);
    }


    }
