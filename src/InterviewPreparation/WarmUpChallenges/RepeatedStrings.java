package InterviewPreparation.WarmUpChallenges;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedStrings {
    private static final Scanner scanner = new Scanner(System.in);
    private static long letterAs, asInString = 0;

    static long repeatedString(String s, long n) {
        char [] schar = s.toCharArray();
        long quotient = n / schar.length;
        long remainder = n % schar.length;
        for (char i: schar) {
            if (i=='a'){
                asInString += 1;
            }
        }
        letterAs = quotient*asInString;
        if (remainder>=0){
            for (int i=0;i<remainder;i++){
                if (schar[i]=='a'){
                    letterAs+=1;
                }
            }
        }
        return letterAs;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Input string: ");
        String s = scanner.nextLine();

        System.out.println("Input integer: ");
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }
}
