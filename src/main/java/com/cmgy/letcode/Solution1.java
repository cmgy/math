package com.cmgy.letcode;

import com.sun.deploy.util.ArrayUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        int[] result=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int cha = target - nums[i];

            if (map.containsKey(cha) && (map.get(cha) != i)) {
                result[0] = i;
                result[1] = map.get(cha);
            }else {
                map.put(nums[i], i);
            }
        }

        return result;
    }




    @Test
    public void test01() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = twoSum(nums, 9);

        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = twoSum2(nums, 9);


        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }
}
