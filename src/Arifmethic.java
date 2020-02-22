import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arifmethic {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String count1 = reader.readLine();
        String count2 = reader.readLine();
        String count3 = reader.readLine();
        int a = Integer.parseInt(count1);
        int b = Integer.parseInt(count2);
        int c = Integer.parseInt(count3);

        int d = (a+b+c) / 3;
        int e = d / 2;

        if (e>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
