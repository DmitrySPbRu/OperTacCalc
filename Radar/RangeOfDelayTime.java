package OperTacCalc.Radar;
import java.util.Scanner;
import static java.lang.Math.*;
// расчет времени задержки сигнала от дальности
public class RangeOfDelayTime {
     public static void main(String[] args) {
        double t, r;
        final double c=299792.458; //km/sec
        Scanner in = new Scanner(System.in);
        System.out.print("Input r (range, km): ");
        r = in.nextDouble();
        t = 2 * r / c;
        System.out.println(t + " sec");
        in.close();
    }
}