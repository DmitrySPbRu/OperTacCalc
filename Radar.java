package OperTacCalc;
import static java.lang.Math.*;
public class Radar {
    public static double rangeResolution(double deltaF) { //deltaF MHz
        final double c=299792458; //m/sec
        double deltaR;
        deltaR = c/(2*deltaF*1000000);
        //System.out.println(deltaR + " m");
        return deltaR;
        }
    public static double freqDopler(double omega0, double speed) {
        double omega;
        final double c=299792458; //m/sec
        omega = omega0 * (1+(speed/c))/(1-(speed/c));
        //System.out.println(omega + " MHz, кГц");
        return omega;
    }
    public static double rangeOfDelayTime(double r) {
            double t;
            final double c=299792.458; //km/sec
            //System.out.print("Input r (range, km): "); r = in.nextDouble();
            t = 2 * r / c;             //System.out.println(t + " sec");
            return t;
    }
    public static double directPatterns(double lambda, double dAnt) {
            double tetaAnt;
            final double c=299792458; //m/sec
            //System.out.print("Input wavelength (m): "); lambda = in.nextDouble();
            // System.out.print("Input length (diameter) of antenna (m): "); dAnt = in.nextDouble();
            tetaAnt = lambda/dAnt;
            //System.out.println(tetaAnt + " deg");
            return tetaAnt;
    }
    public static double antennaGain(int typeAnt, double lambda,  double wAnt,  double hAnt, double lAnt,
                                     double tetObjGrad, double etaAnt,  double nuAnt) {
            double kGain, dAnt, sAnt, tetObjRad=1, kGainDB;
            int typeHorn;
            final double c=299792458; //m/sec
            //System.out.println("Input type of antenna: 1 - phased array antenna, 2 - mirror antenna, 3 - horn ");
            //typeAnt = in.nextShort();
            //System.out.print("Input wavelength (m): "); lambda = in.nextDouble();
            switch (typeAnt) {
                case 1: // ввод и расчет для ФАР
                {   //System.out.print("Введите ширину антенны (m): "); wAnt = in.nextDouble();
                    //System.out.print("Введите высоту антенны (m): "); hAnt = in.nextDouble();
                    // System.out.print("Введите направление на ОН (град): "); tetObjGrad = in.nextDouble();
                    tetObjRad = (tetObjGrad * PI) / 180;
                    //System.out.print("Введите КИП антенны (ню, ) : "); nuAnt = in.nextDouble();
                    //System.out.print("Введите КПД антенны (эта): "); etaAnt = in.nextDouble();
                    dAnt = ((4 * PI * wAnt * hAnt) / pow(lambda,2)) * cos(tetObjRad) * nuAnt;
                    break;}
                case 2: // ввод и расчет для зеркальной
                {   //System.out.print("Введите диаметр антенны (m): "); lAnt = in.nextDouble();
                    //System.out.print("Введите КПД антенны (эта, 0.9) : "); etaAnt = in.nextDouble();
                    //System.out.print("Введите КИП антенны (ню, 0.45-0.75) : "); nuAnt = in.nextDouble();
                    sAnt = nuAnt * (PI * pow(lAnt,2)) / 4;
                    dAnt = 4 * PI * sAnt / pow(lambda,2) ;
                    break;}
                case 11: // ввод и расчет для рупора
                {   //System.out.println("Input type of horn: 1 - sector (КИП=ню=0.64), 2 - pyramid (КИП=ню=0.49)");
                    typeHorn = typeAnt-10;
                    //System.out.print("Введите ширину антенны (m): "); wAnt = in.nextDouble();
                    //System.out.print("Введите высоту антенны (m): "); hAnt = in.nextDouble();
                    switch (typeHorn) {
                        case 1: // расчет для секторальной
                        {   dAnt = (8 * wAnt * hAnt) / pow(lambda,2) ;
                            break;              }
                        case 2: // расчет для пирамидальной
                        {   dAnt = (6.2 * wAnt * hAnt) / pow(lambda,2);
                            break;                    }
                        default: { System.out.println("Type of horn not selected");
                            dAnt = 0;                     }
                    } // end of switch typeHorn
                    break;} // end of case 11 typeAnt
                default: {System.out.println("Type of antenna not selected");
                    dAnt = 0;  }
            }
            kGain = dAnt * etaAnt; kGainDB = 10 * log10(kGain);
            System.out.println("Antenna gain = " + kGain + " dAnt = " + dAnt +
                    " cosTetObj = " + cos(tetObjRad) + " kGainDB = " + kGainDB);
            return kGainDB;
    }

}


