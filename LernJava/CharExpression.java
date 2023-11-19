package OperTacCalc.LernJava;
import java.util.Scanner;
public class CharExpression {
    public static void main(String[] args) {
        int a, numChar;
        char chExp, chExpAndA;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        a = in.nextInt();
        chExp = '\\'; numChar = (int) chExp ; numChar = numChar + a; chExpAndA = (char) numChar;
        System.out.println( "CharExp + a = " + chExpAndA );
        in.close();
    }
}
