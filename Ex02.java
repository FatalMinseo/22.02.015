import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> arrayList = new ArrayList<String>();
		int i = 0;
		while (i != 4) {
			System.out.println("[1] 노래추가 [2] 노래삭제 [3] 노래검색 [4] 종료");
			System.out.print("실행시킬 메뉴 : ");
			i = sc.nextInt();
			if (i == 1) {
				System.out.print("추가할 노래 입력 >> ");
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
				System.out.print("삭제할 노래번호 입력 >> ");
				int b = sc.nextInt();
				arrayList.remove(b - 1);
				for (int j = 0; j < arrayList.size(); j++) {
					System.out.println((j + 1) + "." + arrayList.get(j));
					if (j == arrayList.size() - 1) {
						System.out.println("==============");
					}
				}
			} else if (i == 3) {
				System.out.print("선택할 노래제목 입력 >> ");
				String c = sc.next();
				for (int k = 0; k < arrayList.size(); k++) {
					if (arrayList.get(k).equals(c)) {
						System.out.println((k + 1) + "번째에 " + arrayList.get(k) + "이(가) 있습니다.");
					} else {
						System.out.println(c + "는 리스트에 없습니다.");
					}
				}
			} else if (i == 4) {
				System.out.println("시스템 종료");
				break;
			} else if (i != 1 || i != 2 || i != 3 || i != 4) {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
