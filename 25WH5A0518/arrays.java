package Arraya;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"sweety","chikky","charmi","minnu",};
		String[] array2 = {"archuu","jaya","chinnu","minnu"};
		int length1 = array1.length;
		int length2 = array2.length;
		for(int i=0;i<length1;i++) {
			for(int j=0;j<length2;j++) {
				if(array1[i] == array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
		System.out.println(" ");

	}

}
