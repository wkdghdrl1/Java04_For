package com.biz.for_each;

public class For_04 {

	public static void main(String[] args) {
			
		
		int intF = 100;
		int intFS = 1;
		//팩토리얼 공식
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			intFS *= i;
		}
		System.out.println(intFS);
	}

}
