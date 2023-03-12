package OperTacCalc.Radar;
import java.util.Scanner;
import static java.lang.Math.*;
public class FreqDopler {
    public static void main(String[] args) {
        double omega, omega0, speed;
        final double c=299792458; //m/sec
        Scanner in = new Scanner(System.in);
        System.out.print("Input frequency (MHz): ");
        omega0 = in.nextDouble();
        System.out.print("Input speed (m/s): ");
        speed = in.nextDouble();
        omega = omega0 * (1+(speed/c))/(1-(speed/c));
        System.out.println(omega + " MHz");
        in.close();
    }
}