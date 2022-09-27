public class LetterIncrement {
    public static void main(String[] args) {
        String value = "A";
        do {
            System.out.printf("'%s' => '%s'%n", value, value = next(value));
        } while (!"[A".equals(value));
    }

    public static String next(String value) {
        if (value.matches("^[A-Z]?[A-Z]$")) {
            System.out.println(value.charAt(0)-'A');
            final int i = 1 + (1 == value.length()
                    ? value.charAt(0) - 'A'
                    : 26 * (value.charAt(0) - 'A' + 1) + (value.charAt(1) - 'A'));

            return i < 26
                    ? "" + (char) (i + 'A')
                    : String.format("%c%c", (i / 26) - 1 + 'A', (i % 26) + 'A');
        }

        throw new UnsupportedOperationException(String.format("Invalid format: '%s', expected value between A and ZZ", value));
    }
}
