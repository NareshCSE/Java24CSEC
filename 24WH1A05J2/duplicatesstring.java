package javac;

public class duplicatesstring {
	public static void main(String[] args) {
		        String s = "ad%#2373#@";
		        boolean[] seen = new boolean[10];
		        char[] d = new char[10];
		        int c = 0;

		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);
		            if (ch >= '0' && ch <= '9' && !seen[ch - '0']) {
		                d[c++] = ch;
		                seen[ch - '0'] = true;
		            }
		        }
		        for (int i = 0; i < c - 1; i++)
		            for (int j = 0; j < c - i - 1; j++)
		                if (d[j] < d[j + 1]) {
		                    char t = d[j];
		                    d[j] = d[j + 1];
		                    d[j + 1] = t;
		                }
		        int evenIndex = -1;
		        for (int i = c - 1; i >= 0; i--) {
		            if ((d[i] - '0') % 2 == 0) {
		                evenIndex = i;
		                break;
		            }
		        }
		        if (evenIndex == -1) {
		            System.out.println(-1);
		            return;
		        }
		        for (int i = 0; i < c; i++)
		            if (i != evenIndex) System.out.print(d[i]);
		        System.out.println(d[evenIndex]);
		    }

}
