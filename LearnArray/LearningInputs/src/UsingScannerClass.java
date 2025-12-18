import java.util.Scanner;
public class UsingScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.in for keyboard input
//        Scanner scanner = new Scanner("apple, banana, grapes");
////        change delimiter
//        scanner.useDelimiter(",");
//        while (scanner.hasNext()){ //hasNext() to handle end of line error
//            System.out.println(scanner.next());
//        }
//        there is a buffer problem  - takes enter key as input
//        sol and all inputs

        int id = scanner.nextInt();
        double gpa = scanner.nextDouble();
        scanner.nextLine(); //clear buffer
        String name = scanner.nextLine();
        Boolean val = scanner.nextBoolean();
        scanner.close();
        System.out.println(id);
        System.out.println(name);
        System.out.println(name);
        System.out.println(val);
    }
}
