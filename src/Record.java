import java.util.Arrays;
import java.util.Scanner;

public class Record {
    public String[] n;
    public int[] m;
    public int size;

    public Record(int cap) {
        size = cap;
        n = new String[size];
        m = new int[size];
    }

    public void readarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name and Marks");
        for (int i = 0; i < size; i++) {
            n[i] = sc.next();
            m[i] = sc.nextInt();
        }
        sc.close();
    }
    
    public void display() {
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(m));
    }
}
