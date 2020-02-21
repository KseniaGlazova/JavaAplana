import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Binary {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввожу число в бинарном формате: ");
        String binary = reader.readLine();
        System.out.println(Integer.parseInt(binary, 2));
    }
}
