import java.util.Scanner;

public class Capital {
    private String sent;
    private int freq;

    public Capital() {
        sent = "";
        freq = 0;
    }

    private void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        sent = sc.nextLine();
        sc.close();
    }

    private boolean isCap(String w) {
        if (Character.isUpperCase(w.charAt(0))) {
            return true;
        } else {
            return false;
        }
    }

    private void display() {
        String[] words = sent.split(" ");
        for (String word : words) {
            if (isCap(word)) {
                freq++;
            }
        }
        System.out.println("Sentence : " + sent);
        System.out.println("Frequency of words beginning with Capital Letters : " + freq);
    }

    public static void main(String[] args) {
        Capital capital = new Capital();
        capital.input();
        capital.display();
    }
}
