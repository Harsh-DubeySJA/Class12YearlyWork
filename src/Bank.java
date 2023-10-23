public class Bank {
    private String name;
    private int acc_no;
    private double principal;

    public Bank(String name, int acc_no, double principal) {
        this.name = name;
        this.acc_no = acc_no;
        this.principal = principal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Account No. : " + acc_no);
        System.out.println("Principal : " + principal);
    }
}
