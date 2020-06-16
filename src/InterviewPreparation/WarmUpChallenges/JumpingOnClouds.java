package InterviewPreparation.WarmUpChallenges;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {
    private static final Scanner scanner = new Scanner(System.in);
    private static int minJumps=0;

    static int jumpingOnClouds(int[] c) {
        int i=0;
        while (i<c.length){
            if(i==c.length-1){
                break;
            }else if (i<c.length-2&&c[i+2]==0){
                i+=2;
                minJumps+=1;
                System.out.println("2 Steps: "+"Index"+i+"VALUE"+c[i]+"Jumps"+minJumps);
            }else if (c[i+1]==0){
                i+=1;
                minJumps+=1;
                System.out.println("1 Steps: "+"Index"+i+"VALUE"+c[i]+minJumps);
            }
        }
        return minJumps;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Input number of clouds: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Input binary integers for clouds: ");
        int[] c = new int[n];
        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);
        scanner.close();
    }
}
