public class LinkedList {
    public void InsertNode(Node starPtr, int n) {
        Node newNode = new Node();
        newNode.num = n;
        newNode.next = starPtr;
        starPtr = newNode;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node starPtr = new Node();
        linkedList.InsertNode(starPtr, 5);
        System.out.println(starPtr.num);
    }
}
