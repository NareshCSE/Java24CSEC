package labprograms;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,2,2,4,5};
       for(int i=0;i<arr.length;i++) {
    	   for(int j=i+1;j<arr.length;j++) {
    	   if (arr[i]==arr[i+1]) {
    		   System.out.println(arr[i]+" ");
    	   }
         }
       }
	}

}
