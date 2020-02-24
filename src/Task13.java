import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Напиши первую строку: ");
        String first = sc.nextLine();
        System.out.println("Напиши вторую строку");
        String second = sc.nextLine();

        int length1 = first.length();
        int length2 = second.length();

        if (length1 > length2){
            System.out.println("Первая строка длинее второй: " + first);
        } else if (length1 < length2){
            System.out.println("Вторая строка длиннее первой: " + second);
        } else {
            System.out.println("Длина строк одинаковая: " + length1 + " " + length2);
        }
    }
}
