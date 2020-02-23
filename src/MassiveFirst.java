import java.util.Scanner;

public class MassiveFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int i = 0;

        for (int element : numbers){
            numbers[i] = scanner.nextInt();
            i++;
        }

        for (int x : numbers){
            x = x * 2;
            System.out.println(x);
        }

    }
}
