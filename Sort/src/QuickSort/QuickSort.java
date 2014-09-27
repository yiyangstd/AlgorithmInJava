package QuickSort;
import SortModel.SortModel;

/**
 * Created by yangyi on 2014/9/26.
 */
public class QuickSort {
    public static void sort(Comparable a[]){
        quickSort(a, 0, a.length);
    }

    private static void quickSort(Comparable a[], int i, int j){
        if(i < j){
            Comparable temp = a[i];
            while(i < j){
                while(SortModel.less(temp, a[j])){
                    j --;
                }

                while(SortModel.less(a[i], temp)){
                    i ++;
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Quick Sort");
    }
}
