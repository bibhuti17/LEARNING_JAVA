import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
//        only unique elements
//      Creation
//        Set<Integer> set = new HashSet<Integer>(); - O(1)
//        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<Integer>(); // O(log(n))
//        uses bst unique elements and sorted
//        maintains the order

//        addition
        set.add(32);
        set.add(3);
        set.add(65);
        set.add(56);
        set.add(2);
//  not in specific order
        System.out.println(set);


        set.remove(54);
        System.out.println(set);

//        to check for an element present or not - true or false
        System.out.println(set.contains(3));

        System.out.println(set.size());
//        .clear - empty the set
        System.out.println(set.isEmpty());
    }
}
