package Practicejava;

public class patterns4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=(5-i);j>0;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k + " ");
			}
			for(int l=(i-1);l>0;l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}
}