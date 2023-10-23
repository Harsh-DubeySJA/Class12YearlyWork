public class Node2020 {
    int n;
    Node2020 next;
}

class T2020 {
    private void Product_Node(Node2020 str) {
        Node2020 temp = str;
        long product = 1;
        while (temp != null) {
            product *= temp.n;
            temp = temp.next;
        }
        System.out.println("Product of all the numbers : " + product);
    }
}
