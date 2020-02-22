import java.util.Scanner;

public class Constanta {
    public static void main(String[] args) throws Exception {
        int x = 4;
        int y = 5;
        int z = 6;

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == x) {
            System.out.println("Данное значение есть в константах");
        } else if (number == y) {
            System.out.println("Данное значение есть в константах");
        } else if (number == z){
            System.out.println("Данное значение есть в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }
    }
}
