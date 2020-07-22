package com.java.program.interview;

public class StringReverse {
	
	String str = "Hello Java";
	String revstr = "";
	
	public String findRevString(String str) {
		for(int i=str.length() - 1;i>=0 ; i--){
			revstr += str.charAt(i);
		}
		return revstr;
	}
	
	public static void main(String[] args) {
		StringReverse obj = new StringReverse();
		String rstr = obj.findRevString("Java");
		System.out.println("StringReverse.main() rstr="+rstr);
		
	}

}
