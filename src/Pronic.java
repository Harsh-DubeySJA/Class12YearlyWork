import java.util.Scanner;

public class Pronic {
    private int num;

    public Pronic() {
        num = 0;
    }

    private void acceptnum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        num = sc.nextInt();
        sc.close();
    }

    private boolean ispronic(int v) {
        if ((int)Math.sqrt(v) * (((int)Math.sqrt(v)) + 1) == v) 
            return true;
        else
            return false;
    }

    private void check() {
        if (num % 2 == 0 && ispronic(num))
            System.out.println(num + " is a pronic number.");
        else
            System.out.println(num + " is not a pronic number.");
    }

    public static void main(String[] args) {
        Pronic pronic = new Pronic();
        pronic.acceptnum();
        pronic.check();
    }
}
