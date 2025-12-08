import  java.util.ArrayList;
import java.util.Iterator;
import  java.util.List;


public class LearnArraylist {
    public static void main(String[] args) {
//        we cannot change the size of array dynamically so arraylist solves the problem
//        the size of array changes as per requirement
//        both the below declarations are correct just import correctly
        ArrayList<String> list = new ArrayList<>(); //an empty arraylilst is created
        List<String> mylist = new ArrayList<String>(); //an empty arraylilst is created
//        uses array internally - if size is n to increase size it is - n + n/2 + 1 and copies old array to new and old array goes to gc
//        adding to empty array
        list.add("Rakesh");
        list.add("ram");
        list.add("hello");
        list.add("bye");
        System.out.println(list);
//      adding a list at an index
        list.add(1,"bibhu"); //this will add new element to the specific index
        System.out.println(list);

//        adding a list to a list
        mylist.addAll(list); //add list to mylist
        System.out.println(mylist);

//      accessing element using get method
//        O(1)

        System.out.println(list.get(1));

//       removing an element
//        O(n)
        list.remove(2); //using index
        System.out.println(list);
        list.remove(String.valueOf("Ramesh")); //overloading remove method to remove a value by passing value
        System.out.println(list);

//        empty the list
//        O(n)
        mylist.clear();
        System.out.println(mylist);

//        updating the values
        list.set(1, "Vivek");
        System.out.println(list);

//        check a specific element is present or not
        System.out.println(list.contains("Vivek"));

//        Iterating the arraylilst
//        arraylist.size() - method to get size

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        for each loop
        for (String x: list) {
            System.out.println(x);
        }
//        iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
