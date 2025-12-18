import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferredReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.print("Enter a num : ");
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
    }
}
