import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = read.nextInt();


        int nums[] = new int[n];


        //taking input of the array at once through loop
        for(int i = 0; i < n; i++){
            nums[i] = read.nextInt();
        }

        System.out.print("Enter the element that we want to find : ");
        int x = read.nextInt();

        //printing the output of the whole array

        boolean flag = false;
        for(int i = 0; i < n; i++){
            if(nums[i] == x){
                flag = true;
                break;

            }
            }
        if(flag == true){
            System.out.println("elemen found.");
        }
        else{
            System.out.println("not found.");
        }
            }


        }

