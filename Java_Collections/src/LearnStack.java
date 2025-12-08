import  java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
//        push and pop and peek
//        Creation
        Stack<String> stack = new Stack<>();
//      adding elements
        stack.push("hello");
        stack.push("world");
        stack.push("hello");
        stack.push("world");
//        displaying the stack
        System.out.println(stack);

        System.out.println(stack.peek()); //shows the top element
        System.out.println(stack.pop()); //removes the tip element and returns it
        System.out.println(stack);




    }
}
