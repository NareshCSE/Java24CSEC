package javaprograms;

public class commonelement_array {

	public static void main(String[] args) {
		String[] array1= {"siri","dhana","sathvi"};
		String[] array2= {"rohini","dhana","siri"};
		int length1=array1.length;
		int length2=array2.length;
		
		for(int i=0;i<length1;i++)
		{
			for(int j=0;j<length2;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
					break;
				}
			}
		}

	}

}
