package OperTacCalc.Geometry;
import java.util.Scanner;
import static java.lang.Math.*;
// расчет длины дуги от угла
public class LenghtArc {
    public static void main(String[] args) {
        //lenghtArc new LenghtArc();
        double l, r, alfDeg;
        short unitsOf;
        Scanner in = new Scanner(System.in);
        System.out.print("Input r (range, km or m): ");
        r = in.nextDouble();
        System.out.print("Select units of angle (1 - deg, 2 - minutes, 3 - seconds): ");
        unitsOf = in.nextShort();
        System.out.print("Input angle: ");
        alfDeg = in.nextDouble();
        switch (unitsOf) {
            case 1: // коэффициент для градусов
            { alfDeg=alfDeg*1; break; }
            case 2: // коэффициент для минут
            { alfDeg=alfDeg/60; break; }
            case 3: // коэффициент для секунд
            { alfDeg=alfDeg/3600; break; }
            default: { System.out.println ("Units of angle not selected");     }
        }
        l = r * PI * alfDeg / 180;
        System.out.println(l + " km or m");
        in.close();
    }
}