import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		// Stack is a LIFO structure (Last In First Out)
		// push() adds to the top of the stack
		// pop() removes from the top of the stack
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.isEmpty()); //isEmpty() returns true if stack is empty and false otherwise
		
		stack.push("Overwatch");
		stack.push("Tekken 7");
		stack.push("Final Fantasy VII Remake");
		stack.push("Sekiro: Shadows Die Twice");
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek()); //peek() returns the top element without removing it from the stack
		
		System.out.println(stack.search("Overwatch")); //search() returns the index of the searched element in the stack or -1 if element is not found
		
		
		

	}

}
