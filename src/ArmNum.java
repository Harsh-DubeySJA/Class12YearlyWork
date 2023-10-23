import java.util.Scanner;

public class ArmNum {
    private int n;
    private int l;

    public ArmNum(int nn) {
        n = nn;
        l = 0;
        while (nn > 0) {
            nn /= 10;
            l++;
        }
    }

    private int sum_pow(int i) {
        if (i < 10) return (int)Math.pow(i, l);
        return (int)Math.pow((i % 10), l) + sum_pow(i / 10);
    }

    private void isArmstrong() {
        if (n == sum_pow(n)) {
            System.out.println(n + " is a Armstrong number.");
        } else {
            System.out.println(n + " is not a Armstrong Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArmNum armNum = new ArmNum(sc.nextInt());
        armNum.isArmstrong();
        sc.close();
    }
}
