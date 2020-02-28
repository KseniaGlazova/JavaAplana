import java.util.Arrays;

public class SortChoice {
    public static void main(String[] args) {
        int [] unsortedArray= {1, 5, 9, 6, 3, 7, 6, 8, 2, 4};
        System.out.println(Arrays.toString(unsortedArray));
        choiceSort(unsortedArray);
    }
    public static void choiceSort(int[] arrayToSort){
        int indexMin;
        for (int index = 0; index < arrayToSort.length-1; index++) { //-1 потому что сравниваем предпоследний элемент с последним. Потому что если дойдем до последнего элемента, его уже будет не с чем сравнить
            indexMin = index;
            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++) { //сравниваем с index чтобы проверять неотсортированную часть массива
                if (arrayToSort[indexMin] > arrayToSort[indexToScan]){
                    indexMin = indexToScan;
                }
                int temp = arrayToSort[index];
                arrayToSort[index] = arrayToSort[indexMin];
                arrayToSort[indexMin] = temp;
            }
            System.out.println(Arrays.toString(arrayToSort));
        }
    }
}
