import java.util.*;
class subset
{
	public static void main(String args[])
	{
		
	    System.out.println("Enter 1st array lim");
		Scanner in=new Scanner(System.in);
		String s1="";
		String s2="";
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array1 values");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			s1=s1+String.valueOf(a[i]);
		}
		System.out.println("Enter 2nd array lim");
		int n1=in.nextInt();
		int[] a1=new int[n1];
		System.out.println("Enter array2 values");
		for(int i=0;i<n1;i++)
		{
			a1[i]=in.nextInt();
			s2=s2+String.valueOf(a1[i]);
		}
		if(s2.contains(s1))
		{
			System.out.println("a1 is a SUBSET of a2");
		}
		else
		{
			System.out.println("a1 is not a SUBSET OF a2");
		}
		
	}
}
