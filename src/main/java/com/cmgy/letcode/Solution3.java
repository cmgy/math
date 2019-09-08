package com.cmgy.letcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        byte[] bytes = s.getBytes();

        int maxIndex=0;
        ArrayList<Byte> integerList = new ArrayList<Byte>();

        for (byte b : bytes) {
            int index = integerList.indexOf(b);
            if (index >= 0) {
                if (integerList.size() > maxIndex) {
                    maxIndex = integerList.size();
                }

                integerList = remove(integerList, index);
            }
            integerList.add(b);


        }

        return integerList.size() > maxIndex ? integerList.size() : maxIndex;
    }

    private ArrayList<Byte> remove(ArrayList<Byte> list, int index) {
        ArrayList<Byte> resultList = new ArrayList<Byte>();
        for (int i = index+1; i < list.size(); i++) {
            resultList.add(list.get(i));
        }

        return resultList;
    }

    @Test
    public void test01() {

        Assert.assertEquals(3, lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(2, lengthOfLongestSubstring("aab"));
        Assert.assertEquals(3, lengthOfLongestSubstring("dvdf"));
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("chen", "hao");
    }
}

