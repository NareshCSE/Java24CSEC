package src;

public class q5 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,2,3,4};
		int i,j;
		
		for(i=0;i<arr1.length;i++) {
			for(j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[i]);
				}
			}
			

		}

	}

}
