package com.java.program.interview;

public class MinDiff {
	
	int ar[] = new int[] {10,5,20,98,99};
	int minval = 100;//Integer.MAX_VALUE;
	int maxval = 0;//Integer.MIN_VALUE;
	
	public int findMinDiff(int arr[]) {
		for(int i=0;i< arr.length-1; i++){
			for(int j=i+1;j<arr.length;j++) {
				if(Math.abs((arr[i] - arr[j])) < minval) {
					minval = Math.abs(arr[i] - arr[j]);
					System.out.println("minval="+minval);
				}
			}
		}
		return minval;
	}
	
	public int findMaxDiff(int arr[]) {
		for(int i=0;i< arr.length-1; i++){
			for(int j=i+1;j<arr.length;j++) {
				if(Math.abs((arr[i] - arr[j])) > maxval) {
					maxval = Math.abs(arr[i] - arr[j]);
					System.out.println("maxval="+maxval);
				}
			}
		}
		return maxval;
	}
	
	public static void main(String[] args) {
		MinDiff obj = new MinDiff();
		int mindiff = obj.findMinDiff(new int[] {5,1,9,8});
		System.out.println("MinDiff.main()="+mindiff);
		
		int maxdiff = obj.findMaxDiff(new int[] {5,1,9,8});
		System.out.println("MaxDiff.main()="+maxdiff);
	}

}
