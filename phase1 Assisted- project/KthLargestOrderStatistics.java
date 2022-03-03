package com;

//public class KthLargestOrderStatistics {
    import java.util.Scanner;
	 
	public class KthLargestOrderStatistics
	{
		 // iterative version
	    private static int KthLargestOrderStatistics(int[] array, int k, int first, int last)
	    {
	        int pivotPosition = partition(array, first, last);
	        while (pivotPosition != k - 1)
	        {
	            if (k - 1 < pivotPosition)
	            {
	                last = pivotPosition - 1;
	            }
	            else
	            {
	                first = pivotPosition + 1;
	            }
	            pivotPosition = Partition(array, first, last);
	        }
	        return array[k - 1];
	    }
	 
	    public static int kthSmallest(int[] array, int k)
	    {
	        return KthLargestOrderStatistics(array, k, 0, array.length - 1);
	    }
	 
	    public static int kthLargest(int[] array, int k)
	    {
	        return KthLargestOrderStatistics(array, array.length - k + 1, 0, array.length - 1);
	    }
	 
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of elements in the sequence: ");
	        int n = sc.nextInt();
	        int[] sequence = new int[n];
	        System.out.println("Enter the elements of the sequence: ");
	        for (int i = 0; i < sequence.length; i++)
	        {
	            sequence[i] = sc.nextInt();
	        }
	        System.out
	                .println("Enter the kth index to be returned as kth largest element of the sequence:");
	        int k = sc.nextInt();
	        System.out.println("Kth largest:" + kthLargest(sequence, k));
	        sc.close();
	    }
	}
