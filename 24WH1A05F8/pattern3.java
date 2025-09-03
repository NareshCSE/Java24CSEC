import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i;
        int j;
        int k;
    
        for(i=1;i<=N;i++){
            for(j=1;j<=N-i;j++){
                System.out.print(" ");
            }
                for(k=1;k<=2*i-1;k++){
                    System.out.print("*");
                    
                }
                System.out.println();
        }
        for(  i=N-1;i>=1;i--){
            for(  j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
               System.out.print("*");
            }
            System.out.println();
        }
        
	}



	}


