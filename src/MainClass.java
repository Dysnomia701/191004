import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �ұ� �Դϴ�.");
		// �ð��� �־ ��ȭ�� ���� ����.
		boolean isTime = false;
		if(isTime = true) {
			System.out.println("��ȭ�� ��������.");
		} else {
			System.out.println("��ȭ�� ���� �� �� ����.");
		}
		
		Scanner sc = new Scanner(System.in); // �Է��� �ޱ� ���ؼ�
		System.out.println("1���� ����������!");
		System.out.print("�Է�: ");
		// ��ĳ�ʷ� Ű����� ���� ���ڸ� �Է��� �غ���
		int num = sc.nextInt(); // Ű����� �Է��ؼ� ���͸� ġ�������� ���
		System.out.println("����� �Է��� ����? " + num);
		if (num == 1) {
			System.out.println("���߾��~");
		} else {
			System.out.println("�ȹٷ� ġ��!!");
		}
		
		// ������ �غ���!!
		Random rnd = new Random(); // ������ �ϱ����� ���� ����
		// 1~ 10 ���� ���ڸ� �ƹ����� �ϳ� ������ ������
		int rNum = rnd.nextInt(10) + 1; // 10���� ����
		System.out.println("1~ 10���� �� �ƹ����� : " + rNum);
		
		// �ݺ���
		// 1~10���� ȭ�鿡 ���
//		for (�ʱⰪ; �񱳰�; ������) {
//			// �� �񱳹��� ���̸� ����{}�ȿ� �ִ� ������ �ݺ�
//		}
		for (int i = 0; i < 10; i++) {
			System.out.println("���� �ݺ� ���: " + (i+1));
			System.out.println("�������� ã�ư���.");
			if (i == 2) {
				System.out.println("�������� �츮�� �Բ� ���ϴ�.");
			} else {
				System.out.println("�ƽ����� ���� ��ȸ��");
			}
		}
		// ���� ���ٰ� �̻� ���� �Ǵ� �߻��� ���ڸ� �ô�.
		// 1. ���� �Ǵ�. 2. �׳� ����.
		// ����(����)�� �߱��. �޾��ش�.(����)
		// ����� �� ���� �Ǵ�. (3���� �ȳѾ�� ���� ����.)
		// �޾��ָ� 1�� �̸� ��ȭ ���� ������? 2���̸� �乫�� ������?
	}

}
