#include<stdio.h>
#include<stdlib.h>
void merge(int a[],int l,int m,int r)
{
	int n1,n2,i,j,k;
	n1=m-l+1;
	n2=r-m;
	int L[n1],R[n2];
	for(i=0;i<n1;i++)
	{
		L[i]=a[l+i];
	}
	for(j=0;j<n2;j++)
	{
		R[j]=a[m+1+j];
	}
	i=0;j=0;k=l;
	while(i<n1 && j<n2)
	{
		if(L[i]<R[j])
		{
			a[k]=L[i];
			i++;k++;
		}
		else
		{
			a[k]=R[j];
			j++;k++;
		}
	}
	while(i<n1)
	{
		a[k]=L[i];
		i++;k++;
	}
	while(j<n2)
	{
		a[k]=R[j];
		k++;j++;
	}
}
void mergesort(int a[],int l, int r)
{
	if(l<r)
	{
		int m=(l+r)/2;
		mergesort(a,l,m);
		mergesort(a,m+1,r);
		merge(a,l,m,r);
	}
}
main()
{
	int i,a[10],n;
	printf("\n enter the number of element");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}	
	mergesort(a,0,n);
	printf("\n sorted aray:");
	for(i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
}
	
