package SkillBuilders;

public class GradeConverter {
	//Signature of a method
	public static boolean isValidNumber(int userNum, int minNum, int maxNum) {
		if(minNum <= userNum && userNum <= maxNum) return(true);
		else return(false);
	}
	
	public static String getLetterGrade(int numGrade) {
		if(numGrade < 60) return("F");
		
		else if(numGrade < 70)
		if(numGrade == 69) return ("D+");
		else return("D");
		
		else if(numGrade < 80)
		if (numGrade == 79) return("C+");
		else return("C");
		
		else if(numGrade < 90)
		if (numGrade == 89) return("B+");
		else return("B");
		
		else if(numGrade < 100)
		return("A");
		else return("A+");
		} 
	}