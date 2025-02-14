package com.dsa.search;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,6,9};
		Scanner s  = new Scanner(System.in);
		int target = s.nextInt();
		int result = binarySearch(nums,target);
		if(result ==-1) {
			System.out.println("The requested number is not found");
		} else {
			System.out.println("The target number is found at index " + result);
		}
	}

	private static int binarySearch(int[] nums, int target) {
		int n = nums.length;
		int left = nums[0];
		int right = nums[n-1];
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(nums[mid]==target)
			{
				return mid;
			}
			else if (nums[mid]>target) {
				right = mid-1;
			} else {
				left = mid +1;
			}
		}
		return -1;
	}
}
