import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task18 {
    public static void main(String[] args) {
        try{
            File myFile = new File("task18");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException exc){
            System.out.println("Вот тут у тебя ошибка-ввода вывода: " + exc + "Проверь, где у тебя лежит файл, например");
        }
    }
}
