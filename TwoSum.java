import java.util.ArrayList;
public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(5);

        nums.add(0,5);
        nums.add(1,2);
        nums.add(2,3);
        nums.add(3,7);
        nums.add(4,6);

        System.out.println(nums);

        int target = 9;

        for(int i = 0; i < nums.size(); i++){
            for(int j = i+1; j < nums.size();j++){
                if(target == nums.get(i)+nums.get(j)) {
                    System.out.println(nums.get(i)+" "+nums.get(j));
                }
            }
        }
    }
}
