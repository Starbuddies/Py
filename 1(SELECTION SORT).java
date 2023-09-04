import java.util.Scanner;
import java.util.Random;
public class Select
{
public static void main(String args[])
{
int i, j, temp;
System.out.println("Enter the arraysize");
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[] arr= new int[500];
Random generator=new Random();
for( i=0;i<n;i++)
arr[i]=generator.nextInt(100);
System.out.println("Array before sorting");
for( i=0;i<n;i++)
System.out.println(arr[i]+" ");
long startTime=System.nanoTime();
for(i=0; i<=n-2; i++)
{
int min=i;
for(j=i+1; j<=n-1; j++)
{
if(arr[j] < arr[min])
min=j;
}
temp = arr[i];
arr[i] = arr[min];
arr[min] = temp;
}
long stopTime=System.nanoTime();
long elapseTime=(stopTime-startTime);
System.out.println("Time taken to sort array is:"+elapseTime+"nanoseconds");
System.out.println("Sorted array is");
for(i=0;i<n;i++)
System.out.println(arr[i]);
}
}
