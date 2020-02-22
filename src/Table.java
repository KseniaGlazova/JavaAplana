import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Table {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int x = Integer.parseInt(a);
        System.out.println(x + " " + x * 2 + " " + x * 3 + " " + x * 4 + " " + x * 5 + " " + x * 6 + " " + x * 7
                + " " + x * 8 + " " + x * 9 + " " + x * 10);
    }
}
