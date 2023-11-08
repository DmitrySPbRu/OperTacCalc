package OperTacCalc.Geometry;
import java.util.Scanner;
import java.util.StringJoiner;

public class IsPalindrome {
    public static void main(String[] args) {
        int value=1, value1, bitCount;
        String text;
        boolean isPalindrome;
        Scanner in = new Scanner(System.in);
        System.out.print("Input string of text: ");
        text = in.next();
        //StringJoiner(text);
        //String.format();
        value1 = Math.abs(value); bitCount = Integer.bitCount(value1);
        isPalindrome = (bitCount == 1);
        System.out.println( "IsPalindrome = " + isPalindrome );
        in.close();
    }
}
