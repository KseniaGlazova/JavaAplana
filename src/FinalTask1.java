import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число в бинарном формате: ");
        String str = sc.nextLine();
        int n = 0;
        for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n += (str.charAt(i) - '0') * j;
        }
        System.out.println("\"" + str + "\" -> " + n);
    }
}

