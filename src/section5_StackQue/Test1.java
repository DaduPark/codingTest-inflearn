package section5_StackQue;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {
	//올바른 괄호 ex) (()(()))(() =>  NO / ()()() => YES
	public String  solution(String str ) {
		Stack<Character> stack = new Stack<>();
		
		for(char strOne : str.toCharArray()) {
			
			if(strOne!=')') {
				stack.push(strOne);
			}else {
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
			
		}
		
		if(stack.isEmpty()) {
			return "YES";
		}
		
		return "NO";
	}
	
	
	public String stackToStr(Stack<Character> stack) {
		
		StringBuilder str = new StringBuilder();
		while(!stack.isEmpty()) {
			str.append(stack.pop());
		}

		return str.reverse().toString();
	}
	
	
	
	
	public static void main(String[] args) {
		Test1 main = new Test1();
		
		Scanner in=new Scanner(System.in);
		
		String str = in.nextLine();
		
		
		System.out.println(main.solution(str));
		
	}

}
