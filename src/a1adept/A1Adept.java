package a1adept;

import java.util.Scanner;

public class A1Adept {

	// Do not change the main method.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		process(s);

	}

	public static void process(Scanner s) {
		// Put your code here.
		// State how many assignments there are
		int numberOfAssignments = s.nextInt();
		// States how much each assignment is worth
		int a = 0;
		int sumOfPointsPerAssignment = 0;
		while (a < numberOfAssignments) {
			int PointsPerAssignment = s.nextInt();
			sumOfPointsPerAssignment = sumOfPointsPerAssignment + PointsPerAssignment;
			a++;
		}
		// states how many students
		int numberOfStudents = s.nextInt();
		double Assignment_Grade;
		double Recitation_Grade;
		// input for students
		for (int i = 0; i < numberOfStudents; i++) {
			String First_Name = s.next(), Last_Name = s.next();
			// number of recitations they attended
			int number_of_Recitations = s.nextInt();
			double Recitation_Percentage = number_of_Recitations / 15.0;

			// total amount of points received on the assignments
			double sumOfPoints = 0;
			for (int x = 0; x < numberOfAssignments; x++) {
				double points = s.nextDouble();
				sumOfPoints = sumOfPoints + points;
			}

			// in put other grades
			double Midterm_1 = s.nextDouble(), Midterm_2 = s.nextDouble(), Final_Exam = s.nextDouble();

			// calculate number grade for recitations

			if (Recitation_Percentage >= 0.95) {
				Recitation_Grade = 4.0;
			} else if (Recitation_Percentage >= 0.70) {
				Recitation_Grade = (10 * (Recitation_Percentage)) - 5.5;
			} else if (Recitation_Percentage >= 0.40) {
				Recitation_Grade = (5 * (Recitation_Percentage)) - 2;
			} else {
				Recitation_Grade = 0.0;
			}

			// calculated number grade for assignments
			if ((sumOfPoints / sumOfPointsPerAssignment) >= .95) {
				Assignment_Grade = 4.0;
			} else if ((sumOfPoints / sumOfPointsPerAssignment) >= .70) {
				Assignment_Grade = (10 * (sumOfPoints / sumOfPointsPerAssignment)) - 5.5;
			} else if ((sumOfPoints / sumOfPointsPerAssignment) >= .40) {
				Assignment_Grade = (5 * (sumOfPoints / sumOfPointsPerAssignment)) - 2;
			} else {
				Assignment_Grade = 0.0;
			}

			// calculate total grade number
			double NumberGrade = ((Assignment_Grade * 0.40) + (Recitation_Grade * 0.10) + (Midterm_1 * 0.15)
					+ (Midterm_2 * 0.15) + (Final_Exam * 0.20));

			// name initial
			char nameInitial = First_Name.charAt(0);

			// grade
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
				if ((1.15 <= NumberGrade) && (NumberGrade < 1.85)) {
					Grade = "C-";
				} else if ((1.85 <= NumberGrade) && (NumberGrade < 2.15)) {
					Grade = "C";
				} else {
					Grade = "C+";
				}
			} else if (NumberGrade >= 0.85) {
				if ((0.85 <= NumberGrade) && (NumberGrade < 1.15)) {
					Grade = "D";
				} else {
					Grade = "D+";
				}
			} else {
				Grade = "F";
			}

			System.out.println(" " + nameInitial + "." + " " + Last_Name + " " + Grade);
		}
	}
}
