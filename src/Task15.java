import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи размер массива: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Наполни массив числами: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = a.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(a));
        
    }
}