import java.util.Scanner;

public class MassiveFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введи числа массива: ");
        for (int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }

        for (int x : numbers){
            x = x * 2;
            System.out.println(x);
        }

    }
}
