import java.io.*;
import java.util.*;

public class BinarySearchTree{
    private TreeNode myRoot;

    //constructor
    public BinarySearchTree(){
        myRoot = null;
    }
        
    //find
    /*public TreeNode find(TreeNode root, Comparable valueToFind){
        TreeNode node = root;
        
        while(node != null){
            int result = valueToFind.compareTo(node.getValue());
            if(result == 0)
                return node;
            else if(result < 0)
                node = node.getLeft();
            else
                node = node.getRight();
        }
        return null;
    }*/

    public Object find(Comparable target){
        return findHelper(myRoot, target);
    }

    private Object findHelper(TreeNode root, Comparable target){
        if(root == null){
            return null;
        }
        else if(target.equals((Item)(root.getValue()))){
            return root.getValue();
        }
        else if(target.compareTo(root.getValue()) < 0){
            return findHelper(root.getLeft(), target);
        }
        else{
            return findHelper(root.getRight(), target);
        }
    }
    
    //insert
    public void insert(Comparable next){
        myRoot = insertHelper(myRoot, next);
    }
    
    private TreeNode insertHelper(TreeNode root, Comparable next){
        if(root == null){
            root = new TreeNode(next, null, null);
        
        }
        else if(next.compareTo(root.getValue()) < 0){
            if(root.getLeft() != null){
                insertHelper(root.getLeft(), next); 
            }
            else{
                root.setLeft(new TreeNode(next, null, null));               
            }
        }
        else{
            if(root.getRight() != null){
               insertHelper(root.getRight(), next);  
            }
            else{
                root.setRight(new TreeNode(next, null, null));
                
            }
        }
        return root;
    }
    
    //delete
    public void delete(Comparable target){
        myRoot = deleteHelper(myRoot, target);
    }
    //deleteHelper
    private TreeNode deleteHelper(TreeNode node, Comparable target){
        if(node == null){
            throw new NoSuchElementException();
        }
        else if(target.equals(node.getValue())){
            return deleteTargetNode(node);
        }
        else if(target.compareTo(node.getValue()) < 0){
            node.setLeft(deleteHelper(node.getLeft(), target));
            return node;
        }
        else{
            node.setRight(deleteHelper(node.getRight(), target));
            return node;
        }
    }
    //deleteTargetNode
    private TreeNode deleteTargetNode(TreeNode target){
		if(target.getLeft() == null && target.getRight() == null){
			return null;
		}
        else if(target.getRight() == null){
            return target.getLeft();
        }
        else if(target.getLeft() == null){
            return target.getRight();
        }
        else if(target.getRight().getLeft() == null){
            target.setValue(target.getRight().getValue());
            target.setLeft(target.getRight().getRight());
            return target;
        }
        else{
            TreeNode marker = target.getRight();
            while(marker.getLeft().getLeft() != null){
                marker = marker.getLeft();
            }
            target.setValue(marker.getLeft().getValue());
            marker.setRight(marker.getLeft().getRight());
            return target;
        }
    }
    
    public int countNodes(){
        return countNodesHelper(myRoot);
    }

    private int countNodesHelper(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + (countNodesHelper(root.getRight()) + countNodesHelper(root.getLeft()));
    }
        
    public void print(){
        printInOrder(myRoot);
    }

    private void printInOrder(TreeNode root){
        // pre : root points to a binary search tree
        // post: prints the data fields of the tree using an inorder traversal  
        
        if (root != null) {
            printInOrder(root.getLeft());
            System.out.println(root.getValue());
            printInOrder(root.getRight());
        }
    } 
    
    

//--------------------------------------------Lab 3----------------------------------------------//
    
    
    

    public void preOrder(){
        printPreOrder(myRoot);
    }
    private void printPreOrder(TreeNode root){
        if(root != null){
            System.out.println(root.getValue());
            printPreOrder(root.getLeft());
            printPreOrder(root.getRight());
        }
    }
    
    public void postOrder(){
        printPostOrder(myRoot);
    }
    private void printPostOrder(TreeNode root){
        if(root != null){
            printPostOrder(root.getLeft());
            printPostOrder(root.getRight());
            System.out.println(root.getValue());
        }
    }
    
    public int countLeaves(){
        return countLeavesHelper(myRoot);
    }
    private int countLeavesHelper(TreeNode root){
        if(root != null && root.getLeft() == null && root.getRight() == null){
            return 1;
        }
        else if(root != null){
            return countLeavesHelper(root.getLeft()) + countLeavesHelper(root.getRight());
        }
        return 0;
    }
    
    public int height(){
        return heightHelper(myRoot);
    }
    private int heightHelper(TreeNode root)
    {
       if(root != null){
           return 1 + Math.max(heightHelper(root.getLeft()), heightHelper(root.getRight()));
       }
       return 0;
    }
    
    public int width(){
        return widthHelper(myRoot);
    }
    private int widthHelper(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            int length = 1 + heightHelper(root.getLeft()) + heightHelper(root.getRight());
            return Math.max(Math.max(widthHelper(root.getLeft()), widthHelper(root.getRight())), length);
        }
    }
    
    public void clearTree(){
        myRoot = null;
    }
    
    public void interchange(){
        
        interchangeHelper( myRoot); 
    }
    private void interchangeHelper(TreeNode root){
        if(root != null){
			TreeNode temp = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
			interchangeHelper(root.getLeft());
			interchangeHelper(root.getRight());
		}
    }
    
    public void printLevel(int level){
        printLevelHelper(myRoot, level);
    }
    private void printLevelHelper(TreeNode root, int level)
    {
        if(root == null){
            System.out.println("Level does not exist!");
        }
        else if(level == 0 && root != null){
			System.out.println(root.getValue());
		}
		else{
			if(level != 0 && root != null){
				printLevelHelper(root.getLeft(), level - 1);
				printLevelHelper(root.getRight(), level - 1);
			}
		}

    }
    
    public boolean isAncestor(Comparable ancestor, Comparable descendant){
        return isAncestor(myRoot, ancestor, descendant);
    }
    private boolean isAncestor(TreeNode root, Comparable a, Comparable d){
        if (findPtr(findPtr(root, a), d) != null){
            return true;
        }
        else{
            return false;
        }
    }
    private TreeNode findPtr(TreeNode root, Comparable target){
        if(root == null){
            return null;
        }
        else if(target.equals(root.getValue())){
            return root;
        }
        else if(target.compareTo(root.getValue()) < 0){
            return findPtr(root.getLeft(), target);
        }
        else if(target.compareTo(root.getValue()) > 0){
            return findPtr(root.getRight(), target);
        }
        return null;
    }
}