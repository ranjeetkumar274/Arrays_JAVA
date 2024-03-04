public class reverseArray {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70};
        int n = nums.length;

        int i = 0;
        int j = n-1;
        while(i<=j){
            swap(nums,i,j);
            i++;
            j--;
        }
        for(int ele : nums){
        System.out.print(ele+" ");
        }
    }
}
