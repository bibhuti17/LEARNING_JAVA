import java.util.Comparator;
import java.util.LinkedList;
import  java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        creation - default min heap
//        Queue<Integer> q = new PriorityQueue<>();
        pq.add(1);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(5);
//      printing
//        min heap is implemented here
        System.out.println(pq);

//        remove and return - highest priority here smallest element
        pq.poll();
        System.out.println(pq);

//        peek will show smallest element
        System.out.println(pq.peek());
    }
}
