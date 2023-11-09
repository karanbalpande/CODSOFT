import java.util.*;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the student's name: ");
	    String name = scanner.nextLine();
	    System.out.print("Enter the student's age: ");
	    int age = scanner.nextInt();
	    System.out.print("Enter the student's grade in math: ");
	    int mathGrade = scanner.nextInt();
	    System.out.print("Enter the student's grade in science: ");
	    int scienceGrade = scanner.nextInt();
	    System.out.print("Enter the student's grade in English: ");
	    int englishGrade = scanner.nextInt();
	    int totalGrade = mathGrade + scienceGrade + englishGrade;
	    float averageGrade = (float)totalGrade / 3;
	    String grade;
	    if (averageGrade >= 90) {
	      grade = "A";
	    } else if (averageGrade >= 80) {
	      grade = "B";
	    } else if (averageGrade >= 70) {
	      grade = "C";
	    } else if (averageGrade >= 60) {
	      grade = "D";
	    } else {
	      grade = "F";
	    }
	    System.out.println("The student's name is " + name + ".");
	    System.out.println("The student's age is " + age + ".");
	    System.out.println("The student's average grade is " + averageGrade + ".");
	    System.out.println("The student's grade is " + grade + ".");
	  }
	

	}