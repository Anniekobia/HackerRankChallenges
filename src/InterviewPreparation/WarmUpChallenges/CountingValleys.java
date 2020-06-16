package InterviewPreparation.WarmUpChallenges;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
    private static final Scanner scanner = new Scanner(System.in);
    public static boolean isValley, isMountain = false;
    public static int sealevel, valleys, mountains = 0;

    static int countingValleys(int n, String s) {
        int level = 0;
        char [] stringChars = s.toCharArray();
        for (char c: stringChars) {
            if(c=='D'){
                level -= 1;
                System.out.println("D: Level"+ level);
                valleys = NumberOfValleysAndMountains(level);
            }else if(c=='U'){
                level += 1;
                System.out.println("U: Level"+ level);
                valleys = NumberOfValleysAndMountains(level);
            }
        }
        return  valleys;
    }

    private static int NumberOfValleysAndMountains(int level) {
        if (level<sealevel){
            isValley = true;
            isMountain = false;
        }else if(level>sealevel){
            isMountain = true;
            isValley = false;
        }
        else  if(level==sealevel&& isValley){
            valleys +=1;
        }else  if(level==sealevel&& isMountain){
            mountains +=1;
        }
        System.out.println("Level: "+ level+" Valley: "+isValley+valleys+"Mountains"+isMountain+mountains);
        return valleys;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Input String:");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();
        int result = countingValleys(n, s);
        System.out.println(result);
        scanner.close();
    }
}
