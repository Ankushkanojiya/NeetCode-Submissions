package Arrays;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int nums[]={2,5,6,4,5};
        int target=10;
        System.out.println(Arrays.toString(findTwoSum(nums, target)));
    }

    // we can use two for loops to check with every elements nums[i]+nums[j]=target -> O(n2)
    
    // optimized version with O(n)
    public static int[] findTwoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int secondNumber=target-nums[i];
            if (map.containsKey(secondNumber)) {
                return new int[]{map.get(secondNumber),i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}