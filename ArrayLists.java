import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {

        //creating an arraylist
        ArrayList<Integer> nums = new ArrayList<>(5);

        //initialization of arraylist
        nums.add(0,10);
        nums.add(1,20);
        nums.add(2,30);
        nums.add(3,40);
        nums.add(4,50);

        System.out.println(nums); //printing the array

        //adding extra element in the array out of its capacity
        nums.add(5,60);
        System.out.println(nums);

        //printing the array with the help of for loop
        for(int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();

        //change or modify any element in the array
        nums.set(3,90);
        System.out.println(nums);

        //removing the elements from the array
        nums.remove(3);
        System.out.println(nums);
    }
}
