package OperTacCalc.LernJava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class MergeArrays {
    public static void main(String[] args) {
        int[] a1, a2, mergeArrays;
        int i1, i2, iMA;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a1 volume: ");
        i1 = in.nextInt();
        System.out.print("Input a2 volume: ");
        i2 = in.nextInt();
        a1 = new int[i1]; a2 = new int[i2];
        iMA = i1 + i2; mergeArrays = new int[a1.length+a2.length];
        System.out.println("Input a1 array " + i1);
        for (int i = 0; i < i1; ) {
            a1[i] = in.nextInt(); i++;
        }
        System.out.println("Input a2 array " + i2);
        for (int i = 0; i < i2; ) {
            a2[i] = in.nextInt(); i++;
        }
        for (int i = 0; i < a1.length; ) {
            mergeArrays[i] = a1[i]; i++;
        }
        for (int i = 0; i < a2.length; ) {
            mergeArrays[i+ a1.length] = a2[i]; i++;
        }
        Arrays.sort(mergeArrays, 0, iMA);
        System.out.println (Arrays.toString(mergeArrays) + " a1 = " + Arrays.toString(a1) + " a2 = " + Arrays.toString(a2) );
        in.close();
    }
}
