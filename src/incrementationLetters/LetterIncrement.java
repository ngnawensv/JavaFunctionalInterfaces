package incrementationLetters;

public class LetterIncrement {
    public static void main(String[] args) {
        String value = "GGF";
        String nextValue = "ZZ".equals(value) ? "ZZ" : next(value);
        System.out.printf(" Next value is :%s", nextValue);
    }

    public static String next(String value) {
        System.out.println(value.charAt(0));
        System.out.println((value.charAt(0)-'A'));
        if (value.matches("^[A-Z]?[A-Z]$")) {
            final int i = 1 + (1 == value.length()
                    ? value.charAt(0) - 'A'
                    : 26 * (value.charAt(0) - 'A' + 1) + (value.charAt(1) - 'A'));

            return i < 26
                    ? "" + (char) (i + 'A')
                    : String.format("%c%c", (i / 26) - 1 + 'A', (i % 26) + 'A');
        }
        throw new UnsupportedOperationException(String.format("'%s' is invalid:, expected value between A and ZZ", value));
    }
}
