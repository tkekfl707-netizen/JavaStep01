package hello02;

public class Student04 {//참조 자료형 변수의 인스턴스 생성하기
	int studentID; // 기본 자료형(int)
	String studentName; //String(참조 자료형)
	Subject01 korean; // 참초 자료형(Subject01)
	Subject01 math; // 참초 자료형(Subject01)
	
	public Student04(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject01();
		math = new Subject01();
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "님의" + korean.getSubjectName() + "과목의 점수는" 
				+ korean.getScorePoint() + "점이며 " + math.getSubjectName() + "과목의 점수는"
						+ math.getScorePoint() + "점입니다.");
	}
	
	public void setKoreanSubject(String subjectName, int score) {
		korean.setSubjectName(subjectName);
		korean.setScorePoint(score);
	}
	
	public void setMathSubject(String subjectName, int score) {
		math.setSubjectName(subjectName);
		math.setScorePoint(score);
	}
}
