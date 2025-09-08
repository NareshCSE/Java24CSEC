package labprograms;

public class StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr1[]= {"vinnu","jack","rose","lotus"};
		String arr2[]= {"rose","jasmine","lilly"};
		for(String i: arr1) {
			for(String j: arr2) {
				if (i==j) {
					System.out.print(j);
				}
			}
		}


	}

}
