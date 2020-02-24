import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write hier something with spaces, please: ");
        String write = sc.nextLine();
        while (write.contains(" ")){
            String replace = write.replace(" ", "");
            write = replace;
        }
        System.out.println(write);
    }
}


