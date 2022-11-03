package studio7;

public class hockeyPlayer {
	//instance variables
	
	private String lastName;
	private int jerseyNumber;
	private boolean isRightHandedShooter;
	private double height; 
	private int goalsScored; 
	
	
	public hockeyPlayer (String instLastName, int instJerseyNumber, boolean instIsRightHandedShooter, double instHeight) {
		lastName = instLastName;
		jerseyNumber = instJerseyNumber; 
		height = instHeight; 
		isRightHandedShooter = instIsRightHandedShooter; 
		goalsScored = 0; 
	}
	
	public hockeyPlayer () {
		lastName = "";
		jerseyNumber = 0; 
		isRightHandedShooter = true; 
		height = 6.0;
		goalsScored = 0; 
	}
	
	public String getLastName() {
		return lastName; 
	}
	
	public int getJerseyNumber() {
		return jerseyNumber; 
	}
	
	public void increaseGoal() {
		goalsScored++; 
	}
	
	
	
	
}
