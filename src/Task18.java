import java.io.*;

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
            System.out.println("Вот тут у тебя ошибка-ввода вывода: " + exc + "Проверь, где у тебя лежит файл или проверь название, например");
        }

        try{
            File myFile = new File("task18");
            FileReader fileReader = new FileReader(myFile);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            int lineNumber = 0;
            while (lineNumberReader.readLine() != null){
                lineNumber++;
            }
            System.out.println("\n\r" +
                    "Количество строк в файле: " + lineNumber);
            lineNumberReader.close();

            BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
            System.out.println("После строчки #" + lineNumber + " запись в файл производиться не будет");
            FileWriter fw = new FileWriter("task18");
            System.out.println("Введи свой текст, где пробел означает переход на новую строку: ");
            for (int i = 0; i < lineNumber; i++) {
                String s = br.readLine();
                s = s + "\r\n";
                fw.write(s);
            }
            fw.close();


        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
