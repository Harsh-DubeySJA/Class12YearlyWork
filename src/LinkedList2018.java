class Nodes {
    int n;
    Nodes link;
}

public class LinkedList2018 {
    private void FindNode(Nodes str, int b) {
        int data = str.n;
        for (int i = 0; i < b; i++) {
            if (str.link.n == data) {
                System.out.println(data + " is present at " + i);
                break;
            }
        }
    }
}
