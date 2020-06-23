package InterviewPreparation.Arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxSumofHourglasses {
    private static final Scanner scanner = new Scanner(System.in);
    private static int singleSum = 0;
    private static int maxSum = 0;

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        ArrayList<Integer> hourglassSum = new ArrayList<>();
        for (int first=0;first<arr.length-2;first++){
            for (int second=0;second<arr.length-2;second++){
                singleSum = arr[first][second]+arr[first][second+1]+arr[first][second+2]+arr[first+1][second+1]+arr[first+2][second]+arr[first+2][second+1]+arr[first+2][second+2];
                hourglassSum.add(singleSum);
            }
        }
        maxSum = Collections.max(hourglassSum);
        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);
        scanner.close();
    }
}

