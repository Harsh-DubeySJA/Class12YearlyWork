import java.util.Scanner;

public class Factorial {
    private static int factorial (int n) {
        if (n == 1)
            return n;
        return n * factorial (n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N = ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        sc.close();
    }
}