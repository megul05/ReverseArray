package ArrayReverse;

import java.util.Scanner;

public class ArrayReverse {
	
	public static void Reverse(int arr[],int size)
	{
		int a=0;int j=size-1;
		while(a<j)
		{
			int temp = arr[a];
			arr[a] = arr[j];
			arr[j] = temp;
			a++;
			j--;
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
		}	
		int size = arr.length;
		Reverse(arr,size);

	}

}
