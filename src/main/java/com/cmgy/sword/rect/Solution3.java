package com.cmgy.sword.rect;

import org.junit.Assert;
import org.junit.Test;

public class Solution3 {


    public boolean Find(int target, int[][] aa) {
        int rowCount=aa.length;
        int columntCount=aa[0].length;


        return find(target, aa, 0, rowCount-1, 0, columntCount-1,true);

    }

//    private int getMiddleIndex(int start, int end) {
//        int differ = end - start;
//
//        if (differ % 2 == 1) {
//
//        }
//    }


    public boolean find(int target, int[][] aa, int rowStart, int rowEnd, int colStart, int colEnd,boolean isRow) {

        if (target < aa[rowStart][colStart] || target > aa[rowEnd][colEnd]) {
            return false;
        }

        if (target ==aa[rowStart][colStart] || target == aa[rowEnd][colEnd]) {
            return true;
        }

        if (rowEnd - rowStart ==0 && colEnd - colStart ==0) {
            return false;
        }
        if (rowEnd - rowStart ==1 && colEnd - colStart ==1) {
            return false;
        }

        if (isRow) {
            int rowMiddle = (rowStart + rowEnd) / 2;
            if (find(target, aa, rowStart, rowMiddle, colStart, colEnd,false)) {
                return true;
            }

            if (find(target, aa, rowMiddle, rowEnd, colStart, colEnd,false)) {
                return true;
            }
        }else {
            int colMiddle = (colStart + colEnd) / 2;
            if (find(target, aa, rowStart, rowEnd, colStart, colMiddle,true)) {
                return true;
            }

            if (find(target, aa, rowStart, rowEnd, colMiddle, colEnd,true)) {
                return true;
            }
        }


        return false;
    }

    @Test
    public  void test() {
        int[][] aa = {
                {1, 2, 4, 6, 8}, {3, 5, 7,66,88}
        };

        Solution3 solution2 = new Solution3();

//        Assert.assertEquals(true, solution2.Find(8,aa));
//        Assert.assertEquals(true, solution2.Find(5,aa));
//        Assert.assertEquals(true, solution2.Find(1,aa));
        Assert.assertEquals(true, solution2.Find(3,aa));
//        Assert.assertEquals(true, solution2.Find(88,aa));
//        Assert.assertEquals(false, solution2.Find(9,aa));
//        Assert.assertEquals(false, solution2.Find(77,aa));
//        Assert.assertEquals(false, solution2.Find(100,aa));
    }
}
