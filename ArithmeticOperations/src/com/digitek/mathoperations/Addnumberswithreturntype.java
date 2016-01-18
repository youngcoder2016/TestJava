package com.digitek.mathoperations;

public class Addnumberswithreturntype {
	

		
		public static int addNumbersWithReurnType(){
			int a = 15;
			int b = 10;
			int c = a+b;
			System.out.println("Result from addition with return type :" + c);
			
			return c;
		}

		public static void multiplication()  {
			
			int result = 10* addNumbersWithReurnType();
			System.out.println("Result from multiplication :" + result);
		}
		
		public static void main(String args[]){
			
		
			multiplication();
			
		}
	}


