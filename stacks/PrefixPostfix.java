// Java implementation to convert Prefix expression into Postfix expression
// E.g.: Prefix = "+AB" --> Postfix = "AB+"
class PrefixPostfix{
  static int top = -1; // track of top value in Stack
  static int size = 0;
  static String[] stack = new String[10];  // initialize stack

  // function to convert prefix expression into postfix expression
    static String preToPost(String exp){
        int length = exp.length();

        // start scanning characters from left to right
        for(int i = length-1; i >= 0; i--){
             // if the token is a letter/digit
             if(Character.isLetterOrDigit(exp.charAt(i)))
                   push(exp.charAt(i)+"");
            // token is an operator
            else{
                  String op1 = pop();     // pop the first operand
                  String op2 = pop();    // pop the second operand
                  String result = op1+op2+exp.charAt(i);    // place the operator after two operands
                  push(result);
            }
        }
        return peek();
    }

    // Insertion into Stack
    static void push(String data){
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
    static String pop(){
        if(isEmpty()){
            System.out.println("Underflow!!!... Stack is Empty!");
            return " ";
        }
        else{
            String temp = stack[top];
            top = top-1;
            return temp;
        }
    }

    // Peek element from Stack
    static String peek(){
        if(isEmpty()){
          System.out.println("Underflow!!!... Stack is Empty!");
          return " ";
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
        // initial prefix expression
        String pre = "*-A/BC-/AKL";
        System.out.println(preToPost(pre));
    }
}
