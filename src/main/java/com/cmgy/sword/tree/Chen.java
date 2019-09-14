package com.cmgy.sword.tree;

import com.cmgy.suanfa_xie.baseContruct.Tree;

/*输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）*/
public class Chen {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {


        return false;
    }

    private boolean isSame(TreeNode tree1, TreeNode tree2) {

        boolean isSame = true;

        if (tree1 == null && tree2 != null) {
            isSame = false;
        }

        if (tree2 == null && tree1 != null) {
            isSame = false;
        }

        if (tree1.val != tree2.val) {
            return false;
        }

        isSame(tree1, tree2,isSame);
        isSame(tree1.left, tree2.left,isSame);
        isSame(tree1.right, tree2.right,isSame);

        return isSame;
    }

    private void isSame(TreeNode tree1, TreeNode tree2,boolean isSame) {

        TreeNode current1 = tree1;
        TreeNode current2 = tree2;
    }

}
