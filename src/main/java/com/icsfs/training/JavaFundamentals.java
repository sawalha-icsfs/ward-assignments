package com.icsfs.training;

import java.util.List;
import java.util.Scanner;

import com.icsfs.training.util.CalculatorUtils;

//Day 2 Practice: Fundamentals
public class JavaFundamentals {

	private static CalculatorUtils calculatorUtils = new CalculatorUtils();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int arraysize = scanInput();
		int[] numbers;

		while (true) {

			if (calculatorUtils.validateInputNumber(arraysize)) {
				numbers = calculatorUtils.generateRandomNumbers(arraysize);
				input.close();
				break;
			}

			arraysize = scanInput();
		}
		
		/**** Calculate and Print ****/
		int sum = calculatorUtils.arraySum(numbers);
		System.out.println("Sum of all the array items: " + sum);

		int avg = calculatorUtils.arrayAvg(sum, arraysize);
		System.out.println("Average of all the array items: " + avg);

		List<Integer> threeMostFreq = calculatorUtils.arrayFrequentNum(numbers);
		System.out.println("Most frequent three numbers: " + threeMostFreq);
	}

	private static int scanInput() {
		System.out.println("Please enter array size  more than " + calculatorUtils.validationValue + ": ");
		return input.nextInt();
	}

}
