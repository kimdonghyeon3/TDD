import java.util.Stack;
import java.util.StringTokenizer;

public class Calculator {
    public static int add(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    public static int subtract(String s) {

        String[] sBits = s.split(" - ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }

    public static int multiply(String s) {

        String[] sBits = s.split(" \\* ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 * no2;
    }

    public static int divide(String s) {
        String[] sBits = s.split(" / ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 / no2;
    }

    public static int operation(String s) {
        s = s.replaceAll(" ", "");
        StringTokenizer st = new StringTokenizer(s, "+*/-()",true);
        Stack<String> stack = new Stack<>();

        while(st.hasMoreTokens()){
            String str = st.nextToken();

            if(str.equals("(") || str.equals("*") || str.equals("/") || str.equals("+") || str.equals("-")){        //여는괄호 및 연산자가 올경우
                stack.push(str);
            }else if(str.equals(")")){

                int num = Integer.parseInt(stack.pop());

                while(true){        //+, -연산을 실행해 준다. ( "("가 나올 때까지)
                    if(stack.peek().equals("+")){
                        stack.pop();
                        num += Integer.parseInt(stack.pop());
                    }else if(stack.peek().equals("-")){
                        stack.pop();
                        num -= Integer.parseInt(stack.pop());
                    }else if(stack.peek().equals("(")){
                        stack.pop();
                        break;
                    }
                }
                stack.push(String.valueOf(num));

            }else{                      //숫자가 올경우우
                int num = Integer.parseInt(str);
                if(!stack.isEmpty()){
                    if(stack.peek().equals("*")){       // * /를 진행해준다.
                        stack.pop();
                        num *= Integer.parseInt(stack.pop());
                    }else if(stack.peek().equals("/")){
                        stack.pop();
                        num = Integer.parseInt(stack.pop())/num;
                    }
                }
                stack.push(String.valueOf(num));
            }
       }

        Stack<String> stack1 = new Stack<>();
        while(!stack.isEmpty())
            stack1.push(stack.pop());

        int result = Integer.parseInt(stack1.pop());

        while(!stack1.isEmpty()) {
            if (stack1.peek().equals("+")) {
                stack1.pop();
                result += Integer.parseInt(stack1.pop());
            } else if (stack1.peek().equals("-")) {
                stack1.pop();
                result -= Integer.parseInt(stack1.pop());
            }
        }

        return result;
        }
}