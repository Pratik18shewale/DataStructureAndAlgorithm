package MyPracticeBST;

import java.util.Stack;

public class BinSearchTree {
	private Node root;
	public BinSearchTree() {
	root = null;
	}//ctor

	 public boolean insert (int data) {
		 Node newNode = new Node(data);
		 if (newNode == null) {
			 return false;
		 }//newnode null
		 
		 if(root == null) {
			 root = newNode;
			 return true;
		 }//root null
		 
		 Node temp = root;
		 while (true) {
			 if (data == temp.getData()) {
				 return false;
			 }//to avoid duplication
			 
			 if(data < temp.getData()) {
				 if(temp.getLeft() == null) {
					 temp.setLeft(newNode);
					 return true;
				 }
				 temp = temp.getLeft();
			 }//left
			 else {
		 	 if(temp.getRight() == null) {
				 temp.setRight(newNode);
				 return true;
			 }//null
			 temp = temp.getRight();
			 }//right wing
		//return true;
		}
	 }//insert
	 
	 public void preOrder() {
		 Node temp = root;
		 Stack <Node> stack = new Stack <>();
		 
		 while(temp != null || !stack.isEmpty()) {
			 while(temp != null) {
				 System.out.print(temp.getData() + " ");
				 stack.push(temp);
				 temp = temp.getLeft();
			 }//while inner
			 temp = stack.pop().getRight();
		 }//while
		 System.out.println();
	 }//preorder
	 
	 public void inOrder() {
		 Node temp = root;
		 Stack<Node>stack = new Stack<>();
		 
		 while(temp != null || !stack.isEmpty()) {
			 while(temp != null) {
				 stack.push(temp);
				temp = temp.getLeft();
			 }//inner while
			 temp = stack.pop();
			 System.out.print(temp.getData() + " ");
			 temp = temp.getRight();
		 }//outer while
		 System.out.println();
	 }//inorder
	 
	 public int getMax() {
		 if (root == null) {
			 return -1;
		 }//if
		 Node temp = root;
		 while(temp.getRight() != null) {
			 temp = temp.getRight();
		 }//while
		 return temp.getData();
	 }//max
	 
	 public boolean find(int data) {
		 Node temp = root;
		 
		 while(temp != null) {
			 if(temp.getData() == data) {
				 return true;
			 }if(temp.getData() < data) {
				 temp = temp.getRight();
			 }else {temp = temp.getLeft();}
			
		 }//while
		 return false;
		 
	 }//find
	 
}

