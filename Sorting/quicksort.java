import java.util.*;
public class quick
{
 int partition(int a[],int low,int high)
{
 int pivot=low;
 int i=low;
 int j=high;
 while(i<j)
 {
  do
   {
    i++;
   }while(a[i]<=pivot);
  do
   {
    j--; 
   }while(a[j]>pivot);
 if(i<j)
 {
 int temp=a[i];
 a[i]=a[j];
 a[j]=temp;
 }
}
int temp2=a[low];
a[low]=a[j];
a[j]=temp2;

return j;
}

void quicksort(int a[],int low,int high)
{
 if(low<high)
 {
 int pari=partition(a,low,high);
 quicksort(a,low,pari-1);
 quicksort(a,pari+1,high);
 }
}

public static void main(String[] args)
{
 Random rn=new Random();
 int n=2000;
 int a[]=new int[n];
 for(int i=0;i<n;i++)
 {
 a[i]=rn.nextInt(n);
 }

quick obj=new quick();
obj.partition(a,0,n-1);
obj.quicksort(a,0,n-1);
for(int i=0;i<=n-1;i++)
{
System.out.println(a[i]);
}  
}
}
