package OperTacCalc.Radar;
import java.util.Scanner;
import static java.lang.Math.*;
public class AntennaGain {
    public static void main(String[] args) {
        double lAnt, hAnt, dUp, kGain, lambda, dAnt, wAnt, pitchArr, etaAnt;
        short typeAnt;
        final double c=299792458; //m/sec
        Scanner in = new Scanner(System.in);
        System.out.println("Input type of antenna: 1 - phased array antenna, 2 - mirror antenna, 3 - horn ");
        typeAnt = in.nextShort();
        System.out.print("Input wavelength (m): ");
        lambda = in.nextDouble();
        switch (typeAnt) {
            case 1: // ввод и расчет для ФАР
            {System.out.print("Введите ширину антенны (m): ");
                wAnt = in.nextDouble();
                System.out.print("Введите высоту антенны (m): ");
                hAnt = in.nextDouble();
                System.out.print("Input antenna array pitch (m): ");
                pitchArr = in.nextDouble();
                System.out.print("Введите КПД антенны (эта): ");
                etaAnt = in.nextDouble();
                dAnt = wAnt * hAnt / pitchArr;
                kGain = dAnt * etaAnt / lambda;
                break;}
            case 2: // ввод и расчет для зеркальной
            {System.out.print("Введите диаметр антенны (m): ");
                lAnt = in.nextDouble();
                System.out.print("Введите КПД антенны (эта): ");
                etaAnt = in.nextDouble();
                dAnt = lAnt * 2 * PI ;
                kGain = dAnt * etaAnt / lambda;
                break;}
            case 3: // ввод и расчет для рупора
            {System.out.print("Введите ширину антенны (m): ");
                wAnt = in.nextDouble();
                System.out.print("Введите высоту антенны (m): ");
                hAnt = in.nextDouble();
                System.out.print("Введите КПД антенны (эта): ");
                etaAnt = in.nextDouble();
                dAnt = wAnt * hAnt ;
                kGain = dAnt * etaAnt / lambda;
                break;}
            default: {System.out.println("Type of antenna not selected");
                kGain = 0; dAnt = 0; etaAnt = 0; }
        }
        kGain = dAnt * etaAnt;
        System.out.println("Antenna gain = " + kGain);
        in.close();
    }
}
