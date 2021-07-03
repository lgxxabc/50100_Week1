package Week1;

public class GradeAvg {

	public static void main(String[] args) {
		double quizScore1 = 87.5;
		double quizScore2 = 95.5;
		double quizScore3 = 98.0;
		double testScore1 = 92.3;
		double testScore2 = 97.7;
		double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3) / 3;
		double testScoreAvg = (testScore1 + testScore2) / 2;
		
		System.out.println("The average quiz score is: " + quizScoreAvg);
		System.out.println("The average test score is: " + testScoreAvg);	
	}
}
