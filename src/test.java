import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ���ٰ� �̻� ���� �Ǵ� �߻��� ���ڸ� �ô�.
		// 1. ���� �Ǵ�. 2. �׳� ����.
		// ����(����)�� �߱��. �޾��ش�.(����)
		// ����� �� ���� �Ǵ�. (3���� �ȳѾ�� ���� ����.)
		// �޾��ָ� 1�� �̸� ��ȭ ���� ������? 2���̸� �乫�� ������?

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("���� ���ٰ� �̻� ���� �Ǵ� �߻��� ���ڸ� �ô�.");
		System.out.println("1.���� �Ǵ�. 2.�׳� ����.");
		int num1 = sc.nextInt();
		if(num1 == 1) {
			for (int i = 0; i < 3; i++) {
				int rNum = rnd.nextInt(2);
				if(rNum == 0) {
					System.out.println((i+1) + "�� ���ô��ߴ�.");
				} else {
					System.out.println("�޾����.");
					System.out.println("1.��ȭ ���� ������? 2.������� ������?");
					int num2 = sc.nextInt();
					if(num2 == 1) {
						System.out.println("��ȭ ���� ������?");
					} else {
						System.out.println("������� ������?");
					}
					break;
				}
			}
		} else {
			System.out.println("�׳� ���� ����.");
		}
	}

}
