package com.cmgy.sword.rect;

import org.junit.Assert;
import org.junit.Test;

/*在一个二维数组中（每个一维数组的长度相同），
每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。*/
public class Solution4 {


    public boolean Find(int target, int[][] aa) {
        int rowCount=aa.length;
        int columntCount=aa[0].length;

        int rowStart=rowCount-1;
        int colStart = 0;

        while (rowStart >=0 && colStart < columntCount) {

            int m = aa[rowStart][colStart];

            if (m > target) {
                rowStart--;
            }
            if (m < target) {
                colStart++;
            }

            if (m == target) {
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

        Solution4 solution2 = new Solution4();

        Assert.assertEquals(true, solution2.Find(8,aa));
        Assert.assertEquals(true, solution2.Find(5,aa));
        Assert.assertEquals(true, solution2.Find(1,aa));
        Assert.assertEquals(true, solution2.Find(3,aa));
        Assert.assertEquals(true, solution2.Find(88,aa));
        Assert.assertEquals(false, solution2.Find(9,aa));
        Assert.assertEquals(false, solution2.Find(77,aa));
        Assert.assertEquals(false, solution2.Find(100,aa));
    }
}
