public class Strings {

    private static final String FORMAT = "%s-%s-%s-%s";

    public static void main(final String[] args) {
        for (int i = 1; i < 1e8; i *= 10) {
            System.out.println("Testing with " + i + " iterations");

            long elapsed = -System.currentTimeMillis();
            for (int j = 0; j < i; j++) {
                testStringFormat("a", "b", "c", "d");
            }
            System.out.println("String.format: "
                    + (elapsed + System.currentTimeMillis()) + "ms");

            elapsed = -System.currentTimeMillis();
            for (int j = 0; j < i; j++) {
                testStringConcatenation("a", "b", "c", "d");
            }
            System.out.println("String concatenation: "
                    + (elapsed + System.currentTimeMillis()) + "ms");

            elapsed = -System.currentTimeMillis();
            for (int j = 0; j < i; j++) {
                testStringBuilder("a", "b", "c", "d");
            }
            System.out.println("StringBuilder: "
                    + (elapsed + System.currentTimeMillis()) + "ms");

            System.out.println();
        }
    }

    private static String testStringFormat(final String ... pieces) {
        return String.format(FORMAT, pieces);
    }

    private static String testStringConcatenation(final String ... pieces) {
        return pieces[0] + "-" + pieces[1] + "-" + pieces[2] + "-" + pieces[3];
    }

    private static String testStringBuilder(final String ... pieces) {
        return new StringBuilder()
                .append(pieces[0])
                .append("-")
                .append(pieces[1])
                .append("-")
                .append(pieces[2])
                .append("-")
                .append(pieces[3])
                .toString();
    }

}
