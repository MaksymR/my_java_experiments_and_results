public class ReturtnTrueIfMethodHasTwoTrueFromFour {

    /**
     * Realize method that is returned "true" if only his two arguments are "true" from four
     */

    public static void main(String[] args) {
        System.out.println("ffff " + booleanExpression(false, false, false, false));
        System.out.println("ffft " + booleanExpression(false, false, false, true));
        System.out.println("fftf " + booleanExpression(false, false, true, false));
        System.out.println("fftt " + booleanExpression(false, false, true, true) + " <- ");

        System.out.println("ftff " + booleanExpression(false, true, false, false));
        System.out.println("ftft " + booleanExpression(false, true, false, true) + " <- ");
        System.out.println("fttf " + booleanExpression(false, true, true, false) + " <- ");
        System.out.println("fttt " + booleanExpression(false, true, true, true));

        System.out.println("tfff " + booleanExpression(true, false, false, false));
        System.out.println("tfft " + booleanExpression(true, false, false, true) + " <- ");
        System.out.println("tftf " + booleanExpression(true, false, true, false) + " <- ");
        System.out.println("tftt " + booleanExpression(true, false, true, true));

        System.out.println("ttff " + booleanExpression(true, true, false, false) + " <- ");
        System.out.println("ttft " + booleanExpression(true, true, false, true));
        System.out.println("tttf " + booleanExpression(true, true, true, false));
        System.out.println("tttt " + booleanExpression(true, true, true, true));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d)) | ((a ^ d) & (b ^ c));
    }
}
