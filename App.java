package com.dagnachew.assignment3;

public class App {

	public static void main(String[] args) {
		
		//Solution for problem 1:
		
		int ages[] = {3,9,23,64,2,8,28,93};
		System.out.println("The result of question 1.a: " + (ages[ages.length-1]-ages[0]));
		int newAges[] = new int[ages.length+1];
		for(int i=0; i<ages.length; i++) {
			newAges[i] = ages[i];
		}
		newAges[ages.length] = 70;
		System.out.println("The result of question 1.b: " + (newAges[newAges.length-1]-newAges[0]));
		int sum = 0;
		for(int age : newAges) {
			sum += age;
		}
		System.out.println("The average of newAges array: " + sum/newAges.length);

		//Solution for problem 2:
		
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int letterTotal = 0;	
		for(int i=0; i<names.length; i++) {
				letterTotal += names[i].length();
		}
		System.out.println("The average number of letters per name: " + letterTotal/names.length);
			
		String concatenatedNames = "";
		for (String name : names) {
				concatenatedNames += name +" ";
		}
		System.out.println("Concatenated names: " + concatenatedNames);

		//Solution for problem 3:
			
			// by using the .length-1 method we can access the last element of any array.
				String lastElement = names[names.length-1];
				System.out.println("Accessing last element of names: " + lastElement);

		//Solution for problem 4:

			// by using the 0 for the index we can access the last element of any array.
				String firstElement = names[0];
				System.out.println("Accessing first element of names: " + firstElement);

		//Solution for problem 5:
				
		int nameLengths[] = new int[names.length];
		for(int i=0; i<names.length; i++) {
			nameLengths[i] = names[i].length();
		}

		//Solution for problem 6:			

		int letterSum = 0;
		for(int numberOfLetter : nameLengths) {
			letterSum += numberOfLetter;
		}
		System.out.println("The sum of all elements in nameLengths array: " + letterSum);
		
	}

	//Solution for problem 7:
	
	public static String concatenate(String word, int n) {
		String newString = "";
		for (int i=0; i<n; i++) {
		newString += word;
		}
		return newString;
	}

	//Solution for problem 8:
		
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	//Solution for problem 9:
		
	public static boolean isSumGreaterThan100(int array[]) {
		int sum = 0;
		for (int element:array) {
			sum += element;
		}
		return sum>100;
	}

	//Solution for problem 10:
		
	public static double calculateAverage(double array[]) {
		double sum = 0;
		for (double element:array) {
			sum += element;
		}
		return sum/array.length;
	}

	//Solution for problem 11:
	
	public static boolean isAverageOfArray1GreaterThanArray2(double array1[], double array2[]) {
		double sum1 = 0;
		for (double element:array1) {
			sum1 += element;
		}
		double sum2 = 0;
		for (double element:array2) {
			sum2 += element;
		}
		return sum1/array1.length > sum2/array2.length;
	}

	//Solution for problem 12:
		
	public static boolean willBuyDrik(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}

	//Solution for problem 13:
	
	//This method converts a given mass in Kilogram to a pound. 
	//I am familiar in the metric system of units and this method will help me convert to the American system.
	
	public static double convertKgToPound(double massInKg) {
		double ONE_KG_IN_POUND = 2.20462;
		return massInKg * ONE_KG_IN_POUND;
	}	
}
