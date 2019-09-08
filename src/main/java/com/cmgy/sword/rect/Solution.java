package com.cmgy.sword.rect;

public class Solution {

    public boolean Find(int target, int[][] aa) {
        int rowCount=aa.length;

        for(int i=0;i<rowCount;i++){
            int[] sub = aa[i];
            if(findRow(target,sub)){
                return true;
            }
        }

        return false;

    }

    public boolean findRow(int target,int[] aa){
        if(target<aa[0]||target>aa[aa.length-1]){
            return false;
        }

        for(int i=0;i<aa.length;i++){
            if(target==aa[i]){
                return true;
            }
        }
        return false;
    }
}
