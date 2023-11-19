package OperTacCalc.LernJava;
import java.util.Scanner;
public class FlipBit {
    public static void main(String[] args) {
        int value, value1, bitIndex, mask0, maskInv, maskShift;
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        value = in.nextInt();
        System.out.print("Input bitIndex: ");
        bitIndex = in.nextInt();
        mask0=1; maskShift = mask0 << (bitIndex-1); maskInv = ~maskShift;  value1 = value & maskInv;
        if (value1 == value)   value1 = value | maskShift;
//        if (bitIndex == 0); value1 = value;
        System.out.println( "Value = " + value1 );
        in.close();
    }
}
