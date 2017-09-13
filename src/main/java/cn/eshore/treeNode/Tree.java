package cn.eshore.treeNode;

public class Tree {
	public int getDepth(TreeNode treeNode) {
		int depth = 0;
		if(null == treeNode){
			return depth;
		}
		int left = this.getDepth(treeNode.left) + 1;
		int right = this.getDepth(treeNode.right) +1;
		depth = Math.max(left, right);
		return depth;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		TreeNode left = new TreeNode();
		TreeNode right = new TreeNode();
		root.left = left;
		root.right = right;
		TreeNode leftleft = new TreeNode();
		left.left = leftleft;
		Tree tree = new Tree();
		int depth = tree.getDepth(root);
		System.out.println(depth);
	}
}
