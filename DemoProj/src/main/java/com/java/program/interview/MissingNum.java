package com.java.program.interview;

public class MissingNum {
	
	int ar[] = new int[] {10,5,20,98,99};
	
	public int findMissingNum(int arr[]) {
		int sum = 0;
		int n = arr.length;
		int total = (n+1)* (n+2)/2;
		System.out.println("MissingNum.findMissingNum() total="+total);
		for(int i=0;i< arr.length; i++){
			sum = sum+arr[i];
			}
		return (total-sum);
	}
	
	
	public static void main(String[] args) {
		MissingNum obj = new MissingNum();
		int missnum = obj.findMissingNum(new int[] {1,2,4,5});
		System.out.println("MissingNum.main() missnum="+missnum);
		
		int missnum1 = obj.findMissingNum(new int[] {1,2,3,5});
		System.out.println("MissingNum.main() missnum="+missnum1);
		
		
	}

}
