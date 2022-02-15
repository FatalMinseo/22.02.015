import java.util.Scanner;

public class Ex03_선택정렬 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 선택정렬
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int minI = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					minI = j;
					min = arr[j];
				}
			}
			int temp =arr[i];
			arr[i]=arr[minI];
			arr[minI]=temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
