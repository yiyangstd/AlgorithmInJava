package SelectionSort;

import SortModel.SortModel;

/**
 * 直接插入排序
 * Created by yangyi on 2014/9/26.
 */
public class Selection {
    public static void sort(Comparable[] a){
        int length = a.length;
        int flag;
        for(int i = 0; i < length; i ++){
            flag = i;
            for(int j = i + 1; j < length; j++){
                if(SortModel.less(a[j], a[flag])){
                    flag = j;
                }
            }
            if(flag != i) {
                SortModel.exch(a, i, flag);
            }
        }
    }

    public static void main(String[] args){
        Integer[] test = {new Integer(12), new Integer(2), new Integer(34), new Integer(8), new Integer(24)};
        System.out.print("Before Sort: ");
        for(Integer inte : test){
            System.out.print(inte + " ");
        }
        Selection.sort(test);
        System.out.println();
        System.out.print("After Sort: ");
        for(Integer inte : test){
            System.out.print(inte + " ");
        }
    }
}
