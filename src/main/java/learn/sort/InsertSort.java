package learn.sort;

/**
 * 插入排序：第一个元素默认排好序，从第二个元素开始往后遍历，依次跟前面元素对比，如果前一个比后一个大，就交换位置
 * 稳定排序算法
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {10, 7, 12, 6, 13, 9, 100, 90, 1, 17, 91};
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } else {
                	break;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
