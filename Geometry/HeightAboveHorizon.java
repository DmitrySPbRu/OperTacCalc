package OperTacCalc.Geometry;
import java.util.Scanner;
import static java.lang.Math.*;
// расчет высоты объекта над горизонтом
public class HeightAboveHorizon {
    public static void main(String[] args) {
        double h, r, alfDeg;
        Scanner in = new Scanner(System.in);
        System.out.print("Input r (range, km or m): ");
        r = in.nextDouble();
        System.out.print("Input angle, deg: ");
        alfDeg = in.nextDouble();
        h = r * sin(alfDeg*PI/180);
        System.out.println(h + " km or m");
        in.close();
    }
}