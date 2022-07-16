interface QueueInterface {
    void add(int data);
    int remove();
    boolean isEmpty();
}

public class Queue implements QueueInterface {

    static class OverflowException extends RuntimeException {
        public OverflowException() {
        super("Overflow: No space left");
    }
    }

    static class UnderflowException extends RuntimeException {
        public UnderflowException() {
        super("Underflow: Queue is Empty");
    }
    }

    private final int[] data;
    private int front, rear;

    public Queue() {
        this.data = new int[10];
        front = -1;
        rear = -1;
    }

    public Queue(int size) {
        this.data = new int[size];
        front = -1;
        rear = -1;
    }

    public void add(int data) {
        try {
            if (!isEmpty()) {
                this.data[rear++] = data;
            } else {
                this.data[++front] = data;
                rear = 1;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new OverflowException();
        }
    }

    public int remove() {
        int data;
        if (!isEmpty() && front <= rear) {
            data = this.data[front++];
        } else {
            throw new UnderflowException();
        }
        return data;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) queue.add(i);
        while(!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
