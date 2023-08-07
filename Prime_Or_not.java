package Adding_getting_prime_or_not;

import java.util.Scanner;
public class Prime_Or_not {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		String s = sc.nextLine();
		int c=Integer.parseInt(s),d=0,cou=0;
		int e=s.length();
		while(c>0) {
			d+=c%10;
			c/=10;	
		}
		System.out.println(d);
		for(int i=2;i<=d;i++)
		{
			if(d%i==0) {
				cou++;
			}
		}
		if(cou==1) {
			System.out.print("Prime");
		}
		else {
			String str1="";
			for(int i=0;i<e;i++) {
				str1=str1+s.charAt(i)+0;	
			}
			System.out.print(str1);

		}

	}
}
