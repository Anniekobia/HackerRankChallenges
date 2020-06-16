package Random;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringPalindrome {
    public static boolean isPalindrome(String string){
        boolean ispalindrome = false;
        String reversedString = null;
        char [] myarr = string.toCharArray();
        ArrayList <Character> mylist = new ArrayList<>();
        for(int i = myarr.length-1;i>=0;i--){
            mylist.add(myarr[i]);
        }
        reversedString= mylist.stream().map(Object::toString).collect(Collectors.joining());
        if (string.equals(reversedString)){
            ispalindrome = true;
        }
        System.out.println(ispalindrome);
        return ispalindrome;
    }
    public  static void main(String[] args){
        System.out.println("Enter String to check if it is a palindrome:");

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        isPalindrome(myString);
    }
}
