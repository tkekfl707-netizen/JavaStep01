package hello02;

public class Student04 {//참조 자료형 변수의 인스턴스 생성하기
	int studentID; // 기본 자료형(int)
	String studentName; //String(참조 자료형)
	Subject01 korean; // 참초 자료형(Subject01)
	Subject01 math; // 참초 자료형(Subject01)
	// 객체의 주소값을 저장하고, 그 객체를 통해 점수와 과목명을 저장/조회 가능
	
	public Student04(int studentID, String studentName) {
		this.studentID = studentID; // 현재 객체의 studentID에 매개변수 값을 대입
		this.studentName = studentName; // 현재 객체의 studentName에 매개변수 값을 대입
		
		korean = new Subject01(); //중요: 여기서 korean = new Subject01(); -> Subject01 객체를 새로 생성
		math = new Subject01();   //-> 각 학생마다 독립적인 과목 객체를 갖게됨
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
