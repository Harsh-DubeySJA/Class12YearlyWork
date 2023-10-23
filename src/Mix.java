import java.util.Scanner;

public class Mix {
    private String wrd;
    private int len;

    public Mix() {
        wrd = "";
        len = 0;
    }

    private void feedword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        wrd = sc.next().toUpperCase();
        len = wrd.length();
    }

    private void mix_word(Mix P, Mix Q) {
        int min = Math.min(P.len, Q.len);
        len = P.len + Q.len;
        for (int i = 0; i < min; i++) {
            wrd += P.wrd.charAt(i);
            wrd += Q.wrd.charAt(i);
        }
        if (P.len > Q.len) {
            wrd += P.wrd.substring(min);
        } else {
            wrd += Q.wrd.substring(min);
        }
    }

    private void display() {
        System.out.println("Word : " + wrd);
    }

    public static void main(String[] args) {
        Mix P = new Mix();
        Mix Q = new Mix();
        P.feedword();
        Q.feedword();
        Mix result = new Mix();
        result.mix_word(P, Q);
        System.out.println("New word");
        result.display();
    }
}
