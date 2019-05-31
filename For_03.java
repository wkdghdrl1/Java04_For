package com.biz.for_each;

public class For_03 {
	
	public static void main(String[] args) {
		
		/*int intSum = 0;
		int intE = 1;
		intSum = intSum + intE; // 1
		
		intE++; // 2
		intSum = intSum + intE; // 1 + 2
		
		intE++; // 3
		intSum = intSum + intE; // 1 + 2 + 3

	
	

		
		for(int i = 1; i <10; i++){
			System.out.println(i);
			intSum = intSum + i;
			
		}
		System.out.println(intSum);*/
		
		int sum = 0;
		for(int i = 2; i <= 10; i+=2) {
			
			sum = sum + i;
			System.out.println("짝수의 합 : " + sum);
					
		}
		
		sum = 0;
		for(int i = 1; i <= 10; i+=2) {
			
			sum = sum + i;
			System.out.println("홀수의 합 : " + sum);
					
		}
		
		for(int i = 1; i < 100; i++) {
			for(long j = 1; j < 1000000000l; j++);
				System.out.println(i);
			}
		
		
		
		}

	
	}
	
	
	

