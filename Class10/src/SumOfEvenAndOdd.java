import java.util.Scanner;

// Question 4
public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Integer");
        int number = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while (number > 0) {
            int digit = number%10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            number /= 10;
        }
        System.out.println("Sum of all Even digits " + evenSum);
        System.out.println("Sum of all Odd digits " + oddSum);
        sc.close();
    }
}
