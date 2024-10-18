package assignment1810;

import java.util.Scanner;

public class Bubble_Sort {
	static void BubbleSort(String names[], int n) {	
    for (int i=0; i<n-1; i++) {
        for (int j=0; j<n-i-1; j++) {
            if (names[j].compareTo(names[j + 1]) > 0) 
            {
                String temp = names[j];
                names[j] = names[j + 1];
                names[j + 1] = temp;
            }
        }
    }
}
	static void displayNames(String names[], int n)
	{
		System.out.println("Sorted Names: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(names[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ch,n=0;
		String names[]=null;
		do {
			System.out.println("1.enter the names");
			System.out.println("2.sort and display");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
			case 1:
				System.out.println("enter the number of names");
				n=sc.nextInt();
				sc.nextLine();
				for(int i=0;i<n;i++)
				{
					System.out.println("enter name: "+(i+1));
					names[i]=sc.nextLine();
				}
				break;
			case 2:
				if(names!=null && n>0)
				{
					BubbleSort(names, n);
					displayNames(names,n);					
				}
				else
				{
					System.out.println("No name entered, enter the name:");
				}
				break;
			case 0:
				System.out.println("Invalid choice");
			}
		}while(ch!=0);
		
	}
}
