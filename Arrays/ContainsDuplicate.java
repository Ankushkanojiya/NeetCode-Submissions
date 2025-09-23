package Arrays;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            else{
                map.put(nums[i], 1);
            }
        }
        return false;
        // Time Complexity as 0(n) and space complexity as 0(1)
    }

    public static void main(String[] args) {
        int[] arr={3,1,4,5,4,3,5};
        System.out.println(hasDuplicate(arr));
    }
}
