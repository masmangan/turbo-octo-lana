package pucrs.alpro3.arvores;

public class AVLTreeApp {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		System.out.println(bst.size());
		System.out.println(bst);
		bst.add(30);
		System.out.println(bst.size());		
		System.out.println(bst);
		bst.add(20);
		System.out.println(bst.size());
		System.out.println(bst);
		bst.add(40);
		System.out.println(bst.size());
		System.out.println(bst);

		bst.add(10);
		System.out.println(bst.size());
		System.out.println(bst);		
		
		System.out.println(bst.contains(20));
		System.out.println(bst.contains(21));
			
	}

}
