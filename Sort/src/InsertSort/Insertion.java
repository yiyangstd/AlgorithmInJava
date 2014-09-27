package InsertSort;
import SortModel.SortModel;

/**
 * 插入排序
 * Created by Administrator on 2014/9/27.
 */
public class Insertion {
    public static void sort(Comparable[] a){
        for(int i = 1; i < a.length; i ++){
            Comparable temp = a[i];
            int j = i;
            while((j > 0) && SortModel.less(temp, a[j - 1])){
                a[j] = a[j - 1];
                j --;
            }
            a[j] = temp;
        }
   }

    public static void main(String[] args){
        Integer[] test = {new Integer(12), new Integer(2), new Integer(34), new Integer(8), new Integer(24)};
        System.out.print("Before Sort: ");
        for(Integer inte : test){
            System.out.print(inte + " ");
        }
        Insertion.sort(test);
        System.out.println();
        System.out.print("After Sort: ");
        for(Integer inte : test){
            System.out.print(inte + " ");
        }
    }
}
