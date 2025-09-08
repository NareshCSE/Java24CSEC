package javaprograms;

public class removedublicates_array{
	public static void main(String args[])
	{
		int[] arr={12,9,4,6,8,9};
		int length=arr.length;
		int[] temp=new int[length];
		int newLength = 0;
		for(int i = 0; i < length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < newLength; j++) {

	                if (arr[i] == temp[j]) {

	                    isDuplicate = true;

	                    break;}}
	            if (!isDuplicate) {

	                temp[newLength] = arr[i];
	                newLength++;

	            } }
		for(int i=0;i<newLength;i++)
		{
			System.out.println(temp[i]);
		}
		
		

	    }
}




