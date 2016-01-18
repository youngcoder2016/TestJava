package com.digitek.mathoperations;

public class Addnumberswithreturnandparamers {
		
		public static int addNumbersWithReurnTypeAndAcceptParameters(int a ,int b){

			int c = a+b;
			System.out.println("Result from addition with return type w parameters :" + c);
			
			return c;
		}

	
		
		public static void main(String args[]){
			int result1 = addNumbersWithReurnTypeAndAcceptParameters(10, 15);
			int result2 = addNumbersWithReurnTypeAndAcceptParameters(40, 60);
			int result3 = addNumbersWithReurnTypeAndAcceptParameters(20, 30);
		}
			
		

}
