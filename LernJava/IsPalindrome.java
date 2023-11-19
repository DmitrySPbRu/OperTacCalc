package OperTacCalc.LernJava;
import java.util.Scanner;
import java.util.StringJoiner;
public class IsPalindrome {
    public static void main(String[] args) {
        int lenTxt;
        String text, textRepl, subStr1, subStr2, subStr2r, textOut;
        boolean isPalindrome=false;
        Scanner in = new Scanner(System.in);
        System.out.print("Input string of text: ");
        text = in.next(); textOut = text; subStr1 = ""; subStr2 = ""; subStr2r = subStr2;
        textRepl = text.replaceAll("[^a-zA-Z0-9]", "");
        lenTxt = textRepl.length();
        if (lenTxt%2 == 0) {
            subStr1 = textRepl.substring(0, lenTxt/2);
            subStr2 = textRepl.substring(lenTxt/2, lenTxt);
        }
        if (lenTxt%2!=0) {
            subStr1 = textRepl.substring(0, lenTxt/2);
            subStr2 = textRepl.substring(lenTxt/2+1, lenTxt);
        }
        subStr2r = (new StringBuilder(subStr2)).reverse().toString();
        isPalindrome = subStr1.equalsIgnoreCase(subStr2r);
        textOut = subStr2r;
        System.out.println( textOut + " " + subStr1 + " " + lenTxt );
        System.out.println( "IsPalindrome = " + isPalindrome );
        in.close();
    }
}
