import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrayList = new ArrayList<String>();
		int i = 0;
		while (i != 4) {
			System.out.println("[1] �뷡�߰� [2] �뷡���� [3] �뷡�˻� [4] ����");
			System.out.print("�����ų �޴� : ");
			i = sc.nextInt();
			if (i == 1) {
				System.out.print("�߰��� �뷡 �Է� >> ");
				String a = sc.next();
				arrayList.add(a);
				System.out.println("=====List=====");
				for (int j = 0; j < arrayList.size(); j++) {
					System.out.println((j + 1) + "." + arrayList.get(j));
					if (j == arrayList.size() - 1) {
						System.out.println("==============");
					}
				}
			} else if (i == 2) {
				System.out.print("������ �뷡��ȣ �Է� >> ");
				int b = sc.nextInt();
				arrayList.remove(b - 1);
				for (int j = 0; j < arrayList.size(); j++) {
					System.out.println((j + 1) + "." + arrayList.get(j));
					if (j == arrayList.size() - 1) {
						System.out.println("==============");
					}
				}
			} else if (i == 3) {
				System.out.print("������ �뷡���� �Է� >> ");
				String c = sc.next();
				for (int k = 0; k < arrayList.size(); k++) {
					if (arrayList.get(k).equals(c)) {
						System.out.println((k + 1) + "��°�� " + arrayList.get(k) + "��(��) �ֽ��ϴ�.");
					} else {
						System.out.println(c + "�� ����Ʈ�� �����ϴ�.");
					}
				}
			} else if (i == 4) {
				System.out.println("�ý��� ����");
				break;
			} else if (i != 1 || i != 2 || i != 3 || i != 4) {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}
}
