package com.dsa.search;

public class BubbleSort {

	public static void main(String[] args) {
		int nums[] = {1,3,22,31,44,61,9};
		System.out.println("array before sorting is " );
		for(int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i]+ " ");
		}
		
		for(int i = 0; i<nums.length; i++) {
			for(int j = 0; j<nums.length-i-1;j++)
			{
				if(nums[j]>nums[j+1])
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("The array after sorting is ");
		for(int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i]+ " ");
		}
	}
}
