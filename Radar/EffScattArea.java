package OperTacCalc.Radar;
import java.util.Scanner;
import static java.lang.Math.*;
public class EffScattArea {
    public static void main(String[] args) {
        double sigma, dOb, lOb, wOb, teta, lambda, rOb;
        short typeOb;
        final double c=299792458; //m/sec
        Scanner in = new Scanner(System.in);
        System.out.println("Input type of object: 1 - sphere, 2 - cylinder, 3 - plate, 4 - disc");
        typeOb = in.nextShort();
        System.out.print("Input wavelength (m): ");
        lambda = in.nextDouble();
        switch (typeOb) {
            case 1: // ввод и расчет для сферы
            { System.out.print("Input diameter of object (m): ");
                dOb = in.nextDouble(); rOb = dOb/2;
                sigma = PI*pow(rOb,2); break; }
            case 2: // ввод и расчет для и цилиндра
            { System.out.print("Input diameter of object (m): ");
                dOb = in.nextDouble(); rOb = dOb/2;
                System.out.print("Input length of object (m): ");
                lOb = in.nextDouble();
                sigma = (2*PI*rOb*pow(lOb,2))/lambda; break; }
            case 3: // ввод и расчет для пластины
            { System.out.print("Input length of object (m): ");
                lOb = in.nextDouble();
                System.out.print("Input width of object (m): ");
                wOb = in.nextDouble();
                sigma = (4*PI*pow(lOb,2)*pow(wOb,2))/pow(lambda,2); break; }
            case 4: // ввод и расчет для диска
            { System.out.print("Input diameter of object (m): ");
                dOb = in.nextDouble(); rOb = dOb/2;
                sigma = PI*pow(rOb,2); break; }
            default: { System.out.println ("Type of object not selected"); sigma = 0; }
        }
       System.out.println ("Effective scattering area of object = " + sigma + " square meters");
        in.close();
    }
}
