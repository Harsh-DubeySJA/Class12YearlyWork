import java.util.Scanner;

public class BaseRecursion {
    static class CannotBeConvertedException extends RuntimeException {
        public CannotBeConvertedException() {
            throw new RuntimeException("Number cannot be converted");
        }
    }
    private static char[] alphabets = new char[26];
    private static void alphabetSettling() {
        for (int i = 0; i < 26; i++) {
            alphabets[i] = (char)('A'+i);
        }
    }
    private static String baseConversion(String x, String y) {
        char largestDigiInX = getLargestDigit(x);
        char largestDigiInY = getLargestDigit(y);
        
        return null;
    }
    private static char getLargestDigit(String x) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT : ");
        System.out.print("X = ");
        String X = sc.next();
        System.out.print("Y = ");
        String Y = sc.next();
        try {
            System.out.println("New Number : " + (baseConversion(X, Y)));
        } catch (Exception e) {
            System.out.println("Number cannot be converted");
        }
        sc.close();
    }
}
