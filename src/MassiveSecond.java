import java.util.Scanner;

public class MassiveSecond {
    //private static int j;
    //private static int i;

    public static void main(String[] args) throws Exception{
                Scanner sc = new Scanner(System.in);
                int matrix [][] = new int[3][3];
        System.out.println("Введи числа для матрицы: ");

                for (int i = 0; i < 3; i++){
                    //char[] in = sc.nextLine().toCharArray();
                    for (int j = 0; j < 3; j++){
                        matrix[i][j] = sc.nextInt();
                        //matrix[i][j] = in[j];
                        System.out.println(matrix[i][j] + " ");
                    }
                    System.out.println();
                }


        }
    }

