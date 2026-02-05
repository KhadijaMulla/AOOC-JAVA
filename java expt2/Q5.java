class QueueDemo {

    int queue[] = new int[10];
    int front = 0, rear = -1;

    void insert(int value) {
        if (rear == 9) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " inserted");
        }
    }

    void delete() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " deleted");
        }
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.delete();
    }
}
