package InfosysGrooming;

import java.util.Scanner;

public class FindCommanElements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		int arr2[] = new int[5];

		for (int i = 0; i <= 4; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i <= 4; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.print("[");
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i]);

					if (i != arr2.length-1) {
						System.out.print(",");
						break;
					}
				}
			}
		}
		System.out.print("]");
	}
}
