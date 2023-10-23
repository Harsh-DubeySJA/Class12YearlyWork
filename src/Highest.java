public class Highest extends Record {
    private int ind;

    public Highest(int cap) {
        super(cap);
        ind = 0; // check this in Section C
    }

    private void find() {
        int max = super.m[0];
        ind = 0;
        for (int i = 1; i < size; i++) {
            if (super.m[i] > max) {
                max = super.m[i];
                ind = i;
            }
        }
    }

    public void display() {
        super.display();
        System.out.println("Student who obtained the highest marks :");
        System.out.println("Name : " + super.n[ind]);
        System.out.println("Marks : " + super.m[ind]);
    }

    public static void main(String[] args) {
        Highest highest = new Highest(5);
        highest.readarray();
        highest.find();
        highest.display();
    }
}
