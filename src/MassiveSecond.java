import java.util.Scanner;

public class MassiveSecond {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи количество строк в массиве: ");
        int stroka = sc.nextInt();
        System.out.println("Введи количество столбцов в массиве: ");
        int stolbec = sc.nextInt();
        int [][] matrix = new int[stroka][stolbec];
        for (int i = 0; i < stroka; i++){
            for (int j = 0; j < stolbec; j++){
                System.out.print("Введите элемент matrix[" + i + "][" + j + "]:");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int res : matrix[0]) {
            res = res * 3;
            System.out.println(res);
        }
    }
}


