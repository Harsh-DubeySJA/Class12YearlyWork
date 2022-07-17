import java.util.Scanner;

public class NIVENNUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int input = sc.nextInt();
        int copy = input;
        int sum = 0;
        while (copy > 0) {
            sum += copy%10;
            copy/=10;
        }
        if (input % sum == 0) {
            System.out.println(input + " is a Niven or Harshad Number");
        } else {
            System.out.println(input + " is not a Niven or Harshad Number");
        }
        sc.close();
    }
}
