import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

//        count digits
        int count = 0;
        do {
            count++;
            n /= 10;
        } while (n != 0);

        System.out.println(count);
    }
}