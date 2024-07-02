public class DStack {
    int top = 0;
    int capacity = 2;
    int stack[] = new int[capacity];


    public void push(int data) {
            if(size() == capacity){
                expand();
            }
        stack[top] = data;
        top++;

    }
    private void expand(){
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity = capacity * 2;

    }

    private void shrink(){
        if(size() <= (capacity/2)/2){
            int length = size();
            capacity = capacity/2;
            int newStack[] = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, length);

            stack = newStack;
        }
    }

    public int peek(){
        int data = stack[top-1];
        return data;
    }

    public int pop() {
        int data = 0;
        if(isEmpty()){
            System.out.println("Stack is Empty.");
        } else{
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }
    public boolean isEmpty(){
        return top<=0;
    }

    public int size(){
        return top;
    }

    public void show(){
        for(int n : stack){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
