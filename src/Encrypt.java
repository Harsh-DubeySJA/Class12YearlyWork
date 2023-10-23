import java.util.Scanner;

public class Encrypt {
    private String wrd;
    private int len;
    private String newwrd;

    public Encrypt() {
        wrd = "";
        len = 0;
        newwrd = "";
    }

    private void acceptword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word : ");
        wrd = sc.next().toUpperCase();
        len = wrd.length();
        sc.close();
    }

    private void freqvowcon() {
        int vowCount = 0;
        int conCount = 0;
        String vowel = "AEIOU";
        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            if (vowel.indexOf(ch) != -1) {
                vowCount++;
            } else if (Character.isLetter(ch)) {
                conCount++;
            }
        }
        System.out.println("Vowels in " + wrd + " is/are " + vowCount);
        System.out.println("Consonants in " + wrd + " is/are " + conCount);
    }

    private void nextVowel() {
        String vowel = "AEIOUA"; // to replace words orderly
        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            if (vowel.indexOf(ch) != -1) {
                newwrd += vowel.charAt(vowel.indexOf(ch)+1);
            } else {
                newwrd += ch;
            }
        }
    }

    private void disp() {
        System.out.println("Original word : " +  wrd);
        System.out.println("Encrypted word : " + newwrd);
    }

    public static void main(String[] args) {
        Encrypt encrypt = new Encrypt();
        encrypt.acceptword();
        encrypt.freqvowcon();
        encrypt.nextVowel();
        encrypt.disp();
    }
}
