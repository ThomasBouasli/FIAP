public class Stack{
    private int top;
    private String[] stack;
    private int max;

    public Stack(int max){
        this.max = max;
        stack = new String[max];
        top = -1;
    }

    public void push(String element){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = element;
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top--];
    }

    public String peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == max - 1;
    }
}