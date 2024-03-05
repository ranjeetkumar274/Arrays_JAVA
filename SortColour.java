public class SortColour {
    public static void main(String[] args) {
        int[] nums = {1,2,2,0,0,0,2,1,1,0};
        int n = nums.length;

        int NoOfZeros = 0;
        int NoOfOnes = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0)  NoOfZeros++;
            if(nums[i] == 1)  NoOfOnes++;
        }

        for(int i = 0; i < n; i++){
            if(i < NoOfZeros) nums[i] = 0;
            else if( i < NoOfZeros+NoOfOnes) nums[i] = 1;
            else nums[i] = 2;
        }
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
