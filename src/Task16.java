import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {
    public static void main(String[] args) {
        String fileName = "Test";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            while ((fileName = br.readLine() != null)){
            System.out.println(fileName);
        }
        }catch (IOException exc){
            System.out.println("Вот тут у тебя ошибка-ввода вывода: " + exc + "Проверь, где у тебя лежит файл, например");
        }
    }
}
