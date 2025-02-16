package com.dsa.search;

public class InsertionSort {

	public static void main(String[] args) {
		int nums[] = {1,3,22,31,44,61,9};
		
		System.out.println("array before sorting is " );
		for(int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i]+ " ");
		}
		
		
		for(int i = 0; i<nums.length; i++)
		{
			int key = nums[i];
			int j = i-1;
			while(j>=0 && nums[j]>key)
			{
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
			
		}
		
		System.out.println();
		System.out.println("The array after sorting using min heap is ");
		for(int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i]+ " ");
		}
	}
}
