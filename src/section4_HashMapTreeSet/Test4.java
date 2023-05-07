package section4_HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;

//모든 아나그램 찾기
//bacaAacba
//abc


public class Test4 {
	public int  solution(String sStr,String tStr) {
		
		int result = 0 ;
		
		char array[]= sStr.toCharArray();
		StringBuilder compareStr = new StringBuilder();
		
		for(int i =0 ; i<tStr.length() ; i++) {
			compareStr.append(array[i]);
		}
		if(isAnagram(compareStr.toString(), tStr)) {
			result ++;
		}
		
		
		for(int i = tStr.length(); i<array.length ; i++) {
			compareStr.deleteCharAt(0);
			compareStr.append(array[i]);
			
			if(isAnagram(compareStr.toString(), tStr)) {
				result ++;
			}
		}
		 
		return result;
	}
	
	public boolean isAnagram(String compareStr, String tStr) {

	    HashMap<Character, Integer> map = new HashMap<>();
	    
	    for (char x : compareStr.toCharArray()) {
	      map.put(x, map.getOrDefault(x, 0) + 1);
	    }
	    for (char x : tStr.toCharArray()) {
	      if(!map.containsKey(x) || map.get(x)==0) return false;
	      map.put(x, map.get(x) - 1);
	    }

	    return true;
	  }
	
	
	
	public static void main(String[] args) {
		Test4 main = new Test4();
		
		Scanner in=new Scanner(System.in);
		
		String sStr = in.nextLine();
		String tStr = in.nextLine();
		
		
		System.out.println(main.solution(sStr,tStr));
		
	}

}
