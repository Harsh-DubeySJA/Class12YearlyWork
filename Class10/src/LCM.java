import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two positive integers to get their LCM.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm, increment, max;
        if (a > b) max = increment = a;
        else max = increment = b;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max += increment;
        }
        System.out.println("LCM of " + a + " " + b + " is " + lcm);
        sc.close();
    }
}
