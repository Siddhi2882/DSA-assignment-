package assignment1810;

import java.util.Scanner;

public class BST2 {
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
    
    void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + ",");
            inorder(r.right);
        }
     }
    
    Node deleteRec(Node root, int key)
    {
    	if(root==null)
    		return root;
    	if(key<root.data)
    		root.left=deleteRec(root.left, key);
    	else if (key > root.data)
    		root.right = deleteRec(root.right, key);
    	else {
    		if (root.left == null)
    			return root.right;
    		else if (root.right == null)
    			return root.left;
    			root.right = deleteRec(root.right, root.data);
    	}
    	return root;		
    		
    	}

	
	
	Node get_root()
    {
        return root;
    }

	public static void main(String[] args) {
		BST2 bst2=new BST2();
		Scanner sc=new Scanner(System.in);
		int ch,n;
		do {
			System.out.println("\n1.Create the binary tree.");
			System.out.println("2.Display");
			System.out.println("3.Delete element from binary tree");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				bst2.insert(bst2.get_root(),new Node(60));
				bst2.insert(bst2.get_root(),new Node(50));
				bst2.insert(bst2.get_root(),new Node(40));
				bst2.insert(bst2.get_root(),new Node(30));
				bst2.insert(bst2.get_root(),new Node(20));
				break;
			case 2:
				bst2.inorder(root);
				break;
			case 3:
				System.out.println("Enter the element to delete");
				n=sc.nextInt();
				bst2.deleteRec(root, n);
				break;
				
				
			case 0:
				System.out.println("Invalid Choice");
				break;
				
			}
		}while(ch!=0);

	}

}
