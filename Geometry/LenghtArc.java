package OperTacCalc.Geometry;
import java.util.Scanner;
import static java.lang.Math.*;
public class LenghtArc {
    public static void main(String[] args) {
        double l, r, alfDeg; 
        Scanner in = new Scanner(System.in);
        System.out.print("Input r (range, km): ");
        r = in.nextDouble();
        System.out.print("Input alfDeg (angle, deg): ");
        alfDeg = in.nextDouble();
        l = r * PI * alfDeg / 180;
        System.out.println(l + " km");
        in.close();
    }
}