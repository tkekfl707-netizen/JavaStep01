package hello;

public class JavaStep01_증가감소연산자 {
public static void main(String[] args) {
	int gameScore = 150;  //게임에서 획득한 점수 150점
	
	int lastScore1 = ++gameScore; //gameScore에 1만큼 더한값을 lastScore 1에 대입
	System.out.println(lastScore1); //151을 출력
	
	int lastScore2 = --gameScore; //gameScore에서 1만큼 뺸 값을 lastScore2에 대입
	System.out.println(lastScore2);
}
}
