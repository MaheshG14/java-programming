package com.examplelogics;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 11;
		boolean isPrime = true;

		if (a <= 1) {
			isPrime = false;
		}

		for (int i = 2; i <= Math.sqrt(a); i++) {
			if(a%i ==0) {
				isPrime = false;
			}

		}
		if (isPrime) {
			System.out.println("Primenumber");

		} else {
			System.out.println("Not a prime number");
		}

	}

}
