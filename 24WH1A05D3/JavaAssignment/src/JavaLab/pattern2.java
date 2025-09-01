package JavaLab;
public class pattern2 {
	
	public static void main(String[] args) {

				//pattern 4.b
				//     *
				//    **
				//   ***
		       //   ****
		       //  *****

				for(int i=1;i<=5;i++) { // i=rows
					for(int j=1;j<=5-i;j++) { // j=spaces	
						System.out.print(" ");
			}
					for(int k=1;k<=i;k++) { // k=*

					System.out.print("*");
				}
				System.out.println();

		}

		}

		}



