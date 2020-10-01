package Sorting;

import java.util.Scanner;
public class bubbleSort {
	public static void main(String args[])
{
		try{
		Scanner sc = new Scanner(System.in);
		int i,j,temp,n=5;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
        	a[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
               if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
				System.out.println("sorted array");
        for(i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
	}catch(Exception e){};
}
}
