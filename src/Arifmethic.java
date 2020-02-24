import java.util.Scanner;

public class Arifmethic {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        double average = (x + y + z) / 3;
        System.out.println(average);
        int e = (int) average / 2;
        int fullnum = e;

        if (fullnum > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
