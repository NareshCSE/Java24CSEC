package src;

public class q7 {

    public static void main(String[] args) {
        String str = "maam";
        String reversed = "";

 
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
            
        }

    
        if  (str.equals(reversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

	
	}








