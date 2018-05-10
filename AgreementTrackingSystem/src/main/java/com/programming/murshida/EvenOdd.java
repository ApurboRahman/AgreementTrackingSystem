package com.programming.murshida;

public class EvenOdd {
	
	public static void main(String[] args) {
         
		
		
		EvenOdd e = new EvenOdd();
		e.numberCheck(-60);
		 checkEvenOdd(0);
		 findingsLargestThreeNum();
		leapYearCheck(2100);

	}
	
	 public void numberCheck(int givenNum){
		int num = 0;
		 if(givenNum>num){
			System.out.println("The given number is positive."); 
		 }else {
			 System.out.println("The given number is negative.");
		 }
		
		
	}

	public static void checkEvenOdd(int givenNum) {
		int num = 2;
		if (givenNum % num == 0) {
			System.out.println("The given number is even.");
		} else {
			System.out.println("The number is odd");
		}
	}

	public static void findingsLargestThreeNum() {
		int num1 = 100;
		int num2 = 12;
		int num3 = 10;

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("The largest number is num1= " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("The largest number is num2= " + num2);
		} else {
			System.out.println("The largest number is num3= " + num3);

		}
	}

	public static void leapYearCheck(int givenYear) {
		if (givenYear % 400 == 0) {
			 System.out.println("The given year " + givenYear+ " is leap Year1st");
		}else if (givenYear % 4 == 0 && givenYear % 100 != 0) {

				System.out.println("The given year " + givenYear + " is leap Year2nd");

			} else {
				System.out.println("The given year " + givenYear + " is not leap Year");

			}
		}
	
	

}
