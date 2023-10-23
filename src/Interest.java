import java.util.Scanner;

public class Interest extends Bank {
    private double rate;
    private double time;

    public Interest(double rate, double time, Bank details) {
        super(details.getName(), details.getAcc_no(), details.getPrincipal());
        this.rate = rate;
        this.time = time;
    }

    private double calculate() {
        return super.getPrincipal() * (1 + Math.pow((rate / 100.0d), time)) - super.getPrincipal();
    }

    public void display() {
        super.display();
        double interest = calculate();
        System.out.println("Compound Interest : " + interest);
        System.out.println("Total Amount : " + (super.getPrincipal() + interest));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank details = new Bank(sc.nextLine(), sc.nextInt(), sc.nextDouble());
        Interest interest = new Interest(sc.nextDouble(), sc.nextDouble(), details);
        interest.display();
        sc.close();
    }
}
