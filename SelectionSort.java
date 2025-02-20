package com.dsa.search;

public class SelectionSort {

	public static void main(String[] args) {
		int nums[] = {1,3,22,31,44,61,9};
		System.out.println("array before sorting is " );
		for(int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i]+ " ");
		}
		// Using Max heap
		for(int i = nums.length-1; i>=0; i--)
		{
			int maxIndex = i;
			for( int j = 0; j<i;j++)
			{
				if(nums[maxIndex] < nums[j])
				{
					maxIndex = j;
				}
			}
			int temp = nums[maxIndex];
			nums[maxIndex]  = nums[i];
			nums[i] = temp;
			
		}
		System.out.println();
		
		System.out.println("The array after sorting using max heap is is ");
		for(int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i]+ " ");
		}
		
		// Using min heap 
		
		for(int i = 0; i<nums.length; i++)
		{
			int minIndex = i;
			for( int j = i+1; j<nums.length;j++)
			{
				if(nums[minIndex] > nums[j])
				{
					minIndex = j;
				}
			}
			int temp = nums[minIndex];
			nums[minIndex]  = nums[i];
			nums[i] = temp;
			
		}
		System.out.println();
		
		System.out.println("The array after sorting using min heap is ");
		for(int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i]+ " ");
		}
	}
}
