
public class pattern3 {

	public static void main(String[] args) {
	int n=5;int i;int j;
	for(i=1;i<=n;i++) {
		for(j=i;j<=n;j++) {
			System.out.print("  ");
		}
		for(j=1;j<=(2*i-1);j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(i=n-1;i>=1;i--) {
		for(j=n;j>=i;j--) {
			System.out.print("  ");
		}
		for(j=1;j<=(2*i-1);j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}

}
