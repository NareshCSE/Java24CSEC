package file.javac;


public class Matmul {

	public static void main(String[] args) {
		int[][] array1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] array2= {{9,8,7},{6,5,4},{3,2,1}};
		int[][] matmul= new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					matmul[i][j]+=array1[i][k]*array2[k][j];
				}
			}
		}
		System.out.println("the multiplication of the array1 and array2 is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matmul[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

}


public class Matmul {

	public static void main(String[] args) {
		int[][] array1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] array2= {{9,8,7},{6,5,4},{3,2,1}};
		int[][] matmul= new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					matmul[i][j]+=array1[i][k]*array2[k][j];
				}
			}
		}
		System.out.println("the multiplication of the array1 and array2 is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matmul[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

}

