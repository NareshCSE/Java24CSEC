package labexperiments;


public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ,j,k,n=5;
		for(i=1;i<=n;i++) {
			for(j=n-i;j>0;j--) {
				System.out.print("  ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
			
         }
	}
}


