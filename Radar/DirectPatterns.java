package OperTacCalc.Radar;
import java.util.Scanner;
// расчет ширины диаграммы направленности антенны
public class DirectPatterns {
    public static void main(String[] args) {
        double tetaAnt, lambda, dAnt;
        final double c=299792458; //m/sec
        Scanner in = new Scanner(System.in);
        System.out.print("Input wavelength (m): ");
        lambda = in.nextDouble();
        System.out.print("Input length (diameter) of antenna (m): ");
        dAnt = in.nextDouble();
        tetaAnt = lambda/dAnt;
        System.out.println(tetaAnt + " deg");
        in.close();
    }
}