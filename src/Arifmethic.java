import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arifmethic {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String count1 = reader.readLine();
        String count2 = reader.readLine();
        String count3 = reader.readLine();
        int x = Integer.parseInt(count1);
        int y = Integer.parseInt(count2);
        int z = Integer.parseInt(count3);

        int d = (x+y+z) / 3;
        System.out.println(d);
        int e = d / 2;

        if (e>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
