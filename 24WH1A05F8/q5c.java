package src;

public class q5c {

	public static void main(String[] args) {
		String[] arr1= {"apple","banana","orange"};
		String[] arr2= {"orange","mango","apple"};
		 int i,j;
		 for(i=0;i<arr1.length;i++) {
			 for(j=0;j<arr2.length;j++){
				 if(arr1[i]==arr2[j]) {
					 System.out.println(arr1[i]);
				 }
			 }
			 
		 }
		
	
	}
}
