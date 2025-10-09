package hello;

public class D2_JavaStep06_break문없는SwitchCase {
public static void main(String[] args) {
	String medal = "Gold";
	
	switch(medal) {
	case "Gold" -> System.out.println("금메달입니다");
	case "Siver" -> System.out.println("은메달입니다.");
	case "bronze" -> System.out.println("동메달입니다.");
	default -> System.out.println("메달이없습니다.");
	}
}
}
