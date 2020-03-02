import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] a = {5, 6, 2, 39, 1, 0, 7, 3, 9, 18};
        bubbleSort.sort(a);
    }
}

    class BubbleSort {
        public void sort (int[] arr) {
            for (int i = arr.length-1; i >0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

