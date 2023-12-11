package OperTacCalc;
//import java.util.Scanner;
import static java.lang.Math.*;

public class ObjObserv {
    public static double effScattArea(int typeOb, double lambda, double tetObjGrad, double dOb,
                                      double lOb, double wOb, double alfa) {
        double sigma = 0, rOb, sigmaTet = 0, tetObjRad = 0;
        final double c = 299792458; //m/sec
        //Scanner in = new Scanner(System.in);
        //System.out.println("Input type of object: 1 - plate, 2 - disc, 3 - triangular corner," +
        //     " 4 - four-sided corner, 5 - sphere, 6 - cylinder, 7 - cone, 8 - Luneberg lenses");
        //typeOb = in.nextShort();
        //System.out.print("Input wavelength (m): ");
        //lambda = in.nextDouble();
        //System.out.print("Input foreshortening (deg): ");
        //tetObjGrad = in.nextDouble();
        tetObjRad = (tetObjGrad * PI) / 180;
        switch (typeOb) {
            case 1: // ввод и расчет для пластины
            {   //System.out.print("Input length of object (m): "); lOb = in.nextDouble();
                //System.out.print("Input width of object (m): "); wOb = in.nextDouble();
                sigma = (4 * PI * pow(lOb, 2) * pow(wOb, 2)) / pow(lambda, 2);
                sigmaTet = sigma * cos(tetObjRad);
                break;
            }
            case 2: // ввод и расчет для диска
            {   //System.out.print("Input diameter of object (m): "); dOb = in.nextDouble();
                sigma = (4 * pow(PI, 3) * pow(dOb, 4)) / pow(lambda, 2);
                sigmaTet = sigma * cos(tetObjRad);
                break;
            }
            case 3: // ввод и расчет для трехгранного уголка
            {   //System.out.print("Input length of edge (m): "); Ob = in.nextDouble();
                sigma = (4 * PI * pow(lOb, 4)) / (3 * (pow(lambda, 2)));
                break;
            }
            case 4: // ввод и расчет для четырехгранного уголка
            {   //System.out.print("Input length of edge (m): "); lOb = in.nextDouble();
                sigma = (12 * PI * pow(lOb, 4)) / pow(lambda, 2);
                sigmaTet = sigma * cos(tetObjRad);
                break;
            }
            case 5: // ввод и расчет для сферы
            {   //System.out.print("Input diameter of object (m): "); dOb = in.nextDouble();
                rOb = dOb/2;
                sigma = PI * pow(rOb, 2);
                break;
            }
            case 6: // ввод и расчет для цилиндра
            {   //System.out.print("Input diameter of object (m): "); dOb = in.nextDouble();
                rOb = dOb / 2;
                //System.out.print("Input length of object (m): "); lOb = in.nextDouble();
                sigma = (2 * PI * rOb * pow(lOb, 2)) / lambda;
                sigmaTet = sigma * cos(tetObjRad);
                break;
            }
            case 7: // ввод и расчет для конуса
            {   //System.out.print("Input diameter of object (m): "); dOb = in.nextDouble();
                rOb = dOb / 2;
                //System.out.print("Input length of object (m): "); lOb = in.nextDouble();
                if (lOb == 0) { //System.out.print("Input angle of cone (deg): "); alfa = in.nextDouble();
                } else alfa = 2 * atan(rOb / lOb);
                sigma = (PI * pow(rOb, 2)) * pow(tan(alfa), 2);
                sigmaTet = sigma * cos(tetObjRad);
                break;
            }
            case 8: // ввод и расчет для линзы Люнеберга
            {   //System.out.print("Input diameter of object (m): "); dOb = in.nextDouble();
                rOb = dOb / 2;
                sigma = (4 * pow(PI, 3) * pow(rOb, 4)) / pow(lambda, 2);
                break;
            }
            default: {
                System.out.println("Type of object not selected");
            }
        }
        System.out.println("Effective scattering area of object = " + sigma + " square meters");
        // System.out.println ("ESA of object with foreshortening = " + sigmaTet + " square meters");
        return sigmaTet;
    }
}

