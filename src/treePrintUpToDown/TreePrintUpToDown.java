package treePrintUpToDown;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreePrintUpToDown{
	
	public static void main(String []args){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		t1.left = t2;
		t1.right = t3;
		t2.left = null;
		t2.right = t4;
		t3.left = null;
		t3.right =null;
		t4.left = null;
		t4.right = null;
		
		List l = new Solution().PrintFromTopToBottom(null);
		for(int i=0 ;i< l.size();i++){
			System.out.println(l.get(i));
		}
	}
	
	
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	if(root == null){
    		return new ArrayList<Integer>();
    	}
		List <Integer>l = new ArrayList<Integer>();
		Queue queue = new LinkedList();
    	l.add(root.val);
    	queue.add(root);
    	
    	while(!queue.isEmpty()){
    		
    		root = (TreeNode)queue.poll();
    		
    		if(root.left!=null){
    	    	l.add(root.left.val);
    	    	queue.add(root.left);
    	    }
        	if(root.right!=null){
    	    	l.add(root.right.val);
    	    	queue.add(root.right);
        	}
        	
    	}
    	return (ArrayList)l;
    }
}
