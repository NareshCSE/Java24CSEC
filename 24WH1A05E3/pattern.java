package assignments;

public class pattern {

	public static void main(String[] args) {
		int n=5;
		int i=1,j=1,k=j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(k=j;k<=(n+i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=4;i++) {
			System.out.print(" ");
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(k=j;k<=(2*4-i);k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
