package JavaLab;

public class pattern4 {
	public static void main(String[] args) {
		
    int n=5;
		for(int i=1;i<=n;i++) { // i=rows
			for(int j=1;j<=n-i;j++) { // j=spaces	
				System.out.print(" ");
	}
			for(int k=1;k<=2*i-1;k++) { // k=*

			System.out.print("k");
		}
		System.out.println();

}
}
}