import java.util.Scanner;

public class MassiveSecond {
    //private static int j;
    //private static int i;

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи количество строк в массиве: ");
        int stroka = sc.nextInt();
        System.out.println("Введи количество столбцов в массиве: ");
        int stolbec = sc.nextInt();
        int [][] matrix = new int[stroka][stolbec];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print("Введите элемент matrix[" + i + "][" + j + "]:");
                matrix[i][j] = sc.nextInt();
            }
        }
        int x;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                j = j * 3;
                System.out.println(matrix[0][j] + " ");
            }
        }
    }
}

