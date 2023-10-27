package OperTacCalc.Radar;
import java.util.Scanner;
import static java.lang.Math.*;
// расчет коэффициента усиления антенны
public class AntennaGain {
    public static void main(String[] args) {
        double lAnt, hAnt, kGain, lambda, dAnt, wAnt, etaAnt, sAnt, nuAnt,
                tetObjGrad, tetObjRad, cosTetObj, kGainDB;
        short typeAnt, typeHorn, typePhArrAnt;
        final double c=299792458; //m/sec
        Scanner in = new Scanner(System.in);
        System.out.println("Input type of antenna: 1 - phased array antenna, 2 - mirror antenna, 3 - horn ");
        typeAnt = in.nextShort();
        System.out.print("Input wavelength (m): ");
        lambda = in.nextDouble(); tetObjRad = 1; cosTetObj = cos(tetObjRad);
        switch (typeAnt) {
            case 1: // ввод и расчет для ФАР
            {   System.out.print("Введите ширину антенны (m): ");
                wAnt = in.nextDouble();
                System.out.print("Введите высоту антенны (m): ");
                hAnt = in.nextDouble();
                System.out.print("Введите направление на ОН (град): ");
                tetObjGrad = in.nextDouble(); tetObjRad = (tetObjGrad * PI) / 180;
                System.out.print("Введите КИП антенны (ню, ) : ");
                nuAnt = in.nextDouble();
                System.out.print("Введите КПД антенны (эта): ");
                etaAnt = in.nextDouble();
                dAnt = ((4 * PI * wAnt * hAnt) / pow(lambda,2)) * cos(tetObjRad) * nuAnt;
                break;}
            case 2: // ввод и расчет для зеркальной
            {   System.out.print("Введите диаметр антенны (m): ");
                lAnt = in.nextDouble();
                System.out.print("Введите КПД антенны (эта, 0.9) : ");
                etaAnt = in.nextDouble();
                System.out.print("Введите КИП антенны (ню, 0.45-0.75) : ");
                nuAnt = in.nextDouble();
                sAnt = nuAnt * (PI * pow(lAnt,2)) / 4;
                dAnt = 4 * PI * sAnt / pow(lambda,2) ;
                break;}
            case 3: // ввод и расчет для рупора
            {   System.out.println("Input type of horn: 1 - sector (КИП=ню=0.64), 2 - pyramid (КИП=ню=0.49)");
                typeHorn = in.nextShort();
                System.out.print("Введите ширину антенны (m): ");
                wAnt = in.nextDouble();
                System.out.print("Введите высоту антенны (m): ");
                hAnt = in.nextDouble();
                switch (typeHorn) {
                    case 1: // расчет для секторальной
                    {   dAnt = (8 * wAnt * hAnt) / pow(lambda,2) ;
                        etaAnt = 1;
                        break;              }
                    case 2: // расчет для пирамидальной
                    {   dAnt = (6.2 * wAnt * hAnt) / pow(lambda,2);
                        etaAnt = 1;
                        break;                    }
                    default: { System.out.println("Type of horn not selected");
                        dAnt = 0; etaAnt = 0;                    }
                } // end of switch typeHorn
                break;} // end of case 3 typeAnt
            default: {System.out.println("Type of antenna not selected");
                dAnt = 0; etaAnt = 0; }
        }
        kGain = dAnt * etaAnt; kGainDB = 10 * log10(kGain);
        System.out.println("Antenna gain = " + kGain + " dAnt = " + dAnt +
                " cosTetObj = " + cosTetObj + " kGainDB = " + kGainDB);
        in.close();
    }
}
