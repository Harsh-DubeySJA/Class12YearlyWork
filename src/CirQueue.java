public class CirQueue {
    private int[] cq;
    private int cap;
    private int front;
    private int rear;

    public CirQueue(int max) {
        cap = max;
        front = 0;
        rear = 0;
        cq = new int[max];
    }

    private void push(int v)
    { if( (rear+1)% cap !=front)
    { rear = (rear + 1)% cap ;
        cq[rear] =v;
    }
    else
        System.out.println(" QUEUE IS FULL");
    }
    int pop()
    { if (front != rear)
    { front = ( front + 1)% cap ;
        return cq[front];
    }
    else
        return -9999;
    }

    private void show() {
        for (int i = front; i < cap; i++) {
            System.out.print(cq[i] + "\t");
        }
        for (int i = rear; i < front; i++) {
            System.out.println(cq[i] + "\t");
        }
    }

    public static void main(String[] args) {
        CirQueue cirQueue = new CirQueue(5);
        cirQueue.push(55);
        cirQueue.push(99);
        cirQueue.push(88);
        System.out.println(cirQueue.pop());
        cirQueue.push(88);
        cirQueue.push(74);
        cirQueue.push(44);
        cirQueue.show();
    }
}
