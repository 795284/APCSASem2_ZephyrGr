
/**
 * Zephyr Granger
 * Merge Sort trail
 * 1/18/19
 */
public class Merge{
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {return;} //  Base Case
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        //+++++++++ Helper Function ++++++++++++
        merge(a, l, r, mid, n - mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while (i < left) { a[k++] = l[i++];}
        while (j < right) {a[k++] = r[j++];}
    }
    public static void main(){
        int[] arr = new int[10];
        for(int i = 0; i <arr.length;i++){
            arr[i]=(int)(Math.random()*20);
        }
        int x = arr.length;
        mergeSort(arr,x);
        for(int r =0;r<arr.length; x++){
          System.out.println(arr[r]+"");  
        }
        System.out.println();
    }
}

