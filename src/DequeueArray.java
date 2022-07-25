interface Dequeue {
    void addFront(int data);
    void addRear(int data);
    int removeFront();
    int removeRear();
    boolean isEmpty();
}

public class DequeueArray implements Dequeue {

    private int[] data;
    private int front, rear;

    public DequeueArray() {
        this.data = new int[10];
        front = rear = -1;
    }

    public DequeueArray(int size) {
        this.data = new int[size];
        front = rear = -1;
    }

    public void addFront(int data) {
        if (front == -1) {
            this.data[0] = data;
            rear = front = 0;
        } else if (front > 0) {
            this.data[--front] = data;
        } else
            throw new RuntimeException("Overflow");
    }

    public void addRear(int data) {
        if (rear == -1) {
            this.data[1] = data;
            rear = 1;
        } else if (rear > 0) {
            this.data[++rear] = data;
        } else
            throw new RuntimeException("Overflow");
    }

    public int removeFront() {
        int data;
        if (!isEmpty()) {
            data = this.data[++front];
        } else
            throw new RuntimeException("Underflow");
        return data;
    }

    public int removeRear() {
        int data;
        if (!isEmpty() && rear < this.data.length - 1) {
            data = this.data[-rear];
        } else
            throw new RuntimeException("Underflow");
        return data;
    }

    public boolean isEmpty() {
        return front == -1;
    }
}
