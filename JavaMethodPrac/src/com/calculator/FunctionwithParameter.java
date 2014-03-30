package com.calculator;

public class FunctionwithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
       add(8,8);
       sub(20,9);
	}
	public static void add(int a,int b){
		int result=a+b;
		System.out.println("Result="+result);
	}
	public static void sub(int a,int b){
		int result=a-b;
		System.out.println("Result="+result);
	}

}
