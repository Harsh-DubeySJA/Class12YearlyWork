public class Diary {
    private final String[] Q;
    private final int size;
    private int start;
    private int end;

    public Diary(int max) {
        size = max;
        start = 0;
        end = 0;
        Q = new String[size];
    }

    private void pushadd(String n) {
        if (end < size) {
            Q[end++] = n;
        } else {
            System.out.println("NO SPACE");
        }
    }

    private String popadd() {
        if (start < end) {
            String address = Q[start];
            Q[start++] = null;
            return address;
        } else {
            return "?????";
        }
    }

    private void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(Q[i]);
        }
    }

    public static void main(String[] args) {
        Diary diary = new Diary(5);
        diary.pushadd("Anywhere");
        System.out.println(diary.popadd());
        diary.show();
    }
}
