package OperTacCalc.LernJava;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int value;
        long iLong = 1;
        BigInteger result = new BigInteger("1");
        BigInteger iBigInt = new BigInteger("1");
        Scanner in = new Scanner(System.in);
        System.out.print("Input value N: ");
        value = in.nextInt();
        for (int i = 1; i < value+1; ) {
            iLong = i;
            iBigInt = BigInteger.valueOf(iLong);
            result = result.multiply(iBigInt);
            i++;
        }
        System.out.println(iLong + " Factorial = " + result );
        in.close();
    }
}
