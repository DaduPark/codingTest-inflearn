package section4_HashMapTreeSet;

import java.util.Arrays;
import java.util.Scanner;

//AbaAeCe
//baeeACA

public class Test2 {
	public String  solution(String str1, String str2) {
		
		 char[] strArray1 = str1.toCharArray();
		 char[] strArray2 = str2.toCharArray();
		 
		 Arrays.sort(strArray1);
		 Arrays.sort(strArray2);
		 
		 
		 
		 for(int i = 0 ; i<strArray1.length ; i++) {
			 if(strArray1[i] != strArray2[i]) {
				 return "NO";
			 }
		 }
		
		return "YES";
	}
	
	
	public static void main(String[] args) {
		Test2 main = new Test2();
		
		Scanner in=new Scanner(System.in);
		
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		
		System.out.println(main.solution(str1, str2));
		
	}

}
