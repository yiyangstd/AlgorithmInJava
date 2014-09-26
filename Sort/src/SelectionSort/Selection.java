package SelectionSort;

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
                if(a[j].compareTo(a[flag]) < 0){
                    flag = j;
                }
            }
            if(flag != i) {
                Comparable temp = a[i];
                a[i] = a[flag];
                a[flag] = temp;
            }
        }
    }

    public static void main(String[] args){
        Integer[] test = {new Integer(12), new Integer(2), new Integer(34), new Integer(8), new Integer(24)};
        Selection.sort(test);
        for(Integer inte : test){
            System.out.print(inte + " ");
        }
    }
}
