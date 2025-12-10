import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
//        queue ek interface

//        add from rear and remove from front
//        creation
        Queue<String> queue = new LinkedList<>();

//        put elements
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
//add is for same function but throws exception
        System.out.println(queue);


//        remove and return the elements in front
            queue.poll();
        System.out.println(queue);

//        peek() see the next - age wale kae piche
        System.out.println(queue.peek()); //if no element return null
//        element() throws an exception
    }
}
