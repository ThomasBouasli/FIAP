package Queue;

public class IntegerQueue {
    private final int MAX_SIZE = 10;
    private int[] data = new int[MAX_SIZE];
    private int head , tail, size;


    public void init(){
        head = 0;
        tail = 0;
        size = 0;
    }


    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(size == MAX_SIZE){
            return true;
        }
        return false;
    }
    
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        data[tail] = value;
        tail = (tail + 1) % MAX_SIZE;
        size++;
        System.out.println("Size " + size);
        System.out.println("Enqueue " + value);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = data[head];
        head = (head + 1) % MAX_SIZE;
        size--;
        System.out.println("Size " + size);

        System.out.println("Dequeue value: " + value);
        return value;
    }
}
