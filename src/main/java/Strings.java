public class Strings {

    private static final String FORMAT = "%s-%s-%s-%s";

    public static void main(final String[] args) {
        for (int i = 1; i < 1e8; i *= 10) {
            long elapsed = -System.currentTimeMillis();

            for (int j = 0; j < i; j++) {
                testStringFormat("a", "b", "c", "d");
            }

            System.out.println("String format " + i + " times took "
                    + (elapsed + System.currentTimeMillis()) + "ms");

            elapsed = -System.currentTimeMillis();

            for (int j = 0; j < i; j++) {
                testStringConcatenation("a", "b", "c", "d");
            }

            System.out.println("String concatenation " + i + " times took "
                    + (elapsed + System.currentTimeMillis()) + "ms");
        }
    }

    private static String testStringFormat(final String ... pieces) {
        return String.format(FORMAT, pieces);
    }

    private static String testStringConcatenation(final String ... pieces) {
        return pieces[0] + "-" + pieces[1] + "-" + pieces[2] + "-" + pieces[3];
    }

}
