package section4_HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
	public char  solution(String str ) {
		
		char result = 'a';
		
		HashMap<Character, Integer> resultMap = new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			if(resultMap.containsKey(c)) {
				resultMap.put(c, resultMap.get(c)+1);
			}else {
				resultMap.put(c, 1);
			}
		}
		
		int maxVal = 0;
		
		for ( char key : resultMap.keySet() ) {
			if(resultMap.get(key)>maxVal) {
				result = key;
				maxVal = resultMap.get(key);
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Test1 main = new Test1();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		String str = in.nextLine();
		
		
		System.out.println(main.solution(str));
		
	}

}
