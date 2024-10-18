package assignment1810;

import java.util.Scanner;

public class BST3 {
	private static Node root;
    void create_Tree()
    {
        root=null;
    }
    void insert(Node r,Node n)     
    {
        if(root==null)
            root=n;
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                {
                    r.left = n;
                    System.out.println(n.data + " inserted");
                }
                else
                    insert(r.left,n);
            }
            else
            {
                if(r.right==null)
                {
                    r.right = n;
                    System.out.println(n.data + " inserted");
                }
                else
                    insert(r.right,n);
            }
        }
    }

	int height(Node node) {
		if (node == null)
			return 0;
		return 1 + Math.max(height(node.left), height(node.right));
	}

	void printGivenLevel(Node node, int level) {
		if (node == null)
			return;
		if (level == 1) {
			System.out.print(node.data + " ");
		} else if (level > 1) {
			printGivenLevel(node.left, level - 1);
			printGivenLevel(node.right, level - 1);
		}

	}

	void levelOrder() {
		int h = height(root);
		for (int i = 1; i <= h; i++) {
			printGivenLevel(root, i);
		}
		System.out.println();
	}
	
	Node get_root() {

		return root;
	}

	public static void main(String[] args) {
		BST3 bst = new BST3();
		Scanner sc = new Scanner(System.in);
		bst.create_Tree();
		bst.insert(bst.get_root(), new Node(50));
		bst.insert(bst.get_root(), new Node(30));
		bst.insert(bst.get_root(), new Node(100));
		bst.insert(bst.get_root(), new Node(5));
		bst.insert(bst.get_root(), new Node(45));
		bst.insert(bst.get_root(), new Node(200));
		System.out.println("Level-order traversal of the Binary Search Tree:");
		bst.levelOrder();

	}



}
