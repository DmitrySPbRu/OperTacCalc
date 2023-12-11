package OperTacCalc;
public class Main {
    static double lA, rRes, fDop, eSA, tDelay, dirPat, antG;
    public static void main(String[] args) {
        fDop = Radar.freqDopler(1000, 5);
        System.out.println("частота Доплера " + fDop + " MHz, кГц");
        rRes=Radar.rangeResolution(1000);
        System.out.println("range Resolution " + rRes + " km");
        lA=Geom.lenghtArc(1000.0,  10.0, 1);
        System.out.println("длина дуги " + lA + "  km or m");
        eSA = ObjObserv.effScattArea(1, 1, 90, 1, 1, 1, 30);
        System.out.println("ЭПР " + eSA + "  Sqr m");
        tDelay=Radar.rangeOfDelayTime(1000000);
        System.out.println("Time Delay " + tDelay + "   Sec");
        dirPat=Radar.directPatterns(1, 1);
        System.out.println("direct pattern " + dirPat + "   Deg");
        antG=Radar.antennaGain(1, 1, 1, 1, 1, 30, 1, 1);
        System.out.println("Ant Gain " + antG + "   DB");

    }
}
