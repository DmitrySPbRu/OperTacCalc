package OperTacCalc;
import static java.lang.Math.*;

public class Geom {
    // расчет длины дуги от угла
    //static double l;
    public static double lenghtArc(double r, double alfDeg, int unitsOf) {
        double l;
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
           // System.out.println(l + " km or m");
            return l;
        }
    }
