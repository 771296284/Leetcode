package algorithm.easy;

/**
 * 判断一个树是否是另一个树的子树
 * Created by jiangjl on 2017/6/8.
 */
public class Solution572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null || t==null){
            return false;
        }
        if(compareTwoTree(s,t)){
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }


    private boolean compareTwoTree(TreeNode s,TreeNode t){
        if(s==null && t==null)
            return true;
        if(s==null || t==null || s.val!=t.val){
            return false;
        }
        return compareTwoTree(s.left,t.left) && compareTwoTree(s.right,t.right);
    }

    public static void main(String[] args){
        TreeNode s = new TreeNode(1);
        TreeNode s1 = new TreeNode(1);
        TreeNode s2 = new TreeNode(1);
        TreeNode s3 = new TreeNode(1);
        TreeNode s4 = new TreeNode(2);
        s.right = s1;
        s1.right = s2;
        s2.right = s3;
        s3.left = s4;

        TreeNode t = new TreeNode(1);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        t.right = t1;
        t1.left = t2;

        Solution572 solution572 = new Solution572();
        System.out.println(solution572.isSubtree(s,t));
    }
}
