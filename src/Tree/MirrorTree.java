package Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * @author yangzikang
 *
 *				1
 *			2		3
 *			  4
 */
public class MirrorTree{
	
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
		
		printTreeLDR(t1);
		System.out.println();
		mirrorTree(t1);
		printTreeLDR(t1);
		
	}
	
	public static void mirrorTree(TreeNode t){
		if(t==null){
			return;
		}
		TreeNode temp = t.left;
		t.left = t.right;
		t.right = temp;
		if(t.left!=null){
			mirrorTree(t.left);
		}
		if(t.right!=null){
			mirrorTree(t.right);
		}
		
	}
	
	public static void printTreeLDR(TreeNode t){
		if(t==null){
			return;
		}
		if(t.left!=null){
			printTreeLDR(t.left);
		}
		System.out.print(t.val);
		if(t.right!= null){
			printTreeLDR(t.right);
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


