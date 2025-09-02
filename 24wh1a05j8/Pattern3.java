package ass1;

public class Pattern3 {

	public static void main(String[] args) {
	int n=9,i,j,k,l;
	for(i=1;i<=n/2;i++) {
		for(j=n/2;j>i;j--) {
			System.out.print("\t");
		}
		for(k=1;k<=i;k++) {
			System.out.print("*\t");
		}
		for(l=1;l<i;l++) {
			System.out.print("*\t");
		}
		System.out.println("\n");
	}



	}


}
