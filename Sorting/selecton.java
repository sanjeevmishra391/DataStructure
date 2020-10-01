import java.util.*;
class InsertionSort;
{
 public static void insertion(int array[],int k)
{
 int key,i;
 for(i=1; i<k:i++)
{
 key=array[i];
 int j;
 for(j=i-1;j>=0;&&array[i]>key;j--)
{
 array[j+1]=array[j];
}
array[j+1]=key;
}
}
public static void main(String [] args)
{
 Scanner in=new Scanner(System.in);
 System.out.println(“”Enter the no. Of data you want to enter”);
 int k=in.nextInt();
int array[] = new int[k];
System.out.println(“Enter the data”);
for(int i=0;i<k;i++)
{
 array[i]=in.nextInt();
}
insertionsort(array,k);
for(int i=0;i<k;i++)
{
 System.out.println(array[i] +“ ”);
}
}
}