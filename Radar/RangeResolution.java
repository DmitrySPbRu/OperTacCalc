package OperTacCalc.Radar;
import java.util.Scanner;
// расчет разрешающей способности по дальности ЛЧМ сигнала
public class RangeResolution {
    public static void main(String[] args) {
        double deltaR, deltaF;
        final double c=299792458; //m/sec
        Scanner in = new Scanner(System.in);
        System.out.print("Input delta f (MHz): ");
        deltaF = in.nextDouble();
        deltaR = c/(2*deltaF*1000000);
        System.out.println(deltaR + " m");
        in.close();
    }
}
