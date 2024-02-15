import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        int b = one[0];
        int c = one[1];
        int d = one[2];
        float[] twoo = {1.57f, 7.654f, 9.986f};
        float e = twoo[0];
        float f = twoo[1];
        float g = twoo[2];
        //1 световой год.2 астрономическая еденица.3 парсек
        long[] astro = {299_792_458, 149_597_870l, 308_567_757l};
        long lightYear = astro[0];
        long astronomicalUnit = astro[1];
        long parsec = astro[2];
        //задача 2
        System.out.println("Задача 2");
        System.out.println(b + "," + c + "," + d);
        System.out.println(e + "," + f + "," + g);
        System.out.printf("%,d,%,d,%,d", lightYear, astronomicalUnit, parsec);
        //Задача 3
        System.out.println("\nзадача 3");
        System.out.println(d + "," + c + "," + b);
        System.out.println(g + "," + f + "," + e);
        System.out.printf("%,d,%,d,%,d", parsec, astronomicalUnit, lightYear);
        System.out.println();
        //Задача 4
        System.out.println("задача 4");
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i]++;
            }
            System.out.print(one[i] + " ");
        }
    }
}


