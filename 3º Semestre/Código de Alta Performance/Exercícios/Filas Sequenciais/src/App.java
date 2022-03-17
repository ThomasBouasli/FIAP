import Queue.IntegerQueue;

public class App{

    private static IntegerQueue queue = new IntegerQueue();
    public static void main(String[] args) {
        queue.init();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();

    }
}