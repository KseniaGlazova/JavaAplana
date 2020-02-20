import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.String.*;

public class Binary {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввожу число в бинарном формате: ");
        String d = reader.readLine();
        //System.out.println();
        int a = Integer.parseInt(d, 2);
        //System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.parseInt(valueOf(a), 2));
    }
}
