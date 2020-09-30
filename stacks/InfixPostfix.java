// Implement Stack using Array
// 1. Push 2. Pop 3. Peek 4. IsFull() 5. IsEmpty()
import java.util.Scanner;
import java.util.StringTokenizer;
class InfixPostfix{
    static int top = -1; // track of top value in Stack
    static int size = 0;
    static char[] stack = new char[10];  // initialize stack


    // function to convert infix to postfix
    static String infixToPostfix(String exp){
          // initializing empty String for result
          String result = new String("");
          for (int i = 0; i<exp.length(); ++i)
          {
             char c = exp.charAt(i);

             // If the scanned character is an operand, add it to output.
             if (Character.isLetterOrDigit(c))
                 result += c;

             // If the scanned character is an '(', push it to the stack.
             else if (c == '(')
                       push(c);

           // If the scanned character is an ')', pop and output from the stack
           // until an '(' is encountered.
           else if (c == ')')
           {
               while (!isEmpty() && peek() != '(')
                   result += pop();

               if (!isEmpty() && peek() != '(')
                   return "Invalid Expression"; // invalid expression
               else
                   pop();
           }
           else // an operator is encountered
           {
               while (!isEmpty() && Prec(c) <= Prec(peek())){
                   if(peek() == '(')
                       return "Invalid Expression";
                   result += pop();
               }
               push(c);
           }
    }
    // pop all the operators from the stack
        while (!isEmpty()){
            if(peek() == '(')
                return "Invalid Expression";
            result += pop();
        }
        return result;
  }
  // function to check and return the precedence of a given operator
  static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;

        case '*':
        case '/':
            return 2;

        case '^':
            return 3;
        }
        return -1;
    }

    // Insertion into Stack
    static void push(char data){
          // check for overflow conditoin
          if(isFull()){
              System.out.println("Overflow!!! No more space left...!");
          }
          else{
                top = top+1;
                stack[top] = data;
          }
    }

    // Deletion from Stack
    static char pop(){
        if(isEmpty()){
            System.out.println("Underflow!!!... Stack is Empty!");
            return '\0';
        }
        else{
            char temp = stack[top];
            top = top-1;
            return temp;
        }
    }

    // Peek element from Stack
    static char peek(){
        if(isEmpty()){
          System.out.println("Underflow!!!... Stack is Empty!");
          return '\0';
        }
        else
            return stack[top];
    }

    // Overflow condition
    static boolean isFull(){
        if(stack.length <= top)
          return true;
        else
          return false;
    }

    // Underflow condition
    static boolean isEmpty(){
        if(top < 0)
          return true;
        else
          return false;
    }

    static void printStack(){
      System.out.print("[");
      for(int i = top; i >= 0; i--){
            System.out.print(pop()+" ");
      }
      System.out.print("]");
    }

    public static void main(String[] args){
        // String exp = "a+b*(c^d-e)^(f+g*h)-i";
        String exp = "a+b*c";

        System.out.println(infixToPostfix(exp));

    }
}
