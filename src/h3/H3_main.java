package h3;

import java.util.Arrays;

public class H3_main {
    public static void main(String[] args) {
        // Beispieltests
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};
        int[] f = {1, 1, 2};

        System.out.println(compareArraysVal(a, b)); // false
        System.out.println(compareArraysVal(a, c)); // true
        System.out.println(compareArraysVal(a, e)); // true
        System.out.println(compareArraysVal(c, e)); // true
        System.out.println(compareArraysVal(a, d)); // false
        System.out.println(compareArraysVal(a, f)); // false
    }

    public static boolean compareArraysVal(int[] a, int[] b) {
        // Falls die Längen unterschiedlich sind, können die Arrays nicht gleich sein
        if (a.length != b.length) {
            return false;
        }

        // Kopien der Arrays erstellen, damit die Originale nicht verändert werden
        int[] copyA = Arrays.copyOf(a, a.length);
        int[] copyB = Arrays.copyOf(b, b.length);

        // Beide Arrays sortieren
        Arrays.sort(copyA);
        Arrays.sort(copyB);

        // Vergleichen, ob die sortierten Arrays identisch sind
        return Arrays.equals(copyA, copyB);
    }
}
