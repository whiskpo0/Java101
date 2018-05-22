package Chapter_03;

public class GradeBook {

	private String courseName; // course name for this GradeBook

	// constructor initializes courseName without an argument 
	public GradeBook() // constructor name is class name
	{
		// left blank
	}// end constructor 
	
	// constructor initializes courseName with String argument 
	public GradeBook(String name) // constructor name is class name
	{
		courseName = name; // initialized courseName
	}// end constructor 
	
	// method to set the course name 
	public void setCourseName(String name)
	{
	
		courseName = name; // store the course name
	
	}// end method setCourseName 
	
	// method to retrieve the course name 
	public String getCourseName()
	{
		
		return courseName; 
	}// end method getCourseName
	
	// display a welcome message to the GradeBook user
	public void displayMessage()
	{
		// call getCourseName to get the name of 
		// the course this GradeBook represents 
		System.out.printf("Welcome to the Grade Book for \n%s!\n", getCourseName());
		
	}// end method displayMessage	
}// end class GradeBookk
