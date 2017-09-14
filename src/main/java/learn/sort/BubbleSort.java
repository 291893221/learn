package learn.sort;

/**
 * 冒泡排序：比较相邻两个元素，如果前一个比后一个大，就交换位置
 * 稳定排序算法
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 7, 12, 6, 13, 9, 100, 90, 1, 17, 91};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
