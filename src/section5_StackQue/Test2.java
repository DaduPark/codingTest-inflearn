package section5_StackQue;

import java.util.Scanner;
import java.util.Stack;

public class Test2 {
	public String  solution(String str ) {
		Stack<Character> stack = new Stack<>();
		
		for(char strOne : str.toCharArray()) {
			
			if(strOne!=')') {
				stack.push(strOne);
			}else {
				stackPop(stack);
			}
		}
		
		return stackToStr(stack);
	}
	void stackPop(Stack<Character> stack ) {
		
		while(true) {
			
			if(stack.peek()=='(') {
				stack.pop();
				break;
			}
			
			stack.pop();
		}
		
	}
	
	public String stackToStr(Stack<Character> stack) {
		
		StringBuilder str = new StringBuilder();
		while(!stack.isEmpty()) {
			str.append(stack.pop());
		}

		return str.reverse().toString();
	}
	
	
	
	
	public static void main(String[] args) {
		Test2 main = new Test2();
		
		Scanner in=new Scanner(System.in);
		
		String str = in.nextLine();
		
		
		System.out.println(main.solution(str));
		
	}

}
