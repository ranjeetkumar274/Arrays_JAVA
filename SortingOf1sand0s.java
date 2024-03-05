import java.util.Scanner;
public class SortingOf1sand0s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] > nums[j] ){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
