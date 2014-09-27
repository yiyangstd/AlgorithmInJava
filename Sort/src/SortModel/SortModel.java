package SortModel;

/**
 * Created by Administrator on 2014/9/27.
 */
public class SortModel {
    public static void sort(Comparable[] a){

    }

    public static boolean less(Comparable itemA, Comparable itemB){
        return itemA.compareTo(itemB) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(Comparable[] a){
        for(Comparable item : a){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i = 0; i < a.length; i ++){
            if(less(a[i + 1], a[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] test = {"qwe", "ds", "dwe", "io", "werf"};

    }
}
