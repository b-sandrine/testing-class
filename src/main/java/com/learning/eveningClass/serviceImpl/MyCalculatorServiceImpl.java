package com.learning.eveningClass.serviceImpl;

import com.learning.eveningClass.service.MyCalculatorService;

public class MyCalculatorServiceImpl implements MyCalculatorService{

	@Override
	public int add(int[] data) {
		int sum = 0;
		for(int num:data) {
			sum +=num; 
		}
		return sum;
	}

	@Override
	public int subtract(int num1, int num2) {
		
		return num1-num2;
	}

	@Override
	public int multiply(int[] data) {
		int prod=1;
		for(int num:data) {
			prod = prod*num;
		}
		return prod;
	}

	
}
