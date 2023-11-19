package OperTacCalc.LernJava;
import java.util.Arrays;
import java.util.Scanner;
public class PrintTextPerRole {
    public static void main(String[] args) {
        String[] roles = new String[11], textLines = new String[50000], printTextPerRole = new String[51000]        ;
        String nameOfRole = new String(), printTPR = new String();
        String[][] roleWithTxt = new String[11][51000];
        int maxNR, maxNTL, currNR, currNTL, numRole = 1, numRepl, posDP;
        int [] aNumRepl = new int[50000];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите роли: ");
        System.out.println("После ввода имени каждой роли нажмите enter, пробел + enter - окончание ввода ролей");
        currNR = 1; maxNR = 10; numRepl=0;
        do {roles [currNR] = in.nextLine() ;
            printTextPerRole[currNR]=roles[currNR]+ ":" + '\n';
            currNR++; maxNR = roles.length;
            }
        while (!roles[currNR-1].contentEquals(" ") && currNR<=maxNR);
        maxNR = currNR-1; currNR = 1;
        System.out.println("Введите текст пьесы по ролям в формате:" + '\n');
        System.out.println("Имя роли: текст роли");
        System.out.println("После ввода текста каждой роли нажмите enter, " +
                "два пробела + enter - окончание ввода текста пьесы");
        currNTL = 1; maxNTL = 50000; numRepl = 1;
        do {textLines [currNTL] = in.nextLine(); currNTL++; if (textLines[currNTL-1].contentEquals("  ")) break;
            /** find name of role in string **/
            posDP = textLines[currNTL-1].indexOf(":"); nameOfRole = textLines[currNTL-1].substring(0, posDP);
                while (!roles[currNR].contentEquals(nameOfRole))  currNR++;
            printTextPerRole[currNR] += currNTL - 1 + ") " + textLines[currNTL - 1].substring(posDP + 2) +'\n';
                    System.out.println(printTextPerRole[currNR]);
            currNR=1;
           }
            while (!textLines[currNTL-1].contentEquals("  ") && currNTL<maxNTL);
            maxNTL = currNTL;
        for (currNR = 1; currNR < maxNR; ) {
            System.out.println(printTextPerRole[currNR]);
            currNR++;
        }
        in.close();
    }
}
