package QuickSort;
import SortModel.SortModel;

/**
 * 快速排序
 * Created by yangyi on 2014/9/26.
 */
public class QuickSort {
    public static void sort(Comparable a[]){
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(Comparable a[], int i, int j){
        int start = i;
        int end = j;
        if(i < j){
            Comparable temp = a[i];
            while(i < j){
                while(SortModel.less(temp, a[j]) && i < j){
                    j --;
                }
                if(i < j){
                    a[i ++] = a[j];
                }
                while(SortModel.less(a[i], temp) && i < j){
                    i ++;
                }
                if(i < j){
                    a[j ++] = a[i];
                }
            }
            if(i == j){
                a[i] = temp;
            }
            quickSort(a, start, i - 1);
            quickSort(a, i + 1, end);
        }
    }
    public static void main(String[] args){
        System.out.println("Quick Sort");
        Integer[] test = {new Integer(12), new Integer(2), new Integer(34), new Integer(8), new Integer(24)};
        System.out.print("Before Sort: ");
        for(Integer inte : test){
            System.out.print(inte + " ");
        }
        QuickSort.sort(test);
        System.out.println();
        System.out.print("After Sort: ");
        for(Integer inte : test){
            System.out.print(inte + " ");
        }
    }
}
