public class PassingArrayinMethod {

    public static void Change(int[] x){
        x[3]=90;
    }
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        System.out.println(nums[3]);
        Change(nums);
        for(int i = 0; i < nums.length; i++ ){
        System.out.print(nums[i]+" ");
        }
    }
}
