package com.calculator;

public class Subtrac {
	public static void main(String []args){
		int a=add(2,2)+20;
		System.out.println(a);
		
		int d=add(5,5)-20;
		System.out.println(d);
		
		int r=d*100;
		System.out.println(r);
		
	}
		public static int add(int a,int b){
			int result=a+b;
			System.out.println("Result="+result);
			return result;
		}
		public static int sub(int a,int b){
			int result=a-b;
			System.out.println("Result="+result);
			return result;
		}
		
		public static void multi(int q,int w,int r, int e){
			int h=q*e*w;
		System.out.println(h);
		
		}
		

}
