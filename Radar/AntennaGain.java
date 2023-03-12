package OperTacCalc.Radar;
import java.util.Scanner;
import static java.lang.Math.*;
public class AntennaGain {
    public static void main(String[] args) {
        double dUp, gUp, eta, lambda, dAnt, dAntArr;
        final double c=299792458; //m/sec
        Scanner in = new Scanner(System.in);
        System.out.print("Input wavelength (m): ");
        lambda = in.nextDouble();
        System.out.print("Input length (diameter) of antenna (m): ");
        dAnt = in.nextDouble();
        System.out.print("Input antenna array pitch (m): ");
        dAntArr = in.nextDouble();
// для ФАР
        gUp = lambda/dAnt;
// для зеркальной
        gUp = lambda/dAnt;
        System.out.println(gUp + " deg");
        in.close();
    }
}
