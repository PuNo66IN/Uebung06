package h1;

public class H1_main {

	public static void main(String[] args) {
		// Beispieltests
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        int[] c = {2, 4, 6};
        int[] d = {6, 4, 9};

        System.out.println(isMirrorArray(a, b));
        System.out.println(isMirrorArray(b, a));
        System.out.println(isMirrorArray(c, d));
    }

    public static boolean isMirrorArray(int[] a, int[] b) {
        // Wenn die Arrays unterschiedlich lang sind, können sie nicht spiegelbildlich sein
        if (a.length != b.length) {
            return false;
        }

        // Vergleiche jedes Element von a mit dem gespiegelten Element von b
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[b.length - 1 - i]) {
                return false;
            }
        }

        // Wenn alle Elemente passen, sind die Arrays Spiegelbilder
        return true;

	}

}
