package InterviewPreparation.WarmUpChallenges;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SockMerchant {
    private static int pair=0;
    static int sockMerchant(int n, ArrayList<Integer> ar) {
        outerloop:
        for (int item=0;item<ar.size();item++){
            for (int next=item+1;next<ar.size();next++){
                if (ar.get(item) == ar.get(next)){
                    pair=pair+1;
                    ar.remove(item);
                    ar.remove(next-1);
                    n=-2;
                    sockMerchant(n,ar);
                    break outerloop;
                }
            }
        }
        return pair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<Integer> ar = new ArrayList<>();
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar.add(arItem);
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
