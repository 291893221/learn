package learn.sort;

/**
 * Created by gisuni on 2017/8/23.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {10, 7, 12, 6, 13, 9, 100, 90, 1, 17, 91};
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
