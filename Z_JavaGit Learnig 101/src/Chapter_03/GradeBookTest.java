package Chapter_03;

import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		
		// create GrabeBook object
		GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming"); 
		GradeBook gradeBook2 = new GradeBook("CS102 Data Structures in Java"); 
		
		// display initial value of the courseName for each GradeBook
		System.out.printf("gradeBook1 course name is: %s\n", gradeBook1.getCourseName()); 
		System.out.printf("gradeBook2 course name is: %s\n", gradeBook2.getCourseName()); 
		
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in); 
		
		// create a GradeBook object and assign it to the myGradebook 
		GradeBook myGradeBook = new GradeBook(); 
		
		System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());
		
		// prompt for and input course name 
		System.out.println(" Please enter the course name:");
		String theName = input.nextLine(); // read a line of text  
		myGradeBook.setCourseName(theName); // set the course name
		System.out.println(); // output a blank line  
		
		// call myGradeBook's displayMessage method
		// and pass nameOfCourse as an argument 
		myGradeBook.displayMessage();

	}// end of main 
}// end class GradeBookTest
