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
        float[] twoo = {1.57f, 7.654f, 9.986f};
        long[] astro = {299_792_458, 149_597_870l, 308_567_757l};
        //задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i != one.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < twoo.length; i++) {
            System.out.print(twoo[i]);
            if (i != twoo.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < astro.length; i++) {
            System.out.print(astro[i]);
            if (i != astro.length - 1) {
                System.out.print(",");
            }
        }
        //задача 3
        System.out.println("\nЗадача 3");
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = twoo.length - 1; i >= 0; i--) {
            System.out.print(twoo[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = astro.length - 1; i >= 0; i--) {
            System.out.print(astro[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        // Задача 4
        System.out.println("\nзадача 4");
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i]++;
            }
            System.out.print(one[i] + " ");
        }
    }

}



