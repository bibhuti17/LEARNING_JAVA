import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class LearnArrayDeque {
    public static void main(String[] args) {
//        double ended queue
//        note: used in sliding window sometimes
//        use this declaration always to get all functionalities of the specific data structure
        ArrayDeque<Integer> ad = new ArrayDeque<>();
//offer last mae add karta hai
        ad.offer(1);
        ad.offer(22);
        ad.offer(434);
        ad.offer(66);
        ad.offer(234);
        ad.offerFirst(3);
        ad.offerFirst(7);
        ad.offerLast(5);
        ad.offer(69);

        System.out.println(ad);

//        peek function
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

//        poll
        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());

        System.out.println(ad);
    }
}
