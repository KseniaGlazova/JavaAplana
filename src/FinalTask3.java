import java.text.DecimalFormat;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущий курс: ");
        double kurs = sc.nextDouble();
        System.out.println("Введите количество рублей, которое хотите поменять");
        double rubAmount = sc.nextDouble();
        double res = rubAmount / kurs;

        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(res);
        System.out.println(format);
    }
}
