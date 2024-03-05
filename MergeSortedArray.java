public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {2,4,6,7,9};
        int[] b = {3,4,6,8,9};
        int m = a.length;
        int n = b.length;
        int[] c = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;
        while( (i < m) && (j < n)) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;

            }
            else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if(i == m){
            while(j < n){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(j == n){
            while(i < m){
                c[k] = a[i];
                i++;
                k++;
            }
        }
        for(int p = 0; p < m+n; p++){
            System.out.print(c[p]+" ");
        }
        }
    }
