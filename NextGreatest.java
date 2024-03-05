public class NextGreatest {
    public static void main(String[] args) {
        int[] nums = { 12,8,41,37,2,49,16,28,21};
        int n = nums.length;
        int[] ans = new int[n];

        ans[n-1] = -1;
        int nge = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            ans[i] =  nge;
            nge = Math.max(nge,nums[i]);
        }

        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
