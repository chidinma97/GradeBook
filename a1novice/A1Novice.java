package a1novice;

import java.util.Scanner;

public class A1Novice {

	// Do not change the main method.	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		process(s);
	}
	
	public static void process(Scanner s) {
		// Put your code here.
		// declares number of students in the class
				int numberOfStudents = s.nextInt();

				// loops for the number of students in the class
				for (int c = 0; c < numberOfStudents; c++) {

					// input data
					String First_Name = s.next(), Last_Name = s.next();
					double Assignment_Grade = s.nextDouble(), Recitation_Grade = s.nextDouble(), Midterm_1 = s.nextDouble(),
							Midterm_2 = s.nextDouble(), Final_Exam = s.nextDouble();

					// calculates the number grade
					double NumberGrade = ((Assignment_Grade * 0.40) + (Recitation_Grade * 0.10) + (Midterm_1 * 0.15)
							+ (Midterm_2 * 0.15) + (Final_Exam * 0.20));

					// find the first letter of the first name
					char nameInitial = First_Name.charAt(0);

					// converts the number grade into a letter grade
					String Grade;
					if (NumberGrade >= 3.5) {
						if ((3.5 <= NumberGrade) && (NumberGrade < 3.85)) {
							Grade = "A-";
						} else {
							Grade = "A";
						}
					} else if (NumberGrade >= 2.5) {
						if ((2.5 <= NumberGrade) && (NumberGrade < 2.85)) {
							Grade = "B-";
						} else if ((2.85 <= NumberGrade) && (NumberGrade < 3.15)) {
							Grade = "B";
						} else {
							Grade = "B+";
						}
					} else if (NumberGrade >= 1.5) {
						if ((1.5 <= NumberGrade) && (NumberGrade < 1.85)) {
							Grade = "C-";
						} else if ((1.85 <= NumberGrade) && (NumberGrade < 2.15)) {
							Grade = "C";
						} else {
							Grade = "C+";
						}
					} else if (NumberGrade >= 0.85) {
						if ((1.15 <= NumberGrade) && (NumberGrade < 1.5)) {
							Grade = "D+";
						} else {
							Grade = "D";
						}
					} else {
						Grade = "F";
					}
					
					// Output the first name initial, last name, and grade
					//System.out.println(Assignment_Grade + " " + Recitation_Grade + " " + Midterm_1 + " " + Midterm_2 + " " + Final_Exam);
					System.out.println(nameInitial + "." + " " + Last_Name + " " + Grade);
				}
	}	
}
