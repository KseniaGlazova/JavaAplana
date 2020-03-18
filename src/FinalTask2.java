import java.util.Arrays;
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Введи числа, которые будут в массиве: ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        for (int left = 0; left < array.length; left++){
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--){
                if (value < array[i]){
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
