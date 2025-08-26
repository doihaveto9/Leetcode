public class TreeNode {
	private int value;
	private TreeNode right;
	private TreeNode left;
	
	public TreeNode(int val){
		value = val;
	}
	
	public TreeNode(int val, TreeNode l, TreeNode r){
		value = val;
		left = l;
		right = r;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int val){
		value = val;
	}
	
	public TreeNode getLeft(){
		return left;
	}
	
	public void setLeft(TreeNode l){
		left = l;
	}
	
	public TreeNode getRight(){
		return right;
	}
	
	public void setRight(TreeNode r){
		right = r;
	}
	
	public static void main(String[] args){
		
		TreeNode leaf1 = new TreeNode(1);
		TreeNode leaf2 = new TreeNode(3);
		TreeNode leaf3 = new TreeNode(6);
		TreeNode leaf4 = new TreeNode(9);

		TreeNode nodeRight = new TreeNode(7, leaf3, leaf4);
		TreeNode nodeLeft = new TreeNode(2, leaf1, leaf2);

		TreeNode root = new TreeNode(4, nodeLeft, nodeRight);
		
		print(root);
		
		System.out.println("And now we reverse!");
		
		reverse(root);
		print(root);
	}
	
	public static void reverse(TreeNode treeNode){
		if(treeNode == null)
			return;
		
		TreeNode temp = treeNode.getLeft();
		treeNode.setLeft(treeNode.getRight());
		treeNode.setRight(temp);
		
		reverse(treeNode.getLeft());
		reverse(treeNode.getRight());
	}
	
	public static void print(TreeNode treeNode){
		if(treeNode == null)
			return;
			
		System.out.println("Value: " + treeNode.getValue());
		
		if(treeNode.getLeft() != null)
			System.out.println("Left of " + treeNode.getValue() + " " + treeNode.getLeft().getValue());
			
		if(treeNode.getRight() != null)
			System.out.println("Right of " + treeNode.getValue() + " " + treeNode.getRight().getValue());
		
		print(treeNode.getLeft());
		print(treeNode.getRight());
	}
}