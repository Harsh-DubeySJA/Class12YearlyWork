import java.util.Scanner;

public class Convert {
    private int n;
    private int d;
    private int m;
    private int y;

    public Convert() {
        n = 0;
        d = 0;
        m = 0;
        y = 0;
    }

    private void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day Number : ");
        n = sc.nextInt();
        System.out.print("Year : ");
        y = sc.nextInt();
        sc.close();
    }

    private void day_to_date() {
        int[] noOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // If year is a leap year
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    noOfDays[1] = 29;
                }
            } else {
                noOfDays[1] = 29;
            }
        }
        if (n > 366 && noOfDays[1] != 29) {
            return;
        } else if (noOfDays[1] == 28 && n > 365) {
            return;
        }

        while (n > 0) {
            if (n > noOfDays[m]) {
                n -= noOfDays[m];
                m++;
            } else {
                d = n;
                n = 0;
            }
        }
    }

    private void display() {
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(monthName[m] + " " + d + ", " + y);
    }

    public static void main(String[] args) {
        Convert convert = new Convert();
        convert.accept();
        convert.day_to_date();
        convert.display();
    }
}