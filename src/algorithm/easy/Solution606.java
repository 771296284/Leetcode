package algorithm.easy;

import sun.reflect.generics.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution606 {

    public String tree2str(TreeNode t) {
        if(t==null) return "";
        StringBuilder sb = new StringBuilder();
        buildpart(t,sb);
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(0);
        return sb.toString();
    }

    private void buildpart(TreeNode t,StringBuilder sb){
        if(t==null) return;
        sb.append("(");
        sb.append(t.val);
        if(t.left==null && t.right!=null){
            sb.append("()");
            buildpart(t.right, sb);
        }else{
            buildpart(t.left,sb);
            buildpart(t.right,sb);
        }
        sb.append(")");
    }

    public static void main(String[] args){
        TreeNode h = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(3);
        TreeNode lr1 = new TreeNode(4);
        h.left = l1;
        h.right = r1;
        l1.right = lr1;

        Solution606 solution606 = new Solution606();
        System.out.println(solution606.tree2str(h));
    }
}