package com.dsa.search;
import java.util.Scanner;

public class LinearSearchDSA {

	public static void main(String[] args) {
		int nums[] = {1,3,2,5,2,7,4,8};
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number you wants to search");
		
		int target = s.nextInt();
		int result = linearSearch(nums, target);
		if(result == -1)
		{
			System.out.println("The target is not found");
		}
		else
		{
			System.out.println("number found at the index "+ result);
		}
	}

	private static int linearSearch(int[] nums, int target) {
		for(int i =0; i<nums.length; i++)
		{
			if(nums[i]==target)
			{
				return i;
			}
		}
		
		return -1;
	}

}
