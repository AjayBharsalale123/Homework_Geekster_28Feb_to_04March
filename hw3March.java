package hw_oop;

import java.util.Arrays;
import java.util.Scanner;

public class hw3March {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {2,7,9,11};
		int t=9;
		int p=10;
			System.out.println(Arrays.toString(twoSum(arr,t)));
			System.out.println(searchInsert(arr,p));
		

	}
	
//			Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//			You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//			You can return the answer in any order.
	
	 public static int[] twoSum(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] + nums[j] == target) {
	                    return new int[] { i, j };
	                }
	            }
	        }
	        return new int[]{};
	    }
	 
	 
	 public static int searchInsert(int[] a , int target)
	    {
	        int n = a.length;
	        for(int i = 0 ; i < n ; i++)
	        {
	            if(a[i] >= target)
	                return i;
	        }
	        return n;
	    }


}
