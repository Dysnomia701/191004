import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("오늘은 불금 입니다.");
		// 시간이 있어서 영화를 보러 간다.
		boolean isTime = false;
		if(isTime = true) {
			System.out.println("영화를 보러간다.");
		} else {
			System.out.println("영화를 보러 갈 수 없다.");
		}
		
		Scanner sc = new Scanner(System.in); // 입력을 받기 위해서
		System.out.println("1번을 눌려보세요!");
		System.out.print("입력: ");
		// 스캐너로 키보드로 부터 숫자를 입력을 해보자
		int num = sc.nextInt(); // 키보드로 입력해서 엔터를 치기전까지 대기
		System.out.println("당신이 입력한 값은? " + num);
		if (num == 1) {
			System.out.println("잘했어요~");
		} else {
			System.out.println("똑바로 치라!!");
		}
		
		// 랜덤을 해보자!!
		Random rnd = new Random(); // 랜덤을 하기위한 변수 선언
		// 1~ 10 까지 숫자를 아무꺼나 하나 꺼내고 싶을때
		int rNum = rnd.nextInt(10) + 1; // 10개의 숫자
		System.out.println("1~ 10까지 중 아무숫자 : " + rNum);
		
		// 반복문
		// 1~10까지 화면에 출력
//		for (초기값; 비교값; 증가값) {
//			// 위 비교문이 참이면 여기{}안에 있는 문장을 반복
//		}
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자 반복 출력: " + (i+1));
			System.out.println("제갈량을 찾아간다.");
			if (i == 2) {
				System.out.println("제갈량은 우리와 함께 갑니다.");
			} else {
				System.out.println("아쉽지만 다음 기회에");
			}
		}
		// 길을 가다가 이쁜 여자 또는 잘생긴 남자를 봤다.
		// 1. 말을 건다. 2. 그냥 간다.
		// 여자(남자)가 쌩깐다. 받아준다.(랜덤)
		// 썡까면 또 말을 건다. (3번찍어서 안넘어가는 나무 없다.)
		// 받아주면 1번 이면 영화 보러 갈래요? 2번이면 밥무러 갈래요?
	}

}
