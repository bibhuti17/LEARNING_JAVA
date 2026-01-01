public class Print_n_nos {
    public static void main (String[] args) {
        print_nos(5);
    }
    private static void print_nos(int N) {
        if (N < 1) return;
        print_nos(N-1);
        System.out.println(N);
    }
}
