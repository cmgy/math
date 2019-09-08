package com.cmgy.sword.rect;

import org.junit.Assert;
import org.junit.Test;

public class Solution2 {

    public boolean Find(int target, int[][] aa) {
        int rowCount=aa.length;
        int columntCount=aa[0].length;

        for(int i=0;i<rowCount;i++){
            int[] sub = aa[i];
            if(findRow(target,sub,0,columntCount-1)){
                return true;
            }
        }

        return false;

    }


    public boolean findRow(int target,int[] aa,int start,int end){
        if(target<aa[start]||target>aa[end]){
            return false;
        }

        if (target == aa[start] || target == aa[end]) {
            return true;
        }

        if (end-start<2) {
            return false;
        }


        int middle=(start+end)/2;

        if (findRow(target, aa, start, middle)) {
            return true;
        }

        if (findRow(target, aa, middle, end)) {
            return true;
        }

        return false;

    }


    @Test
    public  void test() {
        int[][] aa = {
                {1, 2, 4, 6, 8}, {3, 5, 7,66,88}
        };

        Solution2 solution2 = new Solution2();

        Assert.assertEquals(true, solution2.Find(5,aa));
        Assert.assertEquals(true, solution2.Find(1,aa));
        Assert.assertEquals(true, solution2.Find(8,aa));
        Assert.assertEquals(true, solution2.Find(3,aa));
        Assert.assertEquals(true, solution2.Find(88,aa));
        Assert.assertEquals(false, solution2.Find(9,aa));
        Assert.assertEquals(false, solution2.Find(77,aa));
        Assert.assertEquals(false, solution2.Find(100,aa));
    }
}
