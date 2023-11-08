package OperTacCalc.Geometry;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sin;
public class BooleanExpression {public static void main(String[] args) {
    boolean a, b, c, d, e;
    double x;
    Scanner in = new Scanner(System.in);
    System.out.print("Input a: ");
    a = in.nextBoolean();
    System.out.print("Input b: ");
    b = in.nextBoolean();
    System.out.print("Input c: ");
    c = in.nextBoolean();
    System.out.print("Input d: ");
    d = in.nextBoolean();
    if (a==b & c==d) e=((a|b) ^ (c|d));
    if ((a!=b & c==d) | (a==b) & (c!=d)) e=((a^b) & (c^d));
    else e=((a|b) & (c|d));
    System.out.println(e);
    in.close();
}
}
