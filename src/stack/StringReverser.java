package stack;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input){
       char[] array= input.toCharArray();
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<array.length;i++){
            stack.push(array[i]);
        }
        StringBuffer reverse= new StringBuffer();
        while(!stack.empty()){
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
    public static void main(String[] args) {
        StringReverser rv= new StringReverser();
        String input="programming";
        System.out.println("Reverse is: "+rv.reverse(input));
    }
}
