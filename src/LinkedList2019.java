class Node2019 {
    int num;
    Node2019 next;
}

public class LinkedList2019 {
    private void SumEvenNode(Node2019 str) {
        int sum = 0;
        Node2019 temp = str;
        while (temp != null) {
            if (temp.num % 2 == 0) {
                sum += temp.num;
                temp = temp.next;
            }
        }
        System.out.println("Sum of Even Numbers : " + sum);
    }

    public static void main(String[] args) {
        LinkedList2019 linkedList2019 = new LinkedList2019();
        Node2019 node2019 = new Node2019();
        node2019.num = 20;
        linkedList2019.SumEvenNode(node2019);
    }
}
