package SelectionSort;

/**
 * Created by yangyi on 2014/9/26.
 */
public class Selection {
    public static void sort(Comparable[] a){
        int length = a.length;
        Comparable flag = a[0];
        for(int i = 0; i < length - 1; i ++){
            if(a[i + 1].compareTo(a[i]) > 0){
                flag = a[i + 1];
            }
        }
    }
}
