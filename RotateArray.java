import java.util.Scanner;
public class RotateArray {
    public static void reverse(int[] nums, int i, int j) {
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the array : ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Number of times you want to rotate : ");
        int k = sc.nextInt();

        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

        System.out.print("The Rotated array is : ");

        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
