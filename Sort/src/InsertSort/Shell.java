package InsertSort;

import SortModel.SortModel;

/**
 * 希尔排序
 * Created by Administrator on 2014/9/28.
 */
public class Shell extends SortModel{
    public static void sort(Comparable[] a){
        int step = a.length / 2;
        while(step > 0){
            insertion(a, step);
            step /= 2;
        }
    }

    private static void insertion(Comparable[] a, int step){
        for(int i = step; i < a.length; i ++){
            Comparable temp = a[i];
            int j = i;
            while(j > 0 && less(temp, a[j - step])){
                a[j] = a[j - step];
                j -= step;
            }
            a[j] = temp;
        }
    }

    public static void main(String[] args){
        Integer[] test = {new Integer(12), new Integer(2), new Integer(34), new Integer(8), new Integer(24)};
        System.out.println("Shell Sort:");
        System.out.print("Before Sort: ");
        for(Integer inte : test){
            System.out.print(inte + " ");
        }
        Shell.sort(test);
        System.out.println();
        System.out.print("After Sort: ");
        for(Integer inte : test){
            System.out.print(inte + " ");
        }
    }
}
