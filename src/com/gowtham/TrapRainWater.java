package com.gowtham;
//http://www.geeksforgeeks.org/trapping-rain-water/


//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

//For example, 
//Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.


public class TrapRainWater {
	
	public static void main(String[] args) {
		int a[] = {0,1,0,2,0,2};
		
		System.out.println("Rain Strap Water: " + trap(a));
	}

	public static int trap(int[] height) {

		int water = 0;

		int leftIndex = 0;
		int rightIndex = height.length - 1;

		int leftMax = 0;
		int rightMax = 0;

		while (leftIndex <= rightIndex) {

			leftMax = Math.max(leftMax, height[leftIndex]);
			rightMax = Math.max(rightMax, height[rightIndex]);

			if (leftMax < rightMax) {

				water += leftMax - height[leftIndex];
				leftIndex++;

			}

			else {

				water += rightMax - height[rightIndex];
				rightIndex--;

			}

		}

		return water;

	}

}
