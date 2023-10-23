import java.util.Scanner;

public class Rearrange {
    private String wrd;
    private String newwrd;

    public Rearrange() {
        wrd = "";
        newwrd = "";
    }

    private void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Word = ");
        wrd = sc.next();
        sc.close();
    }

    private void freq_vow_con() {
        String vowel = "AEIOU";
        int vowNumber = 0;
        int conNumber = 0;
        for (int i = 0; i < wrd.length(); i++) {
            if (vowel.indexOf(wrd.charAt(i)) != -1) {
                vowNumber++;
            } else {
                conNumber++;
            }
        }
        System.out.println("Frequency of vowel in sentence : " + vowNumber);
        System.out.println("Frequecny of consonant in sentence : " + conNumber);
    }

    private void arrange() {
        String vowels = "AEIOU";
        for (int i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                newwrd += ch;
            }
        }
        for (int i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if (vowels.indexOf(ch) == -1) {
                newwrd += ch;
            }
        }
    }

    private void display() {
        System.out.println("Original Word : " + wrd);
        System.out.println("New word : " + newwrd);
    }

    public static void main(String[] args) {
        Rearrange rearrange = new Rearrange();
        rearrange.readword();
        rearrange.freq_vow_con();
        rearrange.arrange();
        rearrange.display();
    }
}
