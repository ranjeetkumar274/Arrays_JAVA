import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = read.nextInt();
        int nums[] = new int[n];
        int sum = 0;

        //taking input of the array at once through loop
        for(int i = 0; i < n; i++){
            nums[i] = read.nextInt();
        }

        //printing the output of the whole array
        for(int i = 0; i < n; i++){
            sum += nums[i];

        }
        System.out.print(sum);

    }
}
