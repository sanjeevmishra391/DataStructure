package Sorting.Searching;

import java.util.Scanner;
import java.util.Arrays;
public class binarySearch {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search");
		int k = sc.nextInt();
		int i,mid,cnt=0,n=10;
		int l=0,r=n;
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		while(r >= l)
        {
            mid = (r+l)/2;
            if(a[mid] > k)
            {
                r = mid-1;
            }
            else if(a[mid] < k)
            {
                l = mid+1;
            }
            else if(k == a[mid])
            {
                cnt = 1;
                System.out.println("Value is present at "+(mid+1));
                break;
            }
        }
	}
}

