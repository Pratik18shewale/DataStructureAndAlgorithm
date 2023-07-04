package MyPracticeBST;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinSearchTree bst = new BinSearchTree();
		
		bst.insert(50);
		
		bst.insert(30);
		bst.insert(25);
		bst.insert(45);
		
		bst.insert(60);
		System.out.println("preorder =");
		bst.preOrder();
		
		System.out.println("inrder = ");
		bst.inOrder();
	
		
		bst.find(45);
		bst.find(70);

	}

}
