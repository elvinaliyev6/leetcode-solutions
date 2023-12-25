package leetcode.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    //solution 1
    public int[] twoSumWithMap(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }

        return result;
    }

//    solution 2
    public int[] twoSumWithLoops(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}
