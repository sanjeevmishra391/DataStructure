package Sorting.Searching;

import java.util.Scanner;

import java.util.Scanner;

public class linearSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i,n=10;
        System.out.println("Enter the value to be searched");
        int k = sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
        	a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(k == a[i])
            {
                System.out.println("Value is present at location "+(i+1));
                break;
            }
        }
        if(i==n)
        {
            System.out.println("Value is not present");
        }
	}
}
