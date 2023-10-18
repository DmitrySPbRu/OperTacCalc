package OperTacCalc.Radar;
import java.util.Scanner;
import static java.lang.Math.*;
public class AntennaGain {
    public static void main(String[] args) {
        double dUp, kGain, eta, lambda, dAnt, dAntArr, rAnt;
        short typeAnt;
        final double c=299792458; //m/sec
        Scanner in = new Scanner(System.in);
        System.out.println("Input type of antenna: 1 - phased array antenna, 2 - mirror antenna, 3 -  ");
        typeAnt = in.nextShort();
        System.out.print("Input wavelength (m): ");
        lambda = in.nextDouble();
        switch (typeAnt) {
            case 1: // ввод и расчет для ФАР
            {System.out.print("Input length of antenna (m): ");
                dAnt = in.nextDouble();
                System.out.print("Input antenna array pitch (m): ");
                dAntArr = in.nextDouble();
                rAnt = dAnt / 2;
                kGain = lambda / dAnt;
                break;}
            case 2: // ввод и расчет для зеркальной
            {System.out.print("Input length of antenna (m): ");
                dAnt = in.nextDouble();
                kGain = lambda / dAnt;
                break;}
            default: {System.out.println("Type of antenna not selected");
                kGain = 0;}
        }
        System.out.println("Antenna gain = " + kGain);
        in.close();
    }
}
