/**
 * This program prompts the user to enter 4 test scores for each of
 * 3 students and subsequently outputs various information such as
 * minimum and maximum test score, average, and letter grade about
 * each student.
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Record/calculate info about Student #1
		System.out.println("Student #1:");
		System.out.print("Enter the 4 test scores for Student #1, each separated"
				+ " by a space: ");
		int score1Student1 = input.nextInt();
		int score2Student1 = input.nextInt();
		int score3Student1 = input.nextInt();
		int score4Student1 = input.nextInt();
		
		int minStudent1 = minimum(score1Student1, score2Student1,
				score3Student1, score4Student1);
		int maxStudent1 = maximum(score1Student1, score2Student1,
				score3Student1, score4Student1);
		double averageStudent1 = calculateAverage(score1Student1, score2Student1,
				score3Student1, score4Student1);
		String letterGradeStudent1 = letterGrade(averageStudent1);
		
		
		// Record/calculate info about Student #3
		System.out.println("\nStudent #2:");
		System.out.print("Enter the 4 test scores for Student #2, each separated"
				+ " by a space: ");
		int score1Student2 = input.nextInt();
		int score2Student2 = input.nextInt();
		int score3Student2 = input.nextInt();
		int score4Student2 = input.nextInt();
		
		int minStudent2 = minimum(score1Student2, score2Student2,
				score3Student2, score4Student2);
		int maxStudent2 = maximum(score1Student2, score2Student2,
				score3Student2, score4Student2);
		double averageStudent2 = calculateAverage(score1Student2, score2Student2,
				score3Student2, score4Student2);
		String letterGradeStudent2 = letterGrade(averageStudent2);
		
		
		// Record/calculate info about Student #3
		System.out.println("\nStudent #3:");
		System.out.print("Enter the 4 test scores for Student #3, each separated"
				+ " by a space: ");
		int score1Student3 = input.nextInt();
		int score2Student3 = input.nextInt();
		int score3Student3 = input.nextInt();
		int score4Student3 = input.nextInt();
		
		int minStudent3 = minimum(score1Student3, score2Student3,
				score3Student3, score4Student3);
		int maxStudent3 = maximum(score1Student3, score2Student3,
				score3Student3, score4Student3);
		double averageStudent3 = calculateAverage(score1Student3, score2Student3,
				score3Student3, score4Student3);
		String letterGradeStudent3 = letterGrade(averageStudent3);
		
		
		// Print info about Student #1
		System.out.println("\n\nStudent #1:\nMinimum Test Score: " + minStudent1
				+ "\nMaximum Test Score: " + maxStudent1 + "\nAverage "
				+ "of Test Scores: " + averageStudent1
				+ "\nLetter Grade: " + letterGradeStudent1 + "\n\n");
		
		// Print info about Student #2
		System.out.println("Student #2:\nMinimum Test Score: " + minStudent2
				+ "\nMaximum Test Score: " + maxStudent2 + "\nAverage "
				+ "of Test Scores: " + averageStudent2
				+ "\nLetter Grade: " + letterGradeStudent2 + "\n\n");
		
		// Print info about Student #3
		System.out.println("Student #3:\nMinimum Test Score: " + minStudent3
				+ "\nMaximum Test Score: " + maxStudent3 + "\nAverage "
				+ "of Test Scores: " + averageStudent3
				+ "\nLetter Grade: " + letterGradeStudent3);
		
	}
	
	/*
	  The method minimum() determines the minimum value of four numbers.
	  
	  Pre-Conditions: Each number, 'num1', 'num2', 'num3', and 'num4' must be an
	  				  integer or be able to be cast into a integer by Java.
	                  
	  Post-Conditions: The minimum integer value of the four values is
	  				   returned.
	*/
	public static int minimum(int num1, int num2, int num3, int num4) {
		
		int min = Math.min(num1, num2);
		min = Math.min(min, num3);
		min = Math.min(min, num4);
		return min;
	
	}
	
	/*
	  The method maximum() determines the maximum value of four numbers.
	  
	  Pre-Conditions: Each number, 'num1', 'num2', 'num3', and 'num4' must be an
	  				  integer or be able to be cast into a integer by Java.
	                  
	  Post-Conditions: The maximum integer value of the four values is
	  				   returned.
	*/
	public static int maximum(int num1, int num2, int num3, int num4) {
		
		int max = Math.max(num1, num2);
		max = Math.max(max, num3);
		max = Math.max(max, num4);
		return max;
	
	}
	
	/*
	  The method calculateAverage() calculated the average of 4 doubles.
	  
	  Pre-Conditions: Each number, 'num1', 'num2', 'num3', and 'num4' must be a
	  				  double or be able to be cast into a double by Java.
	                  
	  Post-Conditions: The average of the 4 doubles is
	  				   returned rounded to the nearest tenth.
	*/
	public static double calculateAverage(double num1, double num2, double num3, double num4) {
		
		double average = (num1 + num2 + num3 + num4) / 4.0;
		average = (Math.round(average * 10.0)) / 10.0;
		return average;
	
	}
	
	/*
	  The method letterGrade() determines the letter grade based on an average
	  rounded to the nearest integer.
	  
	  Pre-Conditions: 'average' must be a double or be able to be cast into a
	  				  double by Java.
	                  
	  Post-Conditions: A String object containing the letter grade is returned.
	  				   double average = 87.4 --> B
	*/
	public static String letterGrade(double average) {
		
		average = Math.round(average);
		if (average >= 90) {
			return "A";
		}
		else if (average >= 80) {
			return "B";
		}
		else if (average >= 70) {
			return "C";
		}
		else if (average >= 65) {
			return "D";
		}
		else {
			return "F";
		}
		
	}

}
