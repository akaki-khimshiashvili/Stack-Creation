public class Main {
    public static void main(String[] args) {
        DStack stack = new DStack();
        stack.push(13);
        stack.push(12);
        stack.push(4);
        stack.push(15);
        stack.show();
        stack.push(117);
        stack.show();
        stack.push(16);
        stack.push(111);
        stack.push(131);
        stack.push(141);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(13);
        stack.push(12);
        stack.push(4);
        stack.push(15);


        stack.push(101);
        System.out.println("Last Element in Stack: " + stack.peek());

        stack.show();
    }
}