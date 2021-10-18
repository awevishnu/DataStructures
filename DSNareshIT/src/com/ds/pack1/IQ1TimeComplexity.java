package com.ds.pack1;
import java.util.*;
class IQ1TimeComplexity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements to be inserted into an array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter "+n+" array elements:");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        IQ1TimeComplexity obj = new IQ1TimeComplexity();
        obj.SPOfArray(a);
    }
    void SPOfArray(int a[])
    {
        int sum=0;
        int product=1;
        for(int i=0;i<a.length;i++)
        {
            sum = sum+a[i]; //sum+=a[i]
        }
		/*
		for(int x:a)
		{
		    sum = sum+x;
		}
		*/
        for(int i=0;i<a.length;i++)
        {
            product = product*a[i];
        }
        System.out.println("Sum of array elements="+sum);
        System.out.println("Product of array elements="+product);
    }
}
/*Timecomplexity:1+1+n+1+n+1+1+1 = 2n+6 = highest degree = 1
        O(n)
        Space complexity:n+1+1+1+1 = n+4 = O(n)

 */
