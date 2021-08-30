class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int[] soln={0,0};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum = nums[i]+nums[j];
                if(sum==target){
                    soln[0]=i;
                    soln[1]=j;
                    break;
                }
            }
        }
        return soln;
    }
}
public class twosumsolution{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target = 12;
        Solution sc = new Solution();
        int[] abc = sc.twoSum(arr, target);
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }
    }
}