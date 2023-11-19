package OperTacCalc.LernJava;
import java.util.Scanner;
import java.lang.Integer;
public class IsPowerOfTwo {
    public static void main(String[] args) {
        int value, value1, bitCount, mask0=1, maskInv, maskShift;
        boolean isPowerOfTwo;
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        value = in.nextInt();
        value1 = Math.abs(value); bitCount = Integer.bitCount(value1);
        isPowerOfTwo = (bitCount == 1);
        System.out.println( "IsPowerOfTwo = " + isPowerOfTwo );
        in.close();
    }
}
