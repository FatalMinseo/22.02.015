import java.util.ArrayList;
import java.util.Arrays;

public class Ex01_��̸���Ʈ {

	public static void main(String[] args) {

		// ArrayList

		int[] array = new int[5];
		array[0] = 10;

		// ArrayList ���� ���
		// ArrayList<Ÿ��> �̸� = new ArrayList<Ÿ��>();
		ArrayList<String> arrayList = new ArrayList<String>();

		// �� �߰�
		// �̸�.add("�� ��");
		arrayList.add("��ȯ");
		arrayList.add("����");
		arrayList.add("����");

		// ���ϴ� ��ġ�� �� �߰�! ������ �ƴ�
		// �̸�.add(�ε���, "�� ��");
		arrayList.add(1, "�°�");

		// ����
		// �̸�.set(�ε���, "�� ��")
		arrayList.set(2, "�μ�");

		// �� ����!
		// �̸�.remove(������ �ε���)
		arrayList.remove(arrayList.size() - 1);

		// arrayList ���
		// arrayList�� ũ�� -> size()
		for (int i = 0; i < arrayList.size(); i++) {
			// �� �������� -> �̸�.get(index)
			System.out.println(arrayList.get(i));
		}
	}
}
