package Chapter_04;

import java.util.Scanner;

public class GradeBook {

		private String courseName; // name of the course this GradeBook represents 
		
		// constructor initializes courseName 
		public GradeBook(String name)
		{
			courseName = name; // initializes courseName
		}// end constructor 
		
		// method to set the course name
		public void setCourseName( String name )
		{
			courseName = name; 
		}// end method setCourseName
		
		// method to retrieve the course name
		public String getCourseName()
		{
			return courseName; 
		}// end method getCourseName
	
		// display a welcome message to the GradeBook user
		public void displayMessage()
		{
			// getCounseName gets the name of the course 
			System.out.printf("Welcome to the grade book for\n%s!\n\n", getCourseName()); 
		}// end method displayMessage
		
		// determine class average based on 10 grades entered by user 
		public void determineClassAverage()
		{
			// create Scanner to obtain input from comment window 
			Scanner input = new Scanner(System.in); 
			
			int total; // sum of grades entered by user
			int gradeCounter; // number of the grade to be entered next 
			int grade; // grade value entered by user 
			double average; // number with decimal point for average 
			
			// Initialization phase 
			total = 0; // initialized total
			gradeCounter = 0; // initialized loop counter 
			
			// processing phase 
			// prompt for input and read grade from user
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
			
			// loop until sentinel value read from user 
			while( grade != -1 ) // loop 10 times 
			{
				total = total + grade; 				// add grade to total 
				gradeCounter = gradeCounter + 1; 	// Increment counter by 1 
				
				// prompt for input and read next grade from user 
				System.out.print("Enter grade or -1 to quit: "); 	// prompt 
				grade = input.nextInt(); 			// input next grade
			}// end while
			
			// termination phase 
			// if user entered at least one grade...
			if( gradeCounter != 0 )
			{
				// calculate average of all grades entered
				average = (double) total / gradeCounter; 
			
			// display total and average (with two digits of precision)
			System.out.printf("\nTotal of all %d grades is %d\n", gradeCounter, total); 
			System.out.printf("Class average is %.2f\n", average);
			}
			else
			{
				System.out.println("No grades were entered");
			}
		} // end method determineClassAveage		
}// end class GradeBook 
