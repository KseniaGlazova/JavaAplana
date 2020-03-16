import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17 {
    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("После слова 'stop' запись в файл больше не будет производиться");
        try (FileWriter fw = new FileWriter("task17")){
            do {
                System.out.println("Введи свой текст построчно: ");
                s = br.readLine();
                if (s.compareTo("stop") == 0) break;
                s = s + "\r\n";
                fw.write(s);
            }
            while (s.compareTo("stop") != 0);
        } catch (IOException exc){
            System.out.println("Ошибка ввода-вывода" + exc);
        }
    }
}
