import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 길을 가다가 이쁜 여자 또는 잘생긴 남자를 봤다.
		// 1. 말을 건다. 2. 그냥 간다.
		// 여자(남자)가 쌩깐다. 받아준다.(랜덤)
		// 썡까면 또 말을 건다. (3번찍어서 안넘어가는 나무 없다.)
		// 받아주면 1번 이면 영화 보러 갈래요? 2번이면 밥무러 갈래요?

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("길을 가다가 이쁜 여자 또는 잘생긴 남자를 봤다.");
		System.out.println("1.말을 건다. 2.그냥 간다.");
		int num1 = sc.nextInt();
		if(num1 == 1) {
			for (int i = 0; i < 3; i++) {
				int rNum = rnd.nextInt(2);
				if(rNum == 0) {
					System.out.println((i+1) + "번 무시당했다.");
				} else {
					System.out.println("받아줬다.");
					System.out.println("1.영화 보러 갈래요? 2.밥먹으러 갈래요?");
					int num2 = sc.nextInt();
					if(num2 == 1) {
						System.out.println("영화 보러 갈래요?");
					} else {
						System.out.println("밥먹으러 갈래요?");
					}
					break;
				}
			}
		} else {
			System.out.println("그냥 집에 간다.");
		}
	}

}
