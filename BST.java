package assignment1810;

import java.util.Scanner;

public class BST {
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
   
    void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data + ",");
            preorder(r.left);
            preorder(r.right);
        }
    }
    void postorder(Node r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + ",");

        }
    }
    Node get_root()
    {
        return root;
    }

	public static void main(String[] args) {
		BST bst=new BST();
		
		Scanner sc=new Scanner(System.in);
		int ch;
		
		
		do {
			System.out.println("\n1.Create the Binary Search tree.");
			System.out.println("\n2.Preorder Tree");
			System.out.println("\n3.Postorder Tree");
			System.out.println("\nEnter your choice ");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				bst.insert(bst.get_root(),new Node(60));
				bst.insert(bst.get_root(),new Node(50));
				bst.insert(bst.get_root(),new Node(40));
				bst.insert(bst.get_root(),new Node(30));
				bst.insert(bst.get_root(),new Node(20));
				break;
			case 2:
				bst.preorder(root);
				break;
			case 3:
				bst.postorder(root);
				break;
			case 0:
				System.out.println("invalid choice");
				break;		
								
			}
					
		}while(ch!=0);

	}

}
